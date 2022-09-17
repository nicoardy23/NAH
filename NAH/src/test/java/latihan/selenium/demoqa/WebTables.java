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

public class WebTables {
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
  public void testWebTables() throws Exception {
    driver.get("https://demoqa.com/webtables");
    driver.findElement(By.id("addNewRecordButton")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).clear();
    driver.findElement(By.id("firstName")).sendKeys("Nico");
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).clear();
    driver.findElement(By.id("lastName")).sendKeys("Ardy");
    driver.findElement(By.id("userEmail")).click();
    driver.findElement(By.id("userEmail")).clear();
    driver.findElement(By.id("userEmail")).sendKeys("kokoni@contoh.com");
    driver.findElement(By.id("age")).click();
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("18");
    driver.findElement(By.id("salary")).click();
    driver.findElement(By.id("salary")).clear();
    driver.findElement(By.id("salary")).sendKeys("belom puny");
    driver.findElement(By.id("department")).click();
    driver.findElement(By.id("department")).clear();
    driver.findElement(By.id("department")).sendKeys("Perikanan");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("//div[@id='salary-wrapper']/div[2]")).click();
    driver.findElement(By.id("salary")).clear();
    driver.findElement(By.id("salary")).sendKeys("1200000");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.id("searchBox")).click();
    driver.findElement(By.id("searchBox")).clear();
    driver.findElement(By.id("searchBox")).sendKeys("nico");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.id("searchBox")).click();
    driver.findElement(By.id("searchBox")).clear();
    driver.findElement(By.id("searchBox")).sendKeys("2000");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Add'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div/div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Compliance'])[1]/following::*[name()='svg'][1]")).click();
    driver.findElement(By.id("age")).click();
    driver.findElement(By.id("age")).clear();
    driver.findElement(By.id("age")).sendKeys("40");
    driver.findElement(By.id("department")).click();
    driver.findElement(By.id("department")).clear();
    driver.findElement(By.id("department")).sendKeys("Compl");
    driver.findElement(By.id("submit")).click();
    driver.findElement(By.xpath("//input[@value='1']")).click();
    driver.findElement(By.xpath("//div[@id='fixedban']/div/div")).click();
    driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select")).click();
    new Select(driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select"))).selectByVisibleText("20 rows");
    driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=3 | ]]
    driver.findElement(By.xpath("//div[@id='spv4']/amp-fit-text/div")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.xpath("//div[@id='fixedban']/div/div")).click();
    driver.findElement(By.xpath("//div[@id='fixedban']/div/div")).click();
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
