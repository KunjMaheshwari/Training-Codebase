package Main;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class Main {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@value='Show alert box']")).click();
//		
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.id("confirmexample")).click();
//		
//		driver.switchTo().alert().accept(); // this will click the "OK" button.
//		driver.switchTo().alert().dismiss(); // this will click the "Cancel" button.
		
		driver.findElement(By.xpath("//input[@id='promptexample']")).click();
		Alert myAlert = driver.switchTo().alert();
		myAlert.sendKeys("Kunj Maheshwari");
		myAlert.accept();
	}
}
