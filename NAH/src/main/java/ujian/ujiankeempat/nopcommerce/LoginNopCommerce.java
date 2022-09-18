package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.DriverSingleton;

public class LoginNopCommerce {
	private WebDriver driver;
	
	public LoginNopCommerce() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMe;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submit;

	@FindBy(xpath = "//h1[normalize-space()='Dashboard']")
	private WebElement validLogin;
	
	@FindBy(xpath = "//li[normalize-space()='No customer account found']")
	private WebElement invalidEmail;
	
	@FindBy(xpath = "//li[normalize-space()='The credentials provided are incorrect']")
	private WebElement invalidPassword;
	
	@FindBy(xpath = "//span[@id='Email-error']")
	private WebElement nullEmail;
	
	//Page Object
	public void clearAll() {
		email.clear();
		password.clear();
	}
	
	public void isiEmail(String mail) {
		email.click();
		email.clear();
		email.sendKeys(mail);
	}	

	public void isiPassword(String pass) {
		password.click();
		password.clear();
		password.sendKeys(pass);
	}
	
	public void klikRemember() {
		rememberMe.click();
	}
	
	public void klikSubmit() {
		submit.click();
	}
	
	public String getValidLogin() {
		return validLogin.getText();
	}
	
	public String getInvalidEmail() {
		return invalidEmail.getText();
	}
	
	public String getInvalidPassword() {
		return invalidPassword.getText();
	}
	
	public String getNullEmail() {
		return nullEmail.getText();
	}
}
