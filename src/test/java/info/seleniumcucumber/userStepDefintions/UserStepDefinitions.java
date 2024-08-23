package info.seleniumcucumber.userStepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import env.DriverUtil;
import info.seleniumcucumber.methods.BaseTest;

public class UserStepDefinitions implements BaseTest {

	private WebDriver driver = DriverUtil.getDefaultDriver();
	private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Updated WebDriverWait initialization

	@Given("^I should get logged-in$")
	public void should_logged_in() {
		By flashMessageLocator = By.id("flash");

		wait.until(ExpectedConditions.visibilityOfElementLocated(flashMessageLocator));
		String msg = driver.findElement(flashMessageLocator).getText();

		if (!msg.isEmpty()) {
			msg = msg.split("\n")[0].trim();
		}

		Assert.assertEquals("You logged into a secure area!", msg);
	}
}
