package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
class ParallelTesting {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setUp(String br) throws InterruptedException{
		switch(br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default: 
			System.out.println("Invalid broswer selected.");
			return;
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 1)
	void testLogo() throws InterruptedException {
		Thread.sleep(3000);
		boolean logoDisplayed = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']//img")).isDisplayed();
		Assert.assertEquals(logoDisplayed, true);
	}
	
	@Test(priority=2)
	void testTitle() {
		boolean titleDisplayed = driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).isDisplayed();
		Assert.assertEquals(titleDisplayed, true);
	}
	
	
	@Test(priority=3)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@AfterClass
	void testClose() {
		driver.close();
	}
}
