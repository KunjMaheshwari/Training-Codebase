package Main;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLink {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement regLink = driver.findElement(By.xpath("//div[@class='header-links']//ul//li[1]"));
		
		//Control + Clicking on the Registration link
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).build().perform();
		
		// Switch to the Next window.
		ArrayList<String> ids = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo(ids.get(0));
		
		
	}
}
