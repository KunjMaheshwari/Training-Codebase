package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		WebElement minSlider = driver.findElement(By.xpath("//div[@class='price-filter-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span[1]"));
		WebElement maxSlider = driver.findElement(By.xpath("//div[@class='price-filter-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']//span[2]"));
		
		System.out.println(minSlider.getLocation());
		System.out.println(maxSlider.getLocation());
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlider, 100, 125).build().perform(); // pass the driver name, x axis, y axis.
		
		act.dragAndDropBy(maxSlider, -100, 125).build().perform();
	}
}
