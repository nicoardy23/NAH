package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDropdown() throws Exception {
    driver.get("https://formy-project.herokuapp.com/dropdown");
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File Download'])[1]/following::a[1]")).click();
    driver.findElement(By.id("navbarDropdownMenuLink")).click();
    driver.findElement(By.linkText("Dropdown")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dropdown'])[3]/following::a[1]")).click();
    driver.findElement(By.id("navbarDropdownMenuLink")).click();
    driver.findElement(By.linkText("Dropdown")).click();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drag and Drop'])[2]/following::a[1]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }
  
  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
