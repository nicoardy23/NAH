package latihan.selenium.demoqa;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;

public class RadioButton {
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
  public void testRadioButton() throws Exception {
    driver.get("https://demoqa.com/radio-button");
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[4]/label")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/p")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/p")).click();
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
