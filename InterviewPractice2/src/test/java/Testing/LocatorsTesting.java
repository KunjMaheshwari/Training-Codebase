package Testing;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import dev.failsafe.internal.util.Assert;

public class LocatorsTesting {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhones");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(30))
								.pollingEvery(Duration.ofSeconds(5))
								.ignoring(NoSuchElementException.class);
		
		wait.until(driverInstance -> driverInstance.findElement(By.id("twotabsearchtextbox"))).sendKeys("iPhone");
		
		driver.close();
	}
}
