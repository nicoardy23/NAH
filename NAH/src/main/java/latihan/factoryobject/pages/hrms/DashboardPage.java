package latihan.factoryobject.pages.hrms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.factoryobject.DriverSingleton;


public class DashboardPage {

	private WebDriver driver;
	
	public DashboardPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Dashboard']")
	private WebElement menuDashboard;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/h4")
	private WebElement txtDashboardPage;
	
	public void goToMenuDashboard() {
		menuDashboard.click();
	}
	
	public String getTxtDashboardPage() {
		return txtDashboardPage.getText();
	}
}