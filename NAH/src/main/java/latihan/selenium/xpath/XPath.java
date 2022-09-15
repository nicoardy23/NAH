package latihan.selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {
	public static void main(String[] args) {	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://formy-project.herokuapp.com/form";
//		String baseUrl = "https://demoqa.com/text-box";
		driver.get(baseUrl);
		
		// By.xpath("/html/body/div/form/div/div/input") ==> absolute XPath
		// By.xpath(“//input[@id = ‘firstname’]") ==> relative XPath
		// By.xpath("//input[contains(@placeholder,'ame')]") ==> contains(), sama seperti penulisan method java
		// By.xpath("//input[starts-with(@id,'last')]") ==> start-with
		// By.xpath("//input[@class='form-control' and @id='first-name']") ==> operator and
		// By.xpath("//input[@class='form-control' or @id='first-name']") ==> operator or
		// By.xpath("//label[text() = 'First name']")).getText() ==> text()
		// By.xpath("//input[@id ='userName']//ancestor::form")).getAttribute("id") ==> XPath Ancestor Axis
		// By.xpath("//div[@class= 'col-sm-8 col-sm-offset-2']//child::input")).getAttribute("id") ==> XPath Child Axis
		// By.xpath("//form[@id ='userForm']//descendant::input").getAttribute("") ==> XPath Descendant Axis 
		// By.xpath("//input[@id ='userName']//parent::div").getAttribute("class") ==> XPath Parent Axis
		// By.xpath("//div[@class= 'col-sm-8 col-sm-offset-2']//child::input").getAttribute("id") ==> XPath Child Axis
		driver.findElement(By.xpath("/html/body/div/form/div/div/input")).
		sendKeys("Marsinah");

	}
}
