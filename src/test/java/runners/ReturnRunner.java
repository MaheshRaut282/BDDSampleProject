package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failedScenario.txt",
		glue = {"stepDeft"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/Reports/HtmlReport.html",
				}
		)

public class ReturnRunner extends AbstractTestNGCucumberTests {

}
