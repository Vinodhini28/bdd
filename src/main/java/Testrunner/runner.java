package Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@Runwith(Cucumber.class) - to run the script with Junit
//@CucumberOptions() - to run the script with TestNG

@CucumberOptions(
//		format = {"pretty","html:target/cucumber-reports/cucumber-pretty" , "json:below path"},
				format = {"pretty","json:target/cucumber-report/cucumberTestReports.json"},
				//plugin = {"json.target/cucumber-report/cucumberTestReports.json"}
		features = "src/main/java/feature", glue={"stepDefinition"}, tags ={"@PageFact"}, monochrome = true )
	public class runner extends AbstractTestNGCucumberTests{

}
