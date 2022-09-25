package ujian.ujiankelima.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/ujian/ujiankelima/cucumber/01Register.feature",
		"src/test/resources/ujian/ujiankelima/cucumber/02Login.feature"},
glue = "ujian.ujiankelima.cucumber",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
		"json:target/hrms/jsonreport/LoginRunnerOutline.json",
		"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})
public class ShopDemoQARunner extends AbstractTestNGCucumberTests{}