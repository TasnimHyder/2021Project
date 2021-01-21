package webMD.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class FindaDoctorRunner {

	@CucumberOptions(plugin = { "pretty", "html:target/cucumber-HTMLreports",
			"json:target/cucumber-jsonreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, features = {
					"src/test/resources/Features" }, glue = { "webMD.StepDef" }, tags = {}, monochrome = true)

	public class RunCucumberTest extends AbstractTestNGCucumberTests {

	}

}
