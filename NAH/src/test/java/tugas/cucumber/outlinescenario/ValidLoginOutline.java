package tugas.cucumber.outlinescenario;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.util.Constant;
import ujian.ujiankeempat.nopcommerce.LoginNopCommerce;

public class ValidLoginOutline {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginNopCommerce loginPage = new LoginNopCommerce();
	
	public ValidLoginOutline() {
		driver = OutlineTestHooks.driver;
		extentTest = OutlineTestHooks.extentTest;
	}
	
	@When("User go to web NOPCommerce outline")
	public void user_go_to_web_nop_commerce_outline() {
		driver.get(Constant.URL_NOPCOMMERCE);
		extentTest.log(LogStatus.PASS, "User go to web NOPCommerce outline");
	}

	@When("Enter valid email and password outline")
	public void enter_valid_password_and_email_outline() {
		loginPage.clearAll();
	    loginPage.isiEmail("admin@yourstore.com");
	    loginPage.isiPassword("admin");
	    extentTest.log(LogStatus.PASS, "Enter valid email and password outline");
	}

	@When("Click button login valid outline")
	public void click_button_login_valid_outline() {
		loginPage.klikSubmit();
		extentTest.log(LogStatus.PASS, "Click button login valid outline");
	}

	@Then("Check valid user credentials")
	public void check_valid_user_credentials() {
		assertEquals(loginPage.getValidLogin(), "Dashboard");
		extentTest.log(LogStatus.PASS, "Check valid user credentials");
	}
}
