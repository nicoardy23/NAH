package latihan.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocatingByParentChild {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://demoqa.com/select-menu";
		 driver.get(baseUrl);

//		 contoh variasi
//		 form > div > div > textarea[placeholder = 'Current Address']
//		 driver.findElement(By.cssSelector("div > textarea[placeholder = 'Current Address']")).
//		 sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		 driver.findElement(By.cssSelector("select#oldSelectMenu>option:nth-oftype(2)[value='1']")).click();
		}
}
