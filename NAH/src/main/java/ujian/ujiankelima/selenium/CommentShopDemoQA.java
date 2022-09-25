package ujian.ujiankelima.selenium;

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


public class CommentShopDemoQA {
	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY;
	
	public CommentShopDemoQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//a[normalize-space()='The New Marc Jacobs Gotham Saddle Bag']")
	private WebElement toPage;
	
	@FindBy(id = "author")
	private WebElement namaAuthor;
	
	@FindBy(id = "email")
	private WebElement emailAuthor;
	
	@FindBy(id = "comment")
	private WebElement commentAuthor;
	
	@FindBy(id = "submit")
	private WebElement submitComment;
	
	@FindBy(xpath = "//body[@id='error-page']/div")
	private WebElement validComment;
	
	
	//Page Object
	public void toPageComment() {
		Utils.delay(1, strDelay);
		toPage.click();
	}
	
	public void isiAuthorComment(String author) {
		Utils.delay(2, strDelay);
		namaAuthor.sendKeys(author);
	}
	
	public void isiEmailComment(String email) {
		Utils.delay(2, strDelay);
		emailAuthor.sendKeys(email);
	}

	public void isiComment(String comment) {
		Utils.delay(2, strDelay);
		commentAuthor.sendKeys(comment);
	}
	
	public void klikSubmitComment() {
		Utils.delay(2, strDelay);
		submitComment.click();
	}
	
	public String getValidComment() {
		return validComment.getText();
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
