package ujian.ujiankelima.cucumber;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import latihan.factoryobject.DriverSingleton;
import latihan.factoryobject.util.Constant;
import latihan.factoryobject.utils.Utils;
import ujian.ujiankelima.cucumber.scenariotest.ShopDemoQAOutline;

public class ShopDemoQAHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/hrms/extentreport/"
			+ "hrms-scene-login-outline-xr.html");
	private static ShopDemoQAOutline[] tests = ShopDemoQAOutline.values();
	private static final int[] DATA_OUTLINE = {5,5};
	private String testReport = "";
	
	@Before
	public void setUp() {
		
		DriverSingleton.getInstance(Constant.FIREFOX);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=0;
			Utils.testCount++;
		}
		Utils.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "ShopDemoQA_Hooks_"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));;
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		DriverSingleton.closeObjectInstance();
	}
	
	public static void delay(int detik, String delays) {
		if (delays.equals("y")) {			
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
}
