package Main;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searching {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Testing has been started.");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com/?FORM=Z9FD1");
		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("sb_form_q"));
        searchBox.sendKeys("Kunj Maheshwari");
        
        Thread.sleep(3000);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[contains(@class, 'sa_sg')]")));


        if (suggestions.size() >= 3) {
            suggestions.get(2).click();
        } else {
            System.out.println("Not enough suggestions available.");
        }
	}
}
