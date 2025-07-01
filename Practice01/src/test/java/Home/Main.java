package Home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
	public static void main(String args[]) {
		System.out.println("Testing has been started.");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Kunj Maheshwari");
		driver.findElement(By.id("email")).sendKeys("kunjm@outlook.com");
		driver.findElement(By.id("phone")).sendKeys("6232084444");
		driver.findElement(By.id("textarea")).sendKeys("Vidisha, Madhya Pradesh");
		driver.findElement(By.xpath("//input[@id='male']")).click();
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		
		WebElement dropdownelements = driver.findElement(By.id("country"));
		Select dropdown = new Select(dropdownelements);
		dropdown.selectByVisibleText("India");
		
		WebElement colorsElement = driver.findElement(By.id("colors"));
		Select colorsSelect = new Select(colorsElement);
		colorsSelect.selectByVisibleText("Yellow");
		
		WebElement animalElement = driver.findElement(By.id("animals"));
		Select animalSelect = new Select(animalElement);
		animalSelect.selectByVisibleText("Rabbit");
		
		driver.findElement(By.id("datepicker")).sendKeys("12/20/2002");
//		driver.findElement(By.id("txtDate")).sendKeys("06/04/2025");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(50, 1500");
		 
	}
}