package latihan.cucumber.cobacoba;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tugas.selenium.util.Constant;
import ujian.ujiankeempat.nopcommerce.LoginNopCommerce;

public class TestCobaCoba {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginNopCommerce loginPage = new LoginNopCommerce();
	
	public TestCobaCoba() {
		driver = SceneFirstHooks.driver;
		extentTest = SceneFirstHooks.extentTest;
	}
	
	@When("User go to Web NOPC")
	public void user_go_to_web_nopc() {
		driver.get(Constant.URL_NOPCOMMERCE);
		extentTest.log(LogStatus.PASS, "User go to Web NOPC");
	}

	@And("User enter username and password invalid")
	public void user_enter_username_and_password_invalid() {
		loginPage.clearAll();
	    loginPage.isiEmail("admin@yourstore.com");
	    loginPage.isiPassword("admin1");
	    extentTest.log(LogStatus.PASS, "User enter username password invalid");
	}

	@And("User click login button")
	public void user_click_login_button() {
		loginPage.klikSubmit();
		extentTest.log(LogStatus.PASS, "User click login button");
	}

	@Then("User invalid")
	public void user_invalid() {
		assertEquals(loginPage.getInvalidPassword(), "The credentials provided are incorrect");
		extentTest.log(LogStatus.PASS, "User invalid");
	}

	@When("User enter username and password valid")
	public void user_enter_username_and_password_valid() {
		loginPage.clearAll();
		loginPage.isiEmail("admin@yourstore.com");
		loginPage.isiPassword("admin");
		extentTest.log(LogStatus.PASS, "User enter username & password valid");
	}

	@And("User click login button valid")
	public void user_click_login_button_valid() {
		loginPage.klikSubmit();
		extentTest.log(LogStatus.PASS, "User click login button");
	}

	@Then("User valid")
	public void user_valid() {
		assertEquals(loginPage.getValidLogin(), "Dashboard");
		extentTest.log(LogStatus.PASS, "User valid");
	}
}
