package latihan.selenium.demoqa;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class Links {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testLinks() throws Exception {
    driver.get("https://demoqa.com/links");
    driver.findElement(By.id("simpleLink")).click();
    driver.get("https://demoqa.com/");
    driver.findElement(By.id("dynamicLink")).click();
    driver.findElement(By.xpath("//div[@id='linkWrapper']/h5/strong")).click();
    driver.findElement(By.xpath("//div[@id='linkWrapper']/h5[2]/strong")).click();
    driver.findElement(By.id("created")).click();
    driver.findElement(By.id("linkResponse")).click();
    driver.findElement(By.id("no-content")).click();
    driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).click();
    driver.findElement(By.id("moved")).click();
    driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).click();
    driver.findElement(By.id("bad-request")).click();
    driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).click();
    driver.findElement(By.id("unauthorized")).click();
    driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).click();
    driver.findElement(By.id("forbidden")).click();
    driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).click();
    driver.findElement(By.id("invalid-url")).click();
    driver.findElement(By.xpath("//p[@id='linkResponse']/b[2]")).click();
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
