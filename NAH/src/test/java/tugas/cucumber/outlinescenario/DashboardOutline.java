package tugas.cucumber.outlinescenario;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ujian.ujiankeempat.nopcommerce.AddCustomer;

public class DashboardOutline {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private AddCustomer dashboardPage = new AddCustomer();
	
	public DashboardOutline() {
		driver = OutlineTestHooks.driver;
		extentTest = OutlineTestHooks.extentTest;
	}
	
	@When("User click menu Dashboard Outline NOPCommerce")
	public void user_click_menu_dashboard_outline_nop_commerce() {
		dashboardPage.klikPlus();
	    extentTest.log(LogStatus.PASS, "User click menu Dashboard Outline NOPCommerce");
	}

	@Then("User on menu Dashboard NOPCommerce")
	public void user_on_menu_dashboard_nop_commerce() {
		assertEquals(dashboardPage.getValidPlus(), "Welcome to");
		extentTest.log(LogStatus.PASS, "User on menu Dashboard NOPCommerce");
	}
}
