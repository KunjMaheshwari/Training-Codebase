package Practice01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Open 
//Check for the logo
// login the website
// close

public class Practice02Test {
	WebDriver driver;
	
	@Test(priority=0)
	void open() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void checkLogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img")).isDisplayed();
		System.out.println(status);
	}
	
	@Test(priority=2)
	void testLogin() {
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}
	
	@Test(priority=3)
	void testClose() {
		driver.quit();
	}
}
