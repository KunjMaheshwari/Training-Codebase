package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("the user is on eCommerce login page")
	public void the_user_is_on_e_commerce_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//a[text()='Log in']")).click();
	}

	@When("the user enters valid credentials \\(username: {string}, password: {string})")
	public void the_user_enters_valid_credentials_username_password(String user, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@class='email']")).sendKeys(user);
	    driver.findElement(By.xpath("//input[@class='password']")).sendKeys(pwd);
	}

	@When("the user clicks on the Login button")
	public void the_user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@class='button-1 login-button' ]")).click();
	}

	@Then("the user should be redirected to the My Account Page")
	public void the_user_should_be_redirected_to_the_my_account_page() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status = driver.findElement(By.xpath("//a[@class='ico-account']")).isDisplayed();
	    Assert.assertEquals(status, true);
	}

	@Then("the user should see a welcome message.")
	public void the_user_should_see_a_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
	   boolean welcomeTxt = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
	   Assert.assertEquals(welcomeTxt, true);
	   driver.quit();
	}
}
