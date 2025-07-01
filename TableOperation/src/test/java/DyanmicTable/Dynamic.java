package DyanmicTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		int noOfRows = driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
		int noOfCols = driver.findElements(By.xpath("//table[@id='taskTable']//th")).size();
		
		for(int i=2;i<=noOfRows;i++) {
				String rowElement = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+i+"]//td[1]")).getText();
				
				if(rowElement.equals("Chrome")) {
					String result1 = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+i+"]//td[4]")).getText();
					System.out.println("CPU Load time of Chrome Process: "+ result1);
					continue;
				}
				if(rowElement.equals("FireFox")) {
					String result2 = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+i+"]//td[5]")).getText();
					System.out.println("Memory size of the FireFox is: "+ result2);
					continue;
				}
				if(rowElement.equals("Chrome")) {
					String result3 = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+i+"]//td[4]")).getText();
					System.out.println("Network speed of the chrome is "+ result3);
					continue;
				}
				if(rowElement.equals("FireFox")) {
					String result4 = driver.findElement(By.xpath("//table[@id='taskTable']//tr["+i+"]//td[2]")).getText();
					System.out.println("Disk Management of FireFox is:"+ result4);
					break;
				}
		}
	}
}
