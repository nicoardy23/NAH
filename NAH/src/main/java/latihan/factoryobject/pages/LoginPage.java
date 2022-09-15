package latihan.factoryobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.factoryobject.DriverSingleton;

public class LoginPage {
private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']")
	private WebElement txtEmployee;
	
	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement txtInvalidLogin;
	
	@FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
	private WebElement txtRequired;
	
	//Page Object
	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		btnLogin.click();
	}
	
	public String getTxtEmp() {
		return txtEmployee.getText();
	}
	
	public String getTxtInvalidLogin() {
		return txtInvalidLogin.getText();
	}
	
	public String getTxtRequired() {
		return txtRequired.getText();
	}
}
