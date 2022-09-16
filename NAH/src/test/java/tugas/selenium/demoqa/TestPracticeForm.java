package tugas.selenium.demoqa;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import tugas.selenium.DriverSingleton;
import tugas.selenium.pages.PracticeForm;
import tugas.selenium.pages.TextBox;
import tugas.selenium.util.Constant;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TestPracticeForm {
	public static WebDriver driver;
	private PracticeForm practiceForm;;
	
	
	@BeforeMethod
	public void pageObject() throws AWTException {
		DriverSingleton.getInstance(Constant.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL_DEMOQA);
		practiceForm = new PracticeForm();
		practiceForm.zoomOut();
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
		practiceForm.isiNamaDepan("Nico");
		practiceForm.isiNamaBelakang("Ardy");
		practiceForm.isiEmail("kokoni@gmail.com");
		practiceForm.genderMale();
		practiceForm.isiNumber("2423213209");
		practiceForm.isiDatePicker();
		practiceForm.isiSubject("computer");
		Thread.sleep(1000);
		practiceForm.isiHobi();
		practiceForm.isiHobiTiga();
		practiceForm.isiPitcureUpload();
		practiceForm.isiAlamat("Jalan Pandean");
		practiceForm.pilihCountry();
		practiceForm.klikSubmit();
		assertEquals(practiceForm.getValidName(), "Nico Ardy");
		System.out.println("Nama valid");
		assertEquals(practiceForm.getValidEmail(), "kokoni@gmail.com");
		System.out.println("Email valid");
		assertEquals(practiceForm.getValidPhone(), "2423213209");
		System.out.println("Phone number valid");
	}
}
