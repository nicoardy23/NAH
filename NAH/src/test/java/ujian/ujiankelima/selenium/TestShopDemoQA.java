package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.factoryobject.DriverSingleton;
import latihan.factoryobject.util.Constant;
import latihan.factoryobject.utils.Utils;


public class TestShopDemoQA {
	public static WebDriver driver;
	private AccountShopDemoQA acc;
	private CartShopDemoQA cart;
	private CommentShopDemoQA comm;
	private BuyShopDemoQA buy;
	
	
	@BeforeMethod
	public void pageObject() throws AWTException {
		DriverSingleton.getInstance(Constant.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL_SHOP_DEMO_QA);
		acc = new AccountShopDemoQA();
		cart = new CartShopDemoQA();
		comm = new CommentShopDemoQA();
		buy = new BuyShopDemoQA();
		acc.zoomOut();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		System.out.println();
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	} 
	
	@Test(priority = 0)
	public void testRegister() throws AWTException, InterruptedException {
		acc.klikDismiss();
		acc.webAcc();
		acc.isiUsernameRegis("akuncoba2");
		acc.isiEmailRegis("akuncoba2@gmail.com");
		acc.isiPasswordRegis("Akuncoba222");
		acc.klikRegis();
		assertTrue(acc.getValidRegis().contains("Your session has expired"));
		//jika test register gagal, berarti akun sudah ada
	}
	
	@Test(priority = 1)
	public void testLogin() throws AWTException, InterruptedException {
		acc.klikDismiss();
		acc.webAcc();
		acc.isiUsernameLogin("akuncoba2");
		acc.isiPasswordLogin("Akuncoba222");
		acc.klikLogin();
		assertTrue(acc.getValidLogin().contains("Hello"));
	}
	
	@Test(priority = 2)
	public void testWishList() throws AWTException, InterruptedException {
		acc.klikDismiss();
		cart.clickWish();
		cart.clickCekWish();
		assertTrue(cart.validWishLink().contains("PINK"));
	}
	
	@Test(priority = 3)
	public void testComment() throws AWTException, InterruptedException {
		comm.toPageComment();
		comm.isiAuthorComment("cobaauthor1");
		comm.isiEmailComment("cobaauthof1@gmail.com");
		comm.isiComment("mantapp");
		comm.klikSubmitComment();
		assertEquals(comm.getValidComment(), "Error: You entered an incorrect CAPTCHA answer. Please go back and try again.");
	}

	@Test(priority = 4)
	public void testComment() throws AWTException, InterruptedException {
		buy.clickToBuy();
		buy.pilihColor();
		buy.pilihSize();
		buy.tambahQuantity(); 
		buy.submitButton();
		assertTrue(buy.validNotif().contains("size grey"));
		buy.clickToCart();
		assertTrue(buy.validCart().contains("playboy x missguided plus"));
	}
}
