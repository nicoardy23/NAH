package latihan.factoryobject.pages.nopc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.factoryobject.DriverSingleton;
import latihan.factoryobject.util.Constant;
import latihan.factoryobject.utils.Utils;

public class LoginPage {

	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='Email']")
	//input[contains(@attr, 'value')]
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement msgError;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement valLogin;
	
	//scenario
	public void login(String username, String password) {
		this.username.clear();
		this.username.sendKeys(username);
		Utils.delay(1, strDelay);
		this.password.clear();
		this.password.sendKeys(password);
	}
	
	public void clickBtnLogin() {
		btnLogin.click();
	}
	
	//Actual
	public String msgInvalid() {
		return msgError.getText();
	}
	
	public String getTxtEmpInfo() {
		return valLogin.getText();
	}
	
}
