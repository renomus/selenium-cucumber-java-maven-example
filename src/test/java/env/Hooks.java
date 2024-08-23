package env;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {
	@After("@NegativeTest")
	public void afterScenario(Scenario scenario) {
		// Example: print scenario details
		System.out.println("Scenario Name: " + scenario.getName());
		System.out.println("Scenario Status: " + scenario.getStatus());
	}
}
