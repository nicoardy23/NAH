package latihan.selenium.selector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PencetSanaPencetSini {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);
		
		WebElement formFirstName = driver.findElement(By.id("first-name"));
		formFirstName.sendKeys("Nico");
		
		WebElement formLastName = driver.findElement(By.id("last-name"));
		formLastName.sendKeys("Ardy");
		
		WebElement formJobTitle = driver.findElement(By.id("job-title"));
		formJobTitle.sendKeys("Programmer");
		
		WebElement formEducation = driver.findElement(By.id("radio-button-1"));
		formEducation.click();
		
		WebElement formSex = driver.findElement(By.id("checkbox-1"));
		formSex.click();
		
		List<WebElement> drop = driver.findElements(By.tagName("option"));
		drop.get(2).click();
		
		WebElement formDate = driver.findElement(By.id("datepicker"));
		formDate.sendKeys("09/13/2022");
		
		WebElement buttonSearch = driver.findElement(By.partialLinkText("Submit"));
		buttonSearch.click();
		
		}

}
