package tugas.selenium.amazon;

import org.testng.annotations.*;

import tugas.selenium.DriverSingleton;
import tugas.selenium.pages.FormAmazon;
import tugas.selenium.util.Constant;

import org.openqa.selenium.*;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

public class TestFormAmazon {
	public static WebDriver driver;
	private FormAmazon formAmazon;
	
	
	@BeforeMethod
	public void pageObject() throws AWTException {
		DriverSingleton.getInstance(Constant.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL_AMAZON_STRING);
		formAmazon = new FormAmazon();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		System.out.println();
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testInputAll() throws AWTException, InterruptedException {
		System.out.println("Input Semua Field");
		System.out.println("======================");
		formAmazon.isiNamaDepan("Nico");
		formAmazon.isiNamaBelakang("Ardy");
		formAmazon.genderMale();
		formAmazon.isiDatePicker();
		formAmazon.isiAlamat("Pesakih");
		formAmazon.isiEmail("nikoko@gmail.com");
		formAmazon.isiPassword("123123123");
		formAmazon.isiCompany("Nexsoft");
		formAmazon.isiRoleManager();
		formAmazon.isiExpectationTeamwork();
		formAmazon.clickExperiment();
		formAmazon.clickProject();
		formAmazon.isiComment("Bismillah bisa");
		formAmazon.klikSubmit();
		assertEquals(formAmazon.getSubmit(), "Successfully submitted!");
		System.out.println("Data Submited");
	}
}
