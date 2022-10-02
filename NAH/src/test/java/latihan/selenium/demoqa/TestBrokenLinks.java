package latihan.selenium.demoqa;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import tugas.selenium.DriverSingleton;
import tugas.selenium.pages.BrokenLinks;
import tugas.selenium.util.Constant;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class TestBrokenLinks {
	public static WebDriver driver;
	private BrokenLinks brokenLinks;
//	public static Robot robot;
	
	
	@BeforeMethod
	public void pageObject() throws AWTException {
		DriverSingleton.getInstance(Constant.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constant.URL_DEMOQA);
		brokenLinks = new BrokenLinks();
		brokenLinks.zoomOut();
//		robot = new Robot();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		System.out.println();
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void click() throws AWTException, InterruptedException {
		System.out.println("Klik Component");
		brokenLinks.klikMenu();
		brokenLinks.klikValidImg();
		brokenLinks.klikBrokenImg();
		brokenLinks.clickLink();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		brokenLinks.klikValidLink();
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		brokenLinks.klikBrokenLink();
//		assertTrue(brokenLinks.getOutputLinkBrok().contains("Status Codes"));
		
	}
}
