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

public class UploadAndDownload {
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
  public void testUploadAndDownload() throws Exception {
    driver.get("https://demoqa.com/upload-download");
    driver.findElement(By.id("uploadFile")).click();
    driver.findElement(By.id("uploadFile")).clear();
    driver.findElement(By.id("uploadFile")).sendKeys("C:\\fakepath\\Nico_Ardy_Hermawan-Link_Github.docx");
    driver.findElement(By.id("uploadFile")).click();
    driver.findElement(By.id("uploadFile")).clear();
    driver.findElement(By.id("uploadFile")).sendKeys("");
    driver.findElement(By.id("uploadFile")).click();
    driver.findElement(By.id("uploadFile")).clear();
    driver.findElement(By.id("uploadFile")).sendKeys("C:\\fakepath\\Nico_Ardy_Hermawan-Link_Github.docx");
    driver.findElement(By.id("uploadedFilePath")).click();
    driver.findElement(By.id("downloadButton")).click();
    driver.findElement(By.id("colorChange")).click();
    driver.findElement(By.id("enableAfter")).click();
    driver.findElement(By.id("visibleAfter")).click();
    driver.findElement(By.id("iOVq8")).click();
    driver.findElement(By.id("colorChange")).click();
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
