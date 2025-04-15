package stepDeft;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginSt {

	WebDriver driver;
	ChromeOptions options;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
		
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.className("radius")).click();
	}
	
	@Then("Should display success message")
	public void should_display_success_message() {
		boolean isUserValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isUserValid);
		
	}
}
