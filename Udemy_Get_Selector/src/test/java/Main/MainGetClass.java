package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainGetClass {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
				
	}
}
