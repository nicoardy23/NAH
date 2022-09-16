package cucumber.framework.features.nopc;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.hooks.nopc.LoginHooks;
import cucumber.page.nopc.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.framework.utils.Constants;

public class LoginFeatures {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public LoginFeatures()
	{
		driver = LoginHooks.driver;
		extentTest = LoginHooks.extentTest;
	}
	
	@When("User go to Web HRM")
	public void user_go_to_Web_HRM() {
		driver.get(Constants.URL_NOPC);
		extentTest.log(LogStatus.PASS, "User go to Web HRM");
		
	}
	
	@And("User enter username password invalid")
	public void user_enter_username_password_invalid() {
		loginPage.login("admin@yourstore.coma", "admin12345");
		extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}
	
	@And("User click button login")
	public void user_click_button_login() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login");
	}
	
	@Then("User invalid credentials")
	public void user_invalid_credentials() {
		assertEquals(loginPage.msgInvalid(), "Invalid credentials");
		extentTest.log(LogStatus.PASS, "User invalid credentials");
	}
	
	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginPage.login("admin@yourstore.com", "admin1234");
		extentTest.log(LogStatus.PASS, "User enter username password valid");
	}
	
	@And("User click button login valid")
	public void user_click_button_login_valid() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click button login valid");
	}
	
	@Then("User valid credentials")
	public void user_valid_credentials() {
		assertEquals(loginPage.getTxtEmpInfo(), "Dashboard");
		assertTrue(loginPage.getTxtEmpInfo().contains("Dashboard"));
		extentTest.log(LogStatus.PASS, "User valid credentials");
	}
	
}