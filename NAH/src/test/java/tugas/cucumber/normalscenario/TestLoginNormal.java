package tugas.cucumber.normalscenario;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.util.Constant;
import ujian.ujiankeempat.nopcommerce.LoginNopCommerce;

public class TestLoginNormal {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginNopCommerce loginPage = new LoginNopCommerce();
	
	public TestLoginNormal() {
		driver = NormalTestHooks.driver;
		extentTest = NormalTestHooks.extentTest;
	}
	
	@When("User go to Web NOPCommerce")
	public void user_go_to_web_nop_commerce() {
		driver.get(Constant.URL_NOPCOMMERCE);
		extentTest.log(LogStatus.PASS, "User go to Web NOPCommerce");
	}

	@And("User enter username password inv")
	public void user_enter_username_password_inv() {
		loginPage.clearAll();
	    loginPage.isiEmail("admin@yourstore.com");
	    loginPage.isiPassword("admin1");
	    extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}

	@And("User click login inv")
	public void user_click_login_inv() {
		loginPage.klikSubmit();
		extentTest.log(LogStatus.PASS, "User click login button");
	}

	@Then("User invalid login")
	public void user_invalid_login() {
		assertEquals(loginPage.getInvalidPassword(), "The credentials provided are incorrect");
		extentTest.log(LogStatus.PASS, "User invalid");
	}

	@When("User enter username password val")
	public void user_enter_username_password_val() {
		loginPage.clearAll();
		loginPage.isiEmail("admin@yourstore.com");
		loginPage.isiPassword("admin");
		extentTest.log(LogStatus.PASS, "User enter username & password valid");
	}

	@And("User click login val")
	public void user_click_login_val() {
		loginPage.klikSubmit();
		extentTest.log(LogStatus.PASS, "User click login button");
	}

	@Then("User valid login")
	public void user_valid_login() {
		assertEquals(loginPage.getValidLogin(), "Dashboard");
		extentTest.log(LogStatus.PASS, "User valid");
	}
}
