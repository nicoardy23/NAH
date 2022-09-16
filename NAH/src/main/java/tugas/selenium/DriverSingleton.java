package tugas.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


import tugas.selenium.driver.DriverStrategy;
import tugas.selenium.driver.DriverStrategyImplemen;
import tugas.selenium.util.Constant;

public class DriverSingleton {
	private static DriverSingleton value = null;
	private static WebDriver driver;
	
	private DriverSingleton(String driver) {
		valueOfDriver(driver);
	}

	public WebDriver valueOfDriver(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplemen.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(Constant.TIMEOUT, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static DriverSingleton getInstance(String driver) {
		if(value == null) {
			value = new DriverSingleton(driver);
		}
		
		return value;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void closeObjectInstance() {
        value = null;
        driver.quit();
    }
}
