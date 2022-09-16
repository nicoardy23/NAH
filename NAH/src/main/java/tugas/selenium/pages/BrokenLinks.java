package tugas.selenium.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tugas.selenium.DriverSingleton;

public class BrokenLinks {
private WebDriver driver;
	
	public BrokenLinks() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//span[normalize-space()='Broken Links - Images']")
	private WebElement menu;

	@FindBy(xpath = "//div[@id='app']/div/div/div[2]/div[2]/div[2]/img[1]")
	private WebElement validImg;
	
	@FindBy(xpath = "//div[@id='app']/div/div/div[2]/div[2]/div[2]/img[2]")
	private WebElement brokenImg;
	
	@FindBy(linkText = "Click Here for Valid Link")
	private WebElement validLink;
	
	@FindBy(linkText = "Click Here for Broken Link")
	private WebElement brokenLink;
	
	@FindBy(xpath = "//img[@alt='Selenium Online Training']")
	private WebElement outputValidLink;
	
	@FindBy(xpath = "//h3[normalize-space()='Status Codes']")
	private WebElement outputBrokenLink;
	
	//Page Object
	public void klikMenu() {
		this.menu.click();
	}
	
	public void klikValidImg() {
		this.validImg.click();
	}
	
	public void klikBrokenImg() {
		this.brokenImg.click();
	}
	
//	public void klikValidLink() {
//		this.validLink.click();
//	}
//	
//	public void klikBrokenLink() {
//		this.brokenLink.click();
//	}
	
	public void clickLink() throws AWTException, InterruptedException {
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		validLink.click();
		brokenLink.click();
		action.keyUp(Keys.CONTROL).build().perform();
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
	
	public String getOutputLinkVal() {
		return outputValidLink.getText();
	}
	
	public String getOutputLinkBrok() {
		return outputBrokenLink.getText();
	}
	
	
//	driver.get("https://demoqa.com/broken");
//    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/img[2]")).click();
//    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/p[2]")).click();
//    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/p[3]")).click();
//    driver.findElement(By.linkText("Click Here for Valid Link")).click();
//    driver.get("https://demoqa.com/");
//    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div/div")).click();
//    driver.findElement(By.xpath("//li[@id='item-6']/span")).click();
//    driver.findElement(By.linkText("Click Here for Broken Link")).click();
//    driver.get("http://the-internet.herokuapp.com/status_codes/500");
//    driver.close();
//    driver.get("https://demoqa.com/broken");
}
