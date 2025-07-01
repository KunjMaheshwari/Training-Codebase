package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirt");
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Tshirts");
		
//		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Shirt");
//		driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("Hello");
		driver.findElement(By.xpath("//*[@id='small-searchterms'][@placeholder='Search store']")).sendKeys("Pant");
	
		boolean result = driver.findElement(By.xpath("//strong[text()='Featured products']")).isDisplayed();
		System.out.println(result);
		
		String printResult = driver.findElement(By.xpath("//strong[text() = 'Featured products']")).getText();
		System.out.println(printResult); 
		
		boolean result2 = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(result2);
	}
}
