package tugas.selenium.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.DriverSingleton;

public class TextBox {
private WebDriver driver;
	
	public TextBox() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
	private WebElement menu;
	
	@FindBy(id = "userName")
	private WebElement userName;
	
	@FindBy(id = "userEmail")
	private WebElement userEmail;

	@FindBy(id = "currentAddress")
	private WebElement currentAddress;
	
	@FindBy(id = "permanentAddress")
	private WebElement permanentAddress;
	
	@FindBy(id = "submit")
	private WebElement submit;
	
	@FindBy(xpath = "//p[@id='name']")
	private WebElement outputName;
	
	@FindBy(xpath = "//p[@id='email']")
	private WebElement outputEmail;

	@FindBy(xpath = "//p[@id='currentAddress']")
	private WebElement outputCurrent;
	
	@FindBy(xpath = "//p[@id='permanentAddress']")
	private WebElement outputPermanent;
	
	
	// Page Object
	public void klikMenu() {
		this.menu.click();
	}
	
	public void isiNama(String un) {
		this.userName.click();
		this.userName.clear();
		this.userName.sendKeys(un);
	}
	
	public void isiEmail(String ue) {
		this.userEmail.click();
		this.userEmail.clear();
		this.userEmail.sendKeys(ue);
	}
	
	public void isiAlamatTerakhir(String ca) {
		this.currentAddress.click();
		this.currentAddress.clear();
		this.currentAddress.sendKeys(ca);
	}
	
	public void isiAlamatTetap(String pa) {
		this.permanentAddress.click();
		this.permanentAddress.clear();
		this.permanentAddress.sendKeys(pa);
	}
	
	public void klikSubmit() {
		this.submit.click();
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
	
	public String getOutputName() {
		return outputName.getText();
	}
	
	public String getOutputEmail() {
		return outputEmail.getText();
	}
	
	public String getOutputCurrent() {
		return outputCurrent.getText();
	}
	
	public String getOutputPermanent() {
		return outputPermanent.getText();
	}
}
