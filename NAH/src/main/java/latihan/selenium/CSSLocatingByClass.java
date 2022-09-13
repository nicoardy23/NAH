package latihan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatingByClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/automation-practice-form";
		 driver.get(baseUrl);

//		 driver.findElement(By.cssSelector("textarea[class = 'formcontrol']")).
//		 sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		 driver.findElement(By.cssSelector("textarea.form-control")).
		 sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		}
}
