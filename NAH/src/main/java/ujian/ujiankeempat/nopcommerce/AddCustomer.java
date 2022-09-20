package ujian.ujiankeempat.nopcommerce;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import tugas.selenium.DriverSingleton;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class AddCustomer {
	private WebDriver driver;
	
	public AddCustomer() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(linkText = "Customers")
	private WebElement customerMenu;

	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Clear cache'])[1]/following::p[20]")
	private WebElement customer;
	
	@FindBy(xpath = "//h4[normalize-space()='Welcome to your store!']")
	private WebElement validPlus;
	
	@FindBy(xpath = "//i[@class='fas fa-plus']")
	private WebElement plus;
	
	@FindBy(linkText = "Add new")
	private WebElement addCustomer;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(xpath = "//div[@id='customer-info']/div[2]/div[5]/div[2]/div/div/label")
	private WebElement genderMale;
	
	@FindBy(xpath = "//div[@id='customer-info']/div[2]/div[5]/div[2]/div/div[2]/label")
	private WebElement genderFemale;
	
	@FindBy(id = "DateOfBirth")
	private WebElement dateOfBirth;
	
	@FindBy(xpath = "//div[@id='customer-info']/div[2]/div[6]/div[2]/span/span/span")
	private WebElement datePicker;
	
	@FindBy(id = "Company")
	private WebElement company;
	
	@FindBy(xpath = "//div[@id='customer-info']/div[2]/div[9]/div[2]/div/div/div/div")
	private WebElement newsLetter;

	@FindBy(xpath = "//ul[@id='SelectedNewsletterSubscriptionStoreIds_listbox']/li[2]")
	private WebElement testStoreTwo;
	
	@FindBy(xpath = "//div[@id='customer-info']/div[2]/div[10]/div[2]/div/div/div/div")
	private WebElement role;
	
	@FindBy(xpath = "//ul[@id='SelectedCustomerRoleIds_listbox']/li[5]")
	private WebElement roleVendor;

	@FindBy(id = "VendorId")
	private WebElement vendor;
	
	@FindBy(id = "AdminComment")
	private WebElement comment;
	
	@FindBy(name = "save")
	private WebElement saveButton;
	
	@FindBy(id = "SearchEmail")
	private WebElement searchEmail;

	@FindBy(id = "search-customers")
	private WebElement searchCustomer;
	
	@FindBy(xpath = "//td[normalize-space()='deepeshraj5009@gmail.com']")
	private WebElement foundEmailout;
	
	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr/td[2]")
	private WebElement foundEmail;

	//Page Object
	public void klikMenu() {
		customerMenu.click();
	}

	public void klikCustomer() {
		customer.click();
	}
	
	public void tambahCustomer() {
		addCustomer.click();
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
	
	public void isiFirstName(String first) {
		firstName.click();
		firstName.clear();
		firstName.sendKeys(first);
	}	

	public void isiLastName(String last) {
		lastName.click();
		lastName.clear();
		lastName.sendKeys(last);
	}

	public void klikGenderMale() {
		genderMale.click();
	}
	
	public void klikGenderFemale() {
		genderFemale.click();
	}
	
	public void isiDOBManual(String dob) {
		dateOfBirth.click();
		dateOfBirth.clear();
		dateOfBirth.sendKeys(dob);
	}	
	
	public void isiDOBDatepicker() throws InterruptedException {
		datePicker.click();
		Thread.sleep(500);
		driver.findElement(By.linkText("September 2004")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("Jan")).click();
		Thread.sleep(500);
		driver.findElement(By.linkText("9")).click();
	}
	public void isiCompany(String comp) {
		company.click();
		company.clear();
		company.sendKeys(comp);
	}
	
	public void isiNewsLetter() {
		newsLetter.click();
	}	
	
	public void pilihNewsLetter() {
		testStoreTwo.click();
	}
	
	public void pilihRole() {
		role.click();
	}
	
	public void pilihRoleVendor() {
		roleVendor.click();
	}
	
	public void isiVendor() {
		vendor.click();
	}

	public void pilihVendorOne() {
	  new Select(vendor).selectByVisibleText("Vendor 1");
	}
	
	public void isiComment(String comm) {
		comment.click();
		comment.clear();
		comment.sendKeys(comm);
	}	
	
	public void klikSave() {
		saveButton.click();
	}
	
	public void cariEmail(String mail) {
		searchEmail.click();
		searchEmail.clear();
		searchEmail.sendKeys(mail);
	}	
	
	public void klikSearchCustomer() {
		searchCustomer.click();
	}
	
	public void klikPlus() {
		plus.click();
	}
	
	public String getValidPlus() {
		return validPlus.getText();
	}
	
	public String getValidEmail() {
		return foundEmail.getText();
	}
	
	public String getValidEmailOut() {
		return foundEmailout.getText();
	}
}
