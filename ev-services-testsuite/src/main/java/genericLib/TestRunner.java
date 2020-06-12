package genericLib;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
						features="src/cucumber/test/module-1/StoryID-ListFunctionalityTest.feature", 
						glue= "step_definitions",
						dryRun = false,
						tags= "@Debug",
						plugin = {"html:report/html/smoke", "json:report/smoke/json-report.json" })

public class TestRunner {

}

