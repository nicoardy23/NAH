package latihan.selenium.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathSiblingAxis {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);

		
		List<WebElement> input = driver.findElements(By.xpath("//option[@value ='0']//following-sibling::option"));
		 for (int i = 0; i<input.size();i++) {
			 System.out.println(input.get(i).getAttribute("value"));
		 }
		 
		 System.out.println("================================================================");
		 System.out.println(driver.findElement(By.xpath("//option[@value ='0']//following-sibling::option")).getAttribute("value"));
		 System.out.println("================================================================");
		 System.out.println(driver.findElement(By.xpath("//option[@value ='0']//following-sibling::option[4]")).getAttribute("value"));
	}
}