package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
	public static void main(String args[]) {
		System.out.println("Testing has been started.");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement desktops = driver.findElement(By.xpath("a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desktops).moveToElement(mac).click().build().perform();
		// Build() will create a method.
		// Perform() will execute the method.
		
		
		
		
		
		
		
		
	}
}
