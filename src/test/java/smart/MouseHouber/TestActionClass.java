package smart.MouseHouber;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestActionClass {
	
	 WebDriver driver;
	 String URL="https://www.browserstack.com/guide/mouse-hover-in-selenium";
@Test
	public  void MouseHover() throws Exception {
		driver =new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
		WebElement element = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Events")).click();
		Thread.sleep(3000);
		driver.close();
		
	}
	@Test
	public void dragAndDrop() throws Exception {
		driver= new EdgeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drageItem = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement dropItem = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Actions action=new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(2000);
		action.dragAndDrop(drageItem, dropItem).perform();
		Thread.sleep(5000);
		driver.quit();
		
		
	}


}
