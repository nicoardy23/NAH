package latihan.selenium.demoqa;

import org.testng.annotations.*;

import tugas.selenium.DriverSingleton;
import tugas.selenium.pages.TextBox;
import tugas.selenium.util.Constant;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.*;

public class TestTextBox {
	public static WebDriver driver;
	private TextBox textBox;
	
	
	@BeforeMethod
	public void pageObject() throws AWTException {
		DriverSingleton.getInstance(Constant.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL_DEMOQA);
		textBox = new TextBox();
		textBox.zoomOut();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		System.out.println();
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testInputAll() {
		System.out.println("Input Semua Field");
		textBox.klikMenu();
		textBox.isiNama("Masno");
		textBox.isiEmail("sipaling@contoh.com");
		textBox.isiAlamatTerakhir("Jln Mangga");
		textBox.isiAlamatTetap("Jln Sawo");
		textBox.klikSubmit();
		assertTrue(textBox.getOutputName().contains("Masno"));
		assertTrue(textBox.getOutputEmail().contains("sipaling@contoh.com"));
		assertTrue(textBox.getOutputCurrent().contains("Jln Mangga"));
		assertTrue(textBox.getOutputPermanent().contains("Jln Sawo"));
	}
}
