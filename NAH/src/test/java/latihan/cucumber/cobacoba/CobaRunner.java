package latihan.cucumber.cobacoba;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/cobacoba/cobacoba.feature"},
		glue = "latihan.cucumber.cobacoba",
		monochrome=true,
		plugin = {"pretty","html:target/nopc/htmlreport/LoginRunner.html",
				"json:target/nopc/jsonreport/LoginRunner.json",
				"junit:target/nopc/junitreport/LoginRunner.xml"})
public class CobaRunner  extends AbstractTestNGCucumberTests{
}
