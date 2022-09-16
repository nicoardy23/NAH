package tugas.selenium.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tugas.selenium.DriverSingleton;

public class PracticeForm {

	private WebDriver driver;
	
	public PracticeForm() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
//	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
//	private WebElement menu;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "userEmail")
	private WebElement userEmail;
	
	@FindBy(xpath = "//div[@id='genterWrapper']/div[2]/div/label")
	private WebElement genderMale;
	
	@FindBy(xpath = "//div[@id='genterWrapper']/div[2]/div[3]/label")
	private WebElement genderFemale;
	
	@FindBy(xpath = "//div[@id='genterWrapper']/div[2]/div[2]/label")
	private WebElement genderOther;
	
	@FindBy(id = "userNumber")
	private WebElement userNumber;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement dateOfBirthInput;
	
	@FindBy(id = "subjectsInput")
	private WebElement subject;
	
//	@FindBy(id = "react-select-2-option-0")
//	private WebElement pilihSubject;

	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div/label")
	private WebElement sport;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[2]/label")
	private WebElement reading;
	
	@FindBy(xpath = "//div[@id='hobbiesWrapper']/div[2]/div[3]/label")
	private WebElement music;
	
	@FindBy(xpath = "//form[@id='userForm']/div[8]/div[2]/div/label")
	private WebElement uploadPicture;
	
	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	
	@FindBy(xpath = "//div[@id='state']/div/div")
	private WebElement state;
	
	@FindBy(xpath = "//div[@id='city']/div/div/div")
	private WebElement city;
	
	@FindBy(id = "react-select-3-option-0")
	private WebElement ncr;
	
	@FindBy(id = "react-select-4-option-0")
	private WebElement optOne;
	
	@FindBy(id = "react-select-4-option-1")
	private WebElement optTwo;
	
	@FindBy(id = "react-select-4-option-2")
	private WebElement optThree;
	
	@FindBy(id = "react-select-3-option-1")
	private WebElement uttar;
	
	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Student Name'])[1]/following::td[1]")
	private WebElement validName;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Student Email'])[1]/following::td[1]")
	private WebElement validEmail;
	
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Mobile'])[1]/following::td[1]")
	private WebElement phone;
	
	// Page Object
//	public void klikMenu() {
//		this.menu.click();
//	}
	
	public void isiNamaDepan(String un) {
		this.firstName.click();;
		this.firstName.clear();
		this.firstName.sendKeys(un);
	}
	
	public void isiNamaBelakang(String un) {
		this.lastName.click();;
		this.lastName.clear();
		this.lastName.sendKeys(un);
	}

	public void isiEmail(String un) {
		this.userEmail.click();;
		this.userEmail.clear();
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
	
	public void isiNumber(String un) {
		this.userNumber.click();;
		this.userNumber.clear();
		this.userNumber.sendKeys(un);
	}
	
	public void isiDatePicker() {
		this.dateOfBirthInput.click();
		driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select")).click();
	    new Select(driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div/select"))).selectByVisibleText("January");
	    driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select")).click();
	    new Select(driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div/div[2]/div[2]/select"))).selectByVisibleText("2004");
	    driver.findElement(By.xpath("//div[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[6]")).click();
	}
	
	public void isiSubject(String un) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		this.subject.click();
		this.subject.sendKeys(un);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void isiHobi() {
		this.sport.click();
	}
	
	public void isiHobiDua() {
		this.reading.click();
	}
	
	public void isiHobiTiga() {
		this.music.click();
	}
	
	// ini hanya contoh, sebenarnya file upload bisa diletakkan discenario agar lebih dinamis
	public void isiPitcureUpload() throws AWTException, InterruptedException {
		Robot robot = new Robot();
		this.uploadPicture.click();
		robot.setAutoDelay(2000);
	    
	    StringSelection selection = new StringSelection("C:\\Users\\NEXSOFT\\Desktop\\Bootcamp\\Tugas\\Nico_Ardy_Hermawan.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	
	    robot.setAutoDelay(1000);

	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);

	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);

	    robot.setAutoDelay(500);

	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void isiAlamat(String un) {
		this.currentAddress.click();
		this.currentAddress.clear();
		this.currentAddress.sendKeys(un);
	}
	
	//bisa lebih dinamis bila click option pada test scenario
	public void pilihCountry() {
		this.state.click();
		this.ncr.click();
		this.city.click();
		this.optTwo.click();
		
	}
	
	public void klikSubmit() {
		this.submit.click();
	}
	
	public String getValidName() {
		return validName.getText();
	}
	
	public String getValidEmail() {
		return validEmail.getText();
	}
	
	public String getValidPhone() {
		return phone.getText();
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
