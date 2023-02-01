package smart.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");   	//open a Google using a Chrome Browser 
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Smart Tech IT Solutions"); //Search some thing.
		driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();											// Go back again.
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		driver.findElement(By.xpath("//* [contains(@id,'identifierId')]")).sendKeys("khalil"); // Enter your email 
		driver.findElement(By.xpath("(//button[@jsname='LgbsSe'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("Khalil@1713");							// Enter your Password 
		driver.findElement(By.xpath("(//*[@jsname='LgbsSe'])[2]")).click();
		
	}
	
		

	}


