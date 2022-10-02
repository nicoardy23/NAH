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
	
	
	//Checkout
	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
	private WebElement toCheckout;

	@FindBy(id = "billing_first_name")
	private WebElement firstNameCheckout;
	
	@FindBy(id = "billing_last_name")
	private WebElement lastNameCheckout;
	
	@FindBy(id = "billing_company")
	private WebElement companyCheckout;
	
	@FindBy(id = "select2-billing_country-container")
	private WebElement countryCheckout;
	
	@FindBy(xpath = "//input[@role='combobox']")
	private WebElement isiCountry;
	
	@FindBy(id = "billing_address_1")
	private WebElement homeStreet;
	
	@FindBy(id = "billing_address_2")
	private WebElement homeDetail;
	
	@FindBy(id = "billing_city")
	private WebElement cityCheckout;
	
	@FindBy(id = "select2-billing_state-container")
	private WebElement stateCheckout;
	
	@FindBy(id = "billing_postcode")
	private WebElement posCode;
	
	@FindBy(id = "billing_phone")
	private WebElement phoneNumber;
	
	@FindBy(id = "billing_email")
	private WebElement email;
	
	@FindBy(id = "terms")
	private WebElement termsCondition;
	
	@FindBy(id = "place_order")
	private WebElement buySubmit;
	
	@FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
	private WebElement validBuy;
	
	
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
	
	public void clickToCheckout() {
		Utils.delay(1, strDelay);
		toCheckout.click();
	}
	
	public void firstName(String first) {
		Utils.delay(1, strDelay);
		firstNameCheckout.sendKeys(first);
	}
	
	public void LastName(String last) {
		Utils.delay(1, strDelay);
		lastNameCheckout.sendKeys(last);
	}
	
	public void isiCompany(String comp) {
		Utils.delay(1, strDelay);
		companyCheckout.sendKeys(comp);
	}
	
	public void pilihCountry(String count) throws AWTException {
		Robot robot = new Robot();
		Utils.delay(1, strDelay);
		countryCheckout.click();
		isiCountry.sendKeys(count);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void isiAlamat(String street, String detail) {
		Utils.delay(3, strDelay);
		homeStreet.sendKeys(street);
		homeDetail.sendKeys(detail);
	}
	
	public void cityCheckout(String city) {
		Utils.delay(1, strDelay);
		cityCheckout.sendKeys(city);
	}
	
	public void pilihState(String state) throws AWTException {
		Robot robot = new Robot();
		Utils.delay(1, strDelay);
		stateCheckout.click();
		isiCountry.sendKeys(state);
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	public void pPE(String pos, String phone, String email) {
		Utils.delay(1, strDelay);
		posCode.sendKeys(pos);
		phoneNumber.sendKeys(phone);
		this.email.sendKeys(email);
	}
	
	public void cekTerms() {
		Utils.delay(1, strDelay);
		termsCondition.click();
	}
	
	public void submitBuy() {
		Utils.delay(1, strDelay);
		buySubmit.click();
	}
	
	public String validBuy() {
		return validBuy.getText();
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
