package latihan.selenium.selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSiniSana {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "http://www.google.com";
		 driver.get(baseUrl);
		 
		 WebElement formSearch = driver.findElement(By.name("q"));
		 formSearch.sendKeys("Sutarno");

		}
}
