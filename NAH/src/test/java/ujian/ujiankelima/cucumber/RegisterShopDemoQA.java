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

public class RegisterShopDemoQA {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private static AccountShopDemoQA acc = new AccountShopDemoQA();
	
	public RegisterShopDemoQA() {
		driver = ShopDemoQAHooks.driver;
		extentTest = ShopDemoQAHooks.extentTest;
	}
	
	@When("User go to web registration")
	public void user_go_to_web_registration() {
		driver.get(Constant.URL_SHOP_DEMO_QA_ACC);
		extentTest.log(LogStatus.PASS, "User go to web registration");
	}

	@When("^User input (.*) (.*) and (.*)$")
	public void user_input_username_email_and_password(String username, String email, String pass) {
		System.out.println("user_enter_username_password_invalid uName : "+username+" Email : "+email+" pwd : "+pass);
		acc.isiUsernameRegis(username);
		acc.isiEmailRegis(email);
		acc.isiPasswordRegis(pass);
	    extentTest.log(LogStatus.PASS, "user_input_username_email_and_password");
	}

	@When("User click button regrister")
	public void user_click_button_regrister() {
		acc.klikRegis();
		extentTest.log(LogStatus.PASS, "User click button regrister");
	}

	@Then("Account created")
	public void account_created() {
//		assertTrue(acc.getValidLoginBlock().contains("ERROR"));
//		assertTrue(acc.getValidRegis().contains("Your session has expired"));
		assertTrue(acc.getValidRegisError().contains("An account is already registered"));
		extentTest.log(LogStatus.PASS, "Account created");
	}
}
