package Main;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassOne {
	public static void main(String args[]) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String filePath = System.getProperty("user.dir")+"//caldata.xlsx";
		int rows = ExcelUtility.getRowCount(filePath, "Sheet1");
		
		for(int i=1;i<=rows;i++) {
			//Step 1 -> Read the data from the excel.
			String principleAmount = ExcelUtility.getCellData(filePath, "Sheet1", i, 0);
			String rateOfInterest = ExcelUtility.getCellData(filePath,  "Sheet1", i, 1);
			String period1 = ExcelUtility.getCellData(filePath, "Sheet1", i, 2);
			String period2 = ExcelUtility.getCellData(filePath, "Sheet1", i, 3);
			String frequency = ExcelUtility.getCellData(filePath, "Sheet1", i, 4);
			String expectedValue = ExcelUtility.getCellData(filePath, "Sheet1", i, 5);
			
			
			//Step 2 -> Pass above data to Excel.
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principleAmount);
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(rateOfInterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
			
			Select dropSelect = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			dropSelect.selectByVisibleText(period2);
			
			Select dropSelect2 = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			dropSelect2.selectByVisibleText(frequency);
			
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click(); //Clicking on the calculate button.
			
			//Step 3 -> Validation.
			String actualValue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(expectedValue) == Double.parseDouble(actualValue)) {
				System.out.println("Test case Passed.");
			}else {
				System.out.println("Test case Failed.");
			}
			
			driver.close();
		}
	}
}
