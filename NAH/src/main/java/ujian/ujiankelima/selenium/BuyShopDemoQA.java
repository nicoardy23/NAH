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


public class BuyShopDemoQA{
	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY; 
	
	public BuyShopDemoQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//a[contains(text(),'playboy x missguided plus size grey lips print fro')]")
	private WebElement toBuy;
	
	@FindBy(id = "pa_color")
	private WebElement pickColor;
	
	@FindBy(id = "pa_size")
	private WebElement pickSize;
	
	@FindBy(xpath = "//div[@id='product-1491']/div/div[2]/form/div/div[2]/div/div/button[2]/i")
	private WebElement plusQty;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	private WebElement submit;
	
	@FindBy(linkText = "View cart")
	private WebElement toCart;
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement validBuyNotif;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]")
	private WebElement validBuyCart;
	
//	driver.get("https://shop.demoqa.com/");
//    driver.findElement(By.linkText("playboy x missguided plus size grey lips print front cropped t shirt")).click();
//    driver.findElement(By.id("pa_color")).click();
//    new Select(driver.findElement(By.id("pa_color"))).selectByVisibleText("Grey");
//    driver.findElement(By.id("pa_size")).click();
//    new Select(driver.findElement(By.id("pa_size"))).selectByVisibleText("42");
	
	// 2 × “playboy x missguided plus size grey lips print front cropped t shirt” have been added to your cart.	
	// playboy x missguided plus size grey lips print front cropped t shirt - Grey
	
	//Page Object
	public void clickToBuy() {
		Utils.delay(1, strDelay);
		toBuy.click();
	}
	
	public void pilihColor() throws AWTException {
		Robot rob = new Robot();
		Utils.delay(1, strDelay);
		pickColor.click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void pilihSize() throws AWTException {
		Robot rob = new Robot();
		Utils.delay(2, strDelay);
		pickSize.click();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

	public void tambahQuantity() {
		Utils.delay(2, strDelay);
		plusQty.click();
	}
	
	public void clickToCart() {
		Utils.delay(2, strDelay);
		toCart.click();
	}
	
	public void submitButton() {
		Utils.delay(2, strDelay);
		submit.click();
	}

	public String validNotif() {
		Utils.delay(1, strDelay);
		return validBuyNotif.getText();
	}
	
	public String validCart() {
		Utils.delay(1, strDelay);
		return validBuyCart.getText();
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
