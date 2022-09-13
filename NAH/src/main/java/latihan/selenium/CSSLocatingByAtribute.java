package latihan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatingByAtribute {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);

//		 beberapa contoh variasi cssSelector
//		 textarea#currentAddress[placeholder='Current Address']
//		 textarea.form-control[placeholder='Current Address']
//		 textarea[class = 'form-control'][placeholder='Current Address']
		 driver.findElement(By.cssSelector("textarea[rows = '5'][cols = '20'][class = 'form-control']")).
		 sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		}
}
