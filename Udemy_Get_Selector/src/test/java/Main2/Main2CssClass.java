package Main2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2CssClass {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//Conditional Methods -> 
		driver.manage().window().maximize();
		
		WebElement imageLogo = driver.findElement(By.tagName("img"));
		boolean isLogoDisplayed = imageLogo.isDisplayed();
		System.out.println(isLogoDisplayed);
		
		
	}
}
