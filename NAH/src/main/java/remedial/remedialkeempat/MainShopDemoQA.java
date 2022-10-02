package remedial.remedialkeempat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.factoryobject.DriverSingleton;
import latihan.factoryobject.util.Constant;
import latihan.factoryobject.utils.Utils;

public class MainShopDemoQA {
	private WebDriver driver;
	private String strDelay = Constant.GLOB_PARAM_DELAY; 
	
	public MainShopDemoQA() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	// Page Factory Compare
	/*Compare Failed*/
//	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div/div/a")
	@FindBy(xpath = "//a[@href='/?action=yith-woocompare-view-table&iframe=yes']")
	private WebElement prodOne;
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[4]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/div/div/a")
	private WebElement prodTwo;
	@FindBy(id = "cboxClose")
	private WebElement closeButton;
	@FindBy(xpath = "//td[normalize-space()='black lux graphic t-shirt']")
	private WebElement validProdOne;
	@FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr[3]/td[2]")
	private WebElement validProdTwo;
	
	/*Admin Failed*/
	@FindBy(xpath = "//img[@alt='team7-100x100']")
	private WebElement adminOne;
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[5]/div/div/div/div/div/div/div/ul[2]/div/div/div[3]/li/div/span")
	private WebElement validAdminOne;
	@FindBy(xpath = "//img[@alt='0001937-100x100")
	private WebElement adminTwo;
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[5]/div/div/div/div/div/div/div/ul[2]/div/div/div/li/div/span")
	private WebElement validAdminTwo;
	@FindBy(xpath = "//img[@alt='girl_meditation_pose_sea_wallpaper-100x100']")
	private WebElement adminThree;
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div[5]/div/div/div/div/div/div/div/ul[2]/div/div/div[2]/li/div/span")
	private WebElement validAdminThree;
	
	
	@FindBy(xpath = "//div[@class='noo_simple_banner right']//div//a[@href='#']//span[contains(text(),'SHOW NOW')]")
	private WebElement womenTrend;
	@FindBy(xpath = "//div[@class='noo_simple_banner left']//div//a[@href='#']//span[contains(text(),'SHOW NOW')]")
	private WebElement manFashion;
	@FindBy(xpath = "//div[@class='vc_column-inner vc_custom_1465550709194']//span[contains(text(),'For ladies')]")
	private WebElement validManWomen;
	
	
	
//	 driver.findElement(By.xpath("//img[@alt='team7-100x100']")).click();
//	    driver.findElement(By.xpath("//div[@id='noo-site']/div[2]/div[5]/div/div/div/div/div/div/div/ul[2]/div/div/div[3]/li/div/span")).click();
//	    driver.findElement(By.xpath("//img[@alt='0001937-100x100']")).click();
//	    driver.findElement(By.xpath("//div[@id='noo-site']/div[2]/div[5]/div/div/div/div/div/div/div/ul[2]/div/div/div/li/div/span")).click();
//	    driver.findElement(By.xpath("//img[@alt='girl_meditation_pose_sea_wallpaper-100x100']")).click();
//	    driver.findElement(By.xpath("//div[@id='noo-site']/div[2]/div[5]/div/div/div/div/div/div/div/ul[2]/div/div/div[2]/li/div/span")).click();

	// Page Object
	public void productOne() {
		Utils.delay(2, strDelay);
		prodOne.click();
	}
	
	public void productTwo() {
		Utils.delay(2, strDelay);
		prodTwo.click();
	}
	
	public void clickClose() {
		Utils.delay(2, strDelay);
		closeButton.click();
	}
	
	public String validProdOne() {
		return validProdOne.getText();
	}
	
	public String validProdTwo() {
		return validProdTwo.getText();
	}
	
	
	public void clickAdminOne() {
		this.adminOne.click();
	}
	
	public String validAdminOne() {
		return this.validAdminOne.getText();
	}
	
	public void clickAdminTwo() {
		this.adminTwo.click();
	}
	
	public String validAdminTwo() {
		return this.validAdminTwo.getText();
	}
	
	public void clickAdminThree() {
		this.adminThree.click();
	}
	
	public String validAdminThree() {
		return this.validAdminThree.getText();
	}
	
	public void clickMan() {
		this.manFashion.click();
	}
	
	public void clickWomen() {
		this.womenTrend.click();
	}
	
	public String getValidManWoman() {
		return validManWomen.getText();
	}
}
