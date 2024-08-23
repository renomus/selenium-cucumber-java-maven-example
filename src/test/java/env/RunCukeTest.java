package env;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/cucumber-html-report",     // for HTML result
				"json:target/cucumber-json-report.json"  // for JSON result
		},
		features = "classpath:features",
		glue = {
				"info.seleniumcucumber.stepdefinitions",   // predefined step definitions package
				"info.seleniumcucumber.userStepDefinitions" // user step definitions package
		}
)
public class RunCukeTest { }
