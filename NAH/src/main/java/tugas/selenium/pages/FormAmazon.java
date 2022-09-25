package tugas.selenium.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import latihan.factoryobject.utils.Utils;
import tugas.selenium.DriverSingleton;
import tugas.selenium.util.Constant;

public class FormAmazon {
	private String strDelay = Constant.GLOB_PARAM_DELAY;
	private WebDriver driver;
	
	public FormAmazon() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
//	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
//	private WebElement menu;
	
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;

	@FindBy(name = "gender")
	private WebElement genderMale;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[2]/input")
	private WebElement genderFemale;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[3]/input")
	private WebElement genderOther;
	
	@FindBy(id = "dob")
	private WebElement dateOfBirthInput;
	
	@FindBy(id = "address")
	private WebElement currentAddress;
	
	@FindBy(id = "email")
	private WebElement userEmail;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "role")
	private WebElement role;
//
	@FindBy(id = "expectation")
	private WebElement expectation;
	
	@FindBy(xpath = "//option[@value='Good teamwork']")
	private WebElement teamwork;
	
	@FindBy(xpath = "//option[@value='Chance to go onsite']")
	private WebElement onsite;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[11]/div/div[2]/label/input")
	private WebElement devCourses;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[11]/div/div[3]/label/input")
	private WebElement devProject;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[11]/div/div[6]/label/input")
	private WebElement devExperiment;
	
	@FindBy(id = "comment")
	private WebElement comment;
	
	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(id = "submit-msg")
	private WebElement validDataSubmited;
	


//  driver.findElement(By.id("infoForm")).submit();

//  driver.findElement(By.id("submit")).click();
//  driver.findElement(By.id("submit-msg")).click();
	
	// Page Object
	public void isiNamaDepan(String un) {
		this.firstName.click();
		this.firstName.clear();
		Utils.delay(5, strDelay);
		this.firstName.sendKeys(un);
	}
	
	public void isiNamaBelakang(String un) {
		this.lastName.click();
		this.lastName.clear();
		Utils.delay(5, strDelay);
		this.lastName.sendKeys(un);
	}

	public void isiEmail(String un) {
		this.userEmail.click();
		this.userEmail.clear();
		Utils.delay(5, strDelay);
		this.userEmail.sendKeys(un);
	}
	
	public void genderMale() {
		this.genderMale.click();;
	}
	
	public void genderFemale() {
		this.genderFemale.click();;
	}
	
	public void genderOther() {
		this.genderOther.click();;
	}
	
	public void isiPassword(String un) {
		this.password.click();;
		this.password.clear();
		this.password.sendKeys(un);
	}
	
	public void isiDatePicker() {
		this.dateOfBirthInput.click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[1]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[3]/following::th[1]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[4]/following::span[2]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[3]/following::span[6]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[2]/following::span[1]")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[13]")).click();
	}
	
	public void isiCompany(String c) {
		this.company.click();
		this.company.clear();;
		this.company.sendKeys(c);;
	}
	
	public void isiRoleQA() {
		new Select(role).selectByVisibleText("QA");
	}
	
	public void isiRoleManager() {
		new Select(role).selectByVisibleText("Manager");
	}
	
	public void isiRoleTA() {
		new Select(role).selectByVisibleText("Technical Architect");
	}
	
	public void isiRoleBA() {
		new Select(role).selectByVisibleText("Business Analyst");
	}
	
	public void isiExpectationTeamwork() {
		new Select(expectation).selectByVisibleText("Good teamwork");
	}
	
	public void isiExpectationOnsite() {
		new Select(role).selectByVisibleText("Chance to go onsite");
	}
	
	public void clickTeamwork() {
		this.teamwork.click();
	}
	
	public void clickOnsite() {
		this.onsite.click();
	}
	
	public void clickCourses() {
		this.devCourses.click();
	}
	
	public void clickProject() {
		this.devProject.click();
	}
	
	public void clickExperiment() {
		this.devExperiment.click();
	}
	
	public void isiAlamat(String un) {
		this.currentAddress.click();
		this.currentAddress.clear();
		this.currentAddress.sendKeys(un);
	}
	
	public void isiComment(String com) {
		this.comment.click();
		this.comment.clear();
		this.comment.sendKeys(com);
	}
	
	public void klikSubmit() {
		this.submit.click();
	}
	
	public String getSubmit() {
		return validDataSubmited.getText();
	}

	public void zoomIn() throws AWTException {
		Robot robot = new Robot();
		for (int i = 0; i < 3; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_ADD);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
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
