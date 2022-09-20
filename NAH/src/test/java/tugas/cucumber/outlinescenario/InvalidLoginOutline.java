package tugas.cucumber.outlinescenario;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.util.Constant;
import ujian.ujiankeempat.nopcommerce.LoginNopCommerce;

public class InvalidLoginOutline {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginNopCommerce loginPage = new LoginNopCommerce();
	
	public InvalidLoginOutline() {
		driver = OutlineTestHooks.driver;
		extentTest = OutlineTestHooks.extentTest;
	}
	
	@When("Browser open web NOPCommerce outline")
	public void browser_open_web_nop_commerce_outline() {
		driver.get(Constant.URL_NOPCOMMERCE);
		extentTest.log(LogStatus.PASS, "Browser open web NOPCommerce outline");
	}

	@When("^Enter invalid (.*) and (.*) outline$")
	public void enter_invalid_email_and_password_outline(String email , String password) {
		System.out.println("user_enter_username_password_invalid uName : "+email+" pwd : "+password);
		loginPage.clearAll();
	    loginPage.isiEmail(email);
	    loginPage.isiPassword(password);
	    extentTest.log(LogStatus.PASS, "enter_invalid_email_and_password_outline");
	}

	@When("Click button login outline")
	public void click_button_login_outline() {
		loginPage.klikSubmit();
		extentTest.log(LogStatus.PASS, "Click button login outline");
	}

	@Then("Check credentials invalid online")
	public void check_credentials_invalid_online() {
		assertEquals(loginPage.getInvalidPassword(), "The credentials provided are incorrect");
		extentTest.log(LogStatus.PASS, "Check credentials invalid online");
	}
}
