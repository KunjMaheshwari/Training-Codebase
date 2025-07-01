package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This is the Page Object class of the Login page.

public class LoginPage{
	//We have to write 3 main methods in any Page Object class 
	//1. Constructor -> This will initiate the driver.
	//2. Locators -> all xpath's, id's...
	//3. Actions 
	
	WebDriver driver;
	
	
	//Constructor 
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Locators -> Login has 3 main elements that is Username, Password and Login Button
	By textUserName = By.xpath("//input[@placeholder='Username']");
	By textPassword = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	
	//Action Methods
	public void setUserName(String name) {
		driver.findElement(textUserName).sendKeys(name);
	}
	
	public void setUserPass(String password) {
		driver.findElement(textPassword).sendKeys(password);
	}
	
	public void clickButton() {
		driver.findElement(loginButton).click();
	}
	
}