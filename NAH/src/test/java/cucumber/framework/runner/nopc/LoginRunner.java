package cucumber.framework.runner.nopc;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/resources/features/login.feature",
glue = "selenium.framework.logindefinitions",
monochrome=true,
plugin = {"pretty","html:target/html/LoginRunner.html",
		"json:target/jsonreport/LoginRunner.json",
		"junit:target/junitreport/LoginRunner.xml"})
public class LoginRunner extends AbstractTestNGCucumberTests{

}