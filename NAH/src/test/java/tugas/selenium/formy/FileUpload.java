package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FileUpload {
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
  public void testFileUpload() throws Exception {
	  Robot robot = new Robot();
	    driver.get("https://formy-project.herokuapp.com/fileupload");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File upload'])[1]/following::button[1]")).click();
//	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\NEXSOFT\\Desktop\\Bootcamp\\Tugas\\Nico_Ardy_Hermawan.docx");
	    robot.setAutoDelay(2000);
	    
	    StringSelection selection = new StringSelection("C:\\Users\\NEXSOFT\\Desktop\\Bootcamp\\Tugas\\Nico_Ardy_Hermawan.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
	
	    robot.setAutoDelay(1000);

	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);

	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);

	    robot.setAutoDelay(1000);

	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//button[normalize-space()='Reset']")).click();
	    
	    Thread.sleep(1500);
	    System.out.println("File is Uploaded Successfully");
	    
//	  Jika hanya syntax dari katalon, tidak akan berhasil karena membuka window library untuk mengambil file
//    driver.get("https://formy-project.herokuapp.com/fileupload");
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File upload'])[1]/following::button[1]")).click();
//    driver.findElement(By.xpath("//input[@type='file']")).clear();
//    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\NEXSOFT\\Desktop\\Bootcamp\\Tugas\\Nico_Ardy_Hermawan.docx");
//    driver.findElement(By.xpath("//input[@type='file']")).clear();
//    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\fakepath\\dev-requirement.txt");
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Choose'])[1]/following::button[1]")).click();
//    driver.findElement(By.xpath("//input[@type='file']")).clear();
//    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\fakepath\\dataProvider.png");
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
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
