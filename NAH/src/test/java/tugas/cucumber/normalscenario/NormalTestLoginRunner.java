package tugas.cucumber.normalscenario;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/tugas/cucumber/normalscenario/01Login.feature"},
		glue = "tugas.cucumber.normalscenario",
		monochrome=true,
		plugin = {"pretty","html:target/nopc/htmlreport/LoginRunner.html",
				"json:target/nopc/jsonreport/LoginRunner.json",
				"junit:target/nopc/junitreport/LoginRunner.xml"})

public class NormalTestLoginRunner extends AbstractTestNGCucumberTests{

}
