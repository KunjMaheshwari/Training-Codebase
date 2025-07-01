package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMethod2 {
	
	WebDriver driver;

	// Constructors 
	LoginPageMethod2(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators 
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement textUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement textUserPassword;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement loginButton;
	
	
	//Actions 
	public void setUserName(String name) {
		textUserName.sendKeys(name);
	}
	
	public void setUserPass(String pass) {
		textUserPassword.sendKeys(pass);
	}
	
	public void clickButton() {
		loginButton.click();
	}
}
