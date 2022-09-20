package latihan.cobagenerate;

import org.openqa.selenium.WebDriver;

import cucumber.api.cli.Main;


public class LoginRunner {
	public static WebDriver driver;
	public static void main(String[] args) {
		try {
			Main.main(new String[] {
					"-g","tugas.cucumber.normalscenario",
					"classpath:tugas/cucumber/normalscenario",//src/test/resources/hrms/sceneoutlinefix
					"-p","pretty",
					"-p","html:target/hrms/htmlreport/LoginRunnerOutline.html",
					"-p","json:target/hrms/jsonreport/LoginRunnerOutline.json",
					"-p","junit:target/hrms/junitreport/LoginRunnerOutline.xml",
					"-m"
			});
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Main Class Execption : "+e);
		}
	}
}
