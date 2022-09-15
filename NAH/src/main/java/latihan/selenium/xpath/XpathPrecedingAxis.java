package latihan.selenium.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPrecedingAxis {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		 String baseUrl = "https://formy-project.herokuapp.com/form";
		 driver.get(baseUrl);

		 List <WebElement> label = driver.findElements(By.xpath("//input[@id= 'job-title']//preceding::label"));
		 for (int i = 0; i<label.size();i++) {
		 System.out.println(label.get(i).getText());
		 }

		 System.out.println("================================================================");
		 System.out.println(driver.findElement(By.xpath("//input[@id = 'job-title']//preceding::label[3]")).getText());
		 System.out.println("================================================================");
		 System.out.println(driver.findElement(By.xpath("//input[@id = 'job-title']//preceding::label")).getText());
	}
}
