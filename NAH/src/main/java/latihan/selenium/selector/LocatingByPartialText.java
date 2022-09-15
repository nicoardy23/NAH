package latihan.selenium.selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingByPartialText {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);

		 // input[id ^= ‘last’] partial starting text
		 // input[id $= ‘Name’] partial ending text
		 // input[placeholder *= ‘ame’] partial containing text
		 driver.findElement(By.cssSelector("input[id *= 'st']")).sendKeys("Supono");
	}
}
