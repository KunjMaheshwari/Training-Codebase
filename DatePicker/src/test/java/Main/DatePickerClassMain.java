package Main;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerClassMain {
	public static void selectFututeDate(WebDriver driver, String year, String month, String date) {
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			
		}
		
		//Selecting future date.
		List<WebElement> dateList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement s : dateList) {
			if(s.getText().equals(date)) {
				s.click();
				break;
			}
		}
	}
	
	public static void selectPastDate(WebDriver driver, String year, String month, String date) {
		while(true) {
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				break;
			}

			driver.findElement(By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']")).click();
		}
		
		//Selecting future date.
		List<WebElement> dateList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement s : dateList) {
			if(s.getText().equals(date)) {
				s.click();
				break;
			}
		}
	}
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		// Method 1 -> using the send keys method
//		driver.findElement(By.id("datepicker")).sendKeys("08/06/2025");
		
		//Method 2 -> using the date picker.
		String year = "2024";
		String month = "December";
		String date = "20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectPastDate(driver, year, month, date);
	}
}
