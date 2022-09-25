package ujian.ujiankelima.cucumber;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import latihan.factoryobject.util.Constant;
import tugas.cucumber.outlinescenario.OutlineTestHooks;
import ujian.ujiankelima.selenium.AccountShopDemoQA;

public class LoginShopDemoQA {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static AccountShopDemoQA acc = new AccountShopDemoQA();
	
	public LoginShopDemoQA() {
		driver = ShopDemoQAHooks.driver;
		extentTest = ShopDemoQAHooks.extentTest;
	}
	
	@When("User go to web Login")
	public void user_go_to_web_login() {
		driver.get(Constant.URL_SHOP_DEMO_QA_ACC);
		extentTest.log(LogStatus.PASS, "User go to web Login");
	}

	@When("^User input (.*) (.*) login$")
	public void user_input_username_password_login(String username, String pass) {
		acc.isiUsernameLogin(username);
		acc.isiPasswordLogin(pass);
	    extentTest.log(LogStatus.PASS, "user_input_username_password_login");
	}
	
	@When("User click button login")
	public void user_click_button_login() {
	    acc.klikLogin();
	    extentTest.log(LogStatus.PASS, "User click button login");
	}

	@Then("User loged in")
	public void user_loged_in() {
		assertTrue(acc.getValidLoginBlock().contains("ERROR"));
//		assertTrue(acc.getValidLogin().contains("Hello"));
		extentTest.log(LogStatus.PASS, "user_loged_in");
	}
}
