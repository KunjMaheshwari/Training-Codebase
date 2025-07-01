package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Testing has been started.");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		String actual_Title = driver.getTitle();
		
		if(actual_Title.equals("Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items")) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test case failed");
		}
		
		driver.findElement(By.name("keyword")).sendKeys("Books");
		Thread.sleep(3000);
		driver.quit();
	}
}