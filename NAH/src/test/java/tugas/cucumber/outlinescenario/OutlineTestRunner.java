package tugas.cucumber.outlinescenario;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/tugas/cucumber/outlinescenario/01logininvalidoutline.feature",
				"src/test/resources/tugas/cucumber/outlinescenario/02loginvalidoutline.feature",
				"src/test/resources/tugas/cucumber/outlinescenario/03dashboard.feature"},
		glue = "tugas.cucumber.outlinescenario",
		monochrome=true,
		plugin = {"pretty","html:target/nopc/htmlreport/LoginRunnerOutline.html",
				"json:target/nopc/jsonreport/LoginRunnerOutline.json",
				"junit:target/nopc/junitreport/LoginRunnerOutline.xml"})
public class OutlineTestRunner extends AbstractTestNGCucumberTests{

}
