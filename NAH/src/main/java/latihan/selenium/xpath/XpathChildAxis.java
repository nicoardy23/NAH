package latihan.selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathChildAxis {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);

		
		System.out.println(driver.findElement(By.xpath("//div[@class= 'col-sm-8 col-sm-offset-2']//child::input")).getAttribute("id"));
	}
}