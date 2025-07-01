package ListenerTutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTutorial.ListenerClass.class)
public class TestCaseClass {
	WebDriver driver;
	
	@BeforeClass
	void setUp(){
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority=0)
	void testLogo() throws InterruptedException{
		Thread.sleep(3000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=1)
	void testAppUrl() {
		Assert.assertEquals(driver.getCurrentUrl(), true);
	}
	
	@Test(priority=2, dependsOnMethods = {"testAppUrl"})
	void testHomePageTitle() {
		Assert.assertEquals(driver.getTitle(), true);
	}
	
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	
	
}
