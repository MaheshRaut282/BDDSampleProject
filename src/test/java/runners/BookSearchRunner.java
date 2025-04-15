package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//features//",
		glue = {"stepDeft"},
		monochrome = true,
		plugin = {"pretty",
				"html:target/Reports/HtmlReport.html",
				//"usage:target/Reports/UsageReport",
				//"json:target/Reports/JsonReport.json",
//				"rerun:target/failedScenario.txt"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)
public class BookSearchRunner extends AbstractTestNGCucumberTests{
  
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
	  return super.scenarios();
  }
}
