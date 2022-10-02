package remedial.remedialkeempat;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.factoryobject.DriverSingleton;
import latihan.factoryobject.util.Constant;
import latihan.factoryobject.utils.Utils;


public class AccountShopDemoQA {
	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY;
	
	public AccountShopDemoQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(linkText = "Dismiss")
	private WebElement dismissButton;
	
	@FindBy(linkText = "My Account")
	private WebElement accountWeb;
	
	@FindBy(id = "reg_username")
	private WebElement regUser;
	
	@FindBy(id = "reg_email")
	private WebElement regEmail;
	
	@FindBy(id = "reg_password")
	private WebElement regPass;
	
	@FindBy(name = "register")
	private WebElement regButton;
	
	@FindBy(xpath = "//div[@id='login']/p")
	private WebElement validReg;
	
	@FindBy(xpath = "//div[@id='primary']//li[1]")
	private WebElement validRegErr;

	@FindBy(id = "username")
	private WebElement loginUser;
	
	@FindBy(id = "password")
	private WebElement loginPass;

	@FindBy(id = "rememberme")
	private WebElement rememberButton;
	
	@FindBy(name = "login")
	private WebElement loginButton;
	
	@FindBy(xpath = "//article[@id='post-8']/div/div/div/p")
	private WebElement validLogin;
	
	@FindBy(xpath = "//div[@class='wp-die-message']")
	private WebElement validLoginBlock;

	//Page Object
	public void webAcc() {
		Utils.delay(2, strDelay);
		accountWeb.click();
	}
	
	public void isiUsernameRegis(String user) {
		Utils.delay(2, strDelay);
		regUser.sendKeys(user);
	}
	
	public void isiEmailRegis(String email) {
		Utils.delay(2, strDelay);
		regEmail.sendKeys(email);
	}
	
	public void isiPasswordRegis(String pass) {
		Utils.delay(2, strDelay);
		regPass.sendKeys(pass);
	}
	
	public void isiUsernameLogin(String user) {
		Utils.delay(2, strDelay);
		loginUser.sendKeys(user);
	}
	
	public void isiPasswordLogin(String pass) {
		Utils.delay(2, strDelay);
		loginPass.sendKeys(pass);
	}
	
	public void klikRegis() {
		Utils.delay(2, strDelay);
		regButton.click();
	}

	public void klikLogin() {
		Utils.delay(2, strDelay);
		loginButton.click();
	}

	public void klikDismiss() {
		Utils.delay(2, strDelay);
		dismissButton.click();
	}
	
	public String getValidRegis() {
		return validReg.getText();
	}
	
	public String getValidRegisError() {
		return validRegErr.getText();
	}
	
	public String getValidLogin() {
		return validLogin.getText();
	}
	
	public String getValidLoginBlock() {
		return validLoginBlock.getText();
	}
	
	public void zoomOut() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
}
