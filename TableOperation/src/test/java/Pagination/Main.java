package Pagination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		int totalRows = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();
		int noOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		
		for(int i=1;i<=totalRows;i++) {
			if(i == 3) {
				driver.findElement(By.xpath("//ul[@id='pagination']//li[3]")).click();
				
				for(int j=2;j<=noOfRows;j++) {
					String selectedName1 = driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td[2]")).getText();
					
					if(selectedName1.equals("Router")) {
						driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td[4]//input")).click();
					}
					if(selectedName1.equals("Fitness Tracker")) {
						driver.findElement(By.xpath("//table[@id='productTable']//tr["+j+"]//td[4]//input")).click();
					}
				}
			}
		}
	}
}
