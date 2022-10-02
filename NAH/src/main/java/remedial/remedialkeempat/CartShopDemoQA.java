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


public class CartShopDemoQA {
	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY;
	
	public CartShopDemoQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div[2]/div")
	private WebElement wish;
	
	@FindBy(xpath = "yith-wcwl-popup-message")
	private WebElement wishPopup;
	
	@FindBy(xpath = "//a[normalize-space()='Browse Wishlist']")
	private WebElement wishLink;
	//valid popup susah untuk didapat karena itu bukan element permanen
	
	@FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
	private WebElement wishGet;
	
//	@FindBy(xpath = "//h1[@class='page-title']")
//	private WebElement wishGet;
	
	
	//Page Object
	public void clickWish() {
		Utils.delay(1, strDelay);
		wish.click();
	}
	
	public void clickCekWish() {
		Utils.delay(3, strDelay);
		wishLink.click();
	}
	
	public String validWishPopup() {
		Utils.delay(2, strDelay);
		return wishPopup.getText();
	}

	public String validWishLink() {
		Utils.delay(1, strDelay);
		return wishGet.getText();
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
