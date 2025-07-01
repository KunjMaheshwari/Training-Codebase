package Main;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		int noOfRows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(noOfRows);
		
		int noOfCols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("No of columns are "+ noOfCols);
		
		String specificElement = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(specificElement);
		
		String capJs = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		System.out.println(capJs);
		
		//Read the data from all the rows and column
		for(int i=2;i<=noOfRows;i++) {
			for(int j=1;j<=noOfCols;j++) {
				String result = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();				System.out.print(result+"\t");
			}
			System.out.println();
		}
		
//		//Print only those book whose author is Mukesh.
		for(int i=2;i<=noOfRows;i++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(authorName.equals("Mukesh")) {
				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText());
			}
		}	
		int totalPrice = 0;
		for(int i=2;i<=noOfRows;i++) {
			String priceOfEachBook = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			int priceInteger = Integer.parseInt(priceOfEachBook);
			totalPrice += priceInteger;
		}
		System.out.println("Total Price of the Book is "+ totalPrice);
		
	}
}
