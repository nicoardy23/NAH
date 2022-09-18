package ujian.ujiankeempat.nopcommerce;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import tugas.selenium.DriverSingleton;
import tugas.selenium.pages.PracticeForm;
import tugas.selenium.util.Constant;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TestNopCommerce {
	public static WebDriver driver;
	private LoginNopCommerce login;
	private AddCustomer add;
	
	
	@BeforeMethod
	public void pageObject() throws AWTException {
		DriverSingleton.getInstance(Constant.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL_NOPCOMMERCE);
		login = new LoginNopCommerce();
		add = new AddCustomer();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		System.out.println();
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}

  @Test(priority = 0)
  public void testValidLogin() {
	  login.clearAll();
	  login.isiEmail("admin@yourstore.com");
	  login.isiPassword("admin");
	  login.klikRemember();
	  login.klikSubmit();
	  assertEquals(login.getValidLogin(), "Dashboard");
	  System.out.println("======================Test Valid Login Successful======================");
  }
  
  @Test(priority = 1)
  public void testInvalidEmail() {
	  login.clearAll();
	  login.isiEmail("admin@yourstore.id");
	  login.isiPassword("admin");
	  login.klikRemember();
	  login.klikSubmit();
	  assertEquals(login.getInvalidEmail(), "No customer account found");
	  System.out.println("======================Test Invalid Email Successful======================");
  }
  
  @Test(priority = 2)
  public void testInvalidPassword() {
	  login.clearAll();
	  login.isiEmail("admin@yourstore.com");
	  login.isiPassword("bromas");
	  login.klikRemember();
	  login.klikSubmit();
	  assertEquals(login.getInvalidPassword(), "The credentials provided are incorrect");
	  System.out.println("======================Test Invalid Password Successful======================");
  }
  
  @Test(priority = 3)
  public void testNullEmail() {
	  login.clearAll();
	  login.isiPassword("admin");
	  login.klikRemember();
	  login.klikSubmit();
	  assertEquals(login.getNullEmail(), "Please enter your email");
	  System.out.println("======================Test Null Email Successful======================");
  }
  
  @Test(priority = 4)
  public void testAddCustomer() throws InterruptedException {
	  login.clearAll();
	  login.isiEmail("admin@yourstore.com");
	  login.isiPassword("admin");
	  login.klikRemember();
	  login.klikSubmit();
	  add.klikMenu();
	  add.klikCustomer();
	  add.tambahCustomer();
	  add.isiEmail("nicoardy23@gmail.com");
	  add.isiPassword("Nico23Ardy02");
	  add.isiFirstName("Nico");
	  add.isiLastName("Ardy");
	  add.klikGenderMale();
	  add.isiDOBManual("9/7/2004");
	  Thread.sleep(2000);
	  add.isiDOBDatepicker();
	  add.isiCompany("Nexsoft");
	  add.isiNewsLetter();
	  add.pilihNewsLetter();
	  add.pilihRole();
	  add.pilihRoleVendor();
	  add.isiVendor();
	  add.pilihVendorOne();
	  add.isiComment("No Comment");
	  add.klikSave(); //jika muncul alert "Email already exist", bisa ubah emailnya agar program dapat berjalan
	  add.cariEmail("nicoardy23@gmail.com");
	  add.klikSearchCustomer();
	  assertEquals(add.getValidEmail(), "nicoardy23@gmail.com"); 
	  System.out.println("======================Test Add New Customer Successful======================");
  }
}
