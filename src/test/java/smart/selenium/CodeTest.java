package smart.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class CodeTest {	
WebDriver driver;

String muurl="https://www.browserstack.com/guide/mouse-hover-in-selenium";
String dadurl="https://demo.guru99.com/test/drag_drop.html";
String doubleClickurl="http://demo.guru99.com/test/simple_context_menu.html";
String alerturl="https://demoqa.com/alerts";


public void mouseHuver() throws Exception {

	driver=new ChromeDriver();
	driver.get(muurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@id='accept-cookie-notification']")).click();
	WebElement element = driver.findElement(By.xpath("//span[@class='nav_item_name']"));
	Thread.sleep(2500);
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	driver.findElement(By.xpath("//a[contains(text(),'Status')]")).click();
	Thread.sleep(4000);
	driver.quit();
	
}


public void DrogAndDrop() throws Exception {
	driver=new ChromeDriver();
	driver.get(dadurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)", "");
	Thread.sleep(3000);
	WebElement drogItem = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
	WebElement dropItem = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
	Actions action = new Actions(driver);
	action.dragAndDrop(drogItem, dropItem).perform();
	Thread.sleep(3000);
	WebElement secendDrugItem = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
	WebElement secondDropItem = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
	action.dragAndDrop(secendDrugItem, secondDropItem).perform();
	Thread.sleep(5000);
	driver.quit();
		
}


public void doubleClick() throws Exception {
	driver=new ChromeDriver();
	driver.get(doubleClickurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
	Thread.sleep(1500);
	Actions action = new Actions(driver);
	action.doubleClick(element).perform();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.quit();
	
}


public void RightClick() throws Exception{
	driver = new ChromeDriver();
	driver.get(doubleClickurl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions action = new Actions(driver);
	action.contextClick(rightClick).perform();
	driver.findElement(By.xpath("//span[normalize-space()='Delete']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.quit();
}


public void AlartTest() throws Exception {
	driver=new ChromeDriver();
	driver.get(alerturl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	Thread.sleep(2000);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
	Thread.sleep(6000);
	alert.accept();
	
	driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	Thread.sleep(2000);
	alert.accept();
	
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,400)", "");
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	Thread.sleep(2000);
	System.out.println(alert.getText());
	alert.sendKeys("Ibrahim");
	Thread.sleep(3000);
	alert.accept();
	
	
	
	Thread.sleep(5000);
	driver.quit();
	
	
}

@Test
public void capsurvalu() throws Exception {
	driver = new ChromeDriver();

    // Navigate to the website
    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
Thread.sleep(3000);
List<WebElement> addToCartButtons = driver.findElements(By.cssSelector("button[class='product-action']"));
for (WebElement button : addToCartButtons) {
    WebElement priceElement = button.findElement(By.xpath("//p[@class='product-price']"));
    List<Integer> prices = new ArrayList<>();
    Collections.sort(prices, Collections.reverseOrder());
    int price = Integer.parseInt(priceElement.getText().trim());
    if (price == prices.get(1)) {
        button.click();
        System.out.println("Added second highest priced item to cart");
    } else if (price == prices.get(2)) {
        button.click();
        System.out.println("Added third highest priced item to cart");
    }
}}}




        
        
       





       


