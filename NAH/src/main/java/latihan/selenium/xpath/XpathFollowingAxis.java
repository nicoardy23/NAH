package latihan.selenium.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFollowingAxis {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);

		
		List<WebElement> input = driver.findElements(By.xpath("//input[@id= 'last-name']//following::input"));
				 for (int i = 0; i<input.size();i++) {
					 System.out.println(input.get(i).getAttribute("id"));
				 }
	  System.out.println("================================================================");
	  System.out.println(driver.findElement(By.xpath("//input[@id ='last-name']//following::input")).getAttribute("id"));
	  System.out.println("================================================================");
	  System.out.println(driver.findElement(By.xpath("//input[@id ='last-name']//following::input[3]")).getAttribute("id"));
	}
}