package latihan.factoryobject;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.factoryobject.pages.LoginPage;
import latihan.factoryobject.util.Constants;

public class TestLogin {
	public static WebDriver driver;
	private LoginPage loginPage;
	
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
//	@AfterClass
//	public void closeBrowser() throws InterruptedException {
//		Thread.sleep(5000);
//		DriverSingleton.closeObjectInstance();
//	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		System.out.println();
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	
	@Test
	public void testValidLogin() {
		System.out.println("Proses login");
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
	}
	
	@Test
	public void testValidLoginUsernameCapital() {
		System.out.println();
		loginPage.login("ADMIN", "admin123");
		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	@Test
	public void testInValidLoginCapitalPass() {
		System.out.println();
		loginPage.login("Admin", "ADMIN123");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testInValidLoginNullUser() {
		System.out.println();
		loginPage.login("", "admin123");
		assertEquals(loginPage.getTxtRequired(), "Required");
	}
	
	@Test
	public void testInValidLoginNullPass() {
		System.out.println();
		loginPage.login("Admin", "");
		assertEquals(loginPage.getTxtRequired(), "Required");
	}
	
	@Test
	public void testInValidLoginNullAll() {
		System.out.println();
		loginPage.login("", "");
		assertEquals(loginPage.getTxtRequired(), "Required");
	}
	
	@Test
	public void testInValidLoginFalsePass() {
		System.out.println();
		loginPage.login("Admin", "ads");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
	
	@Test
	public void testInValidLoginFalseUser() {
		System.out.println();
		loginPage.login("Adminnico", "admin123");
		assertEquals(loginPage.getTxtInvalidLogin(), "Invalid credentials");
	}
}
