package runnersetup;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/cucumber/test/homescreen/545155-ClientAdmin.feature"},
			//	tags= {"@Regression"},
				glue= "",
				monochrome = true,
				plugin = {"html:report/regression/cucumber-html-report", "json:report/regression/cucumber-json-report.json" })

public class TestRunner {

}