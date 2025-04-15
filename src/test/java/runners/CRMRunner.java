package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//features//",
		glue = {"strepDefinitions"},
		monochrome=true,
//		tags="@SmokeTest or @RegressionTest"
//		tags="@PhaseTwo and @SmokeTest or @PhaseOne and @SmokeTest"
		tags="@PhaseOne and @SmokeTest or @PhaseOne and @RegressionTest"
		)

public class CRMRunner extends AbstractTestNGCucumberTests {

}
