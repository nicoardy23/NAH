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
	
	
	// Comment Dengan Login
	@FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
	private WebElement toMain;
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[6]/div/div/div/div/div/div[2]/div[2]/a")
	private WebElement toComment;
	@FindBy(xpath = "//div[@id='comment-15193']/div/p")
	private WebElement validCommentSuccess;
	
	//Page Object
	public void toPageComment() {
		Utils.delay(1, strDelay);
		toPage.click();
	}
	
	public void isiAuthorComment(String author) {
		Utils.delay(1, strDelay);
		namaAuthor.sendKeys(author);
	}
	
	public void isiEmailComment(String email) {
		Utils.delay(1, strDelay);
		emailAuthor.sendKeys(email);
	}

	public void isiComment(String comment) {
		Utils.delay(1, strDelay);
		commentAuthor.sendKeys(comment);
	}
	
	public void klikSubmitComment() {
		Utils.delay(1, strDelay);
		submitComment.click();
	}
	
	public String getValidComment() {
		return validComment.getText();
	}
	
	public void toMain() {
		toMain.click();
	}
	
	public void toComment() {
		toComment.click();
	}
	
	public String getValidCommentSuccess() {
		return validCommentSuccess.getText();
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
