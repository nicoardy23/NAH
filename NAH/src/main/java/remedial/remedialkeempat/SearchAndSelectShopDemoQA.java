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

public class SearchAndSelectShopDemoQA {
	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY; 
	
	public SearchAndSelectShopDemoQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[6]/div/div/div/div/div/div[2]/div[2]/a")
	private WebElement blog;
	
	@FindBy(xpath = "//div[@id='search-2']/form/input")
	private WebElement search;
	
	@FindBy(linkText = "black lux graphic t-shirt")
	private WebElement validSearch;
	
	
	public void blogOne() {
		Utils.delay(2, strDelay);
		this.blog.click();
	}
	
	public void searchData(String search) throws AWTException {
		Robot robot = new Robot();
		Utils.delay(2, strDelay);
		this.search.sendKeys(search);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public String validSearch() {
		Utils.delay(2, strDelay);
		return this.validSearch.getText();
	}
}
