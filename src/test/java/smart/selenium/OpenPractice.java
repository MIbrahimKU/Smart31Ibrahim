package smart.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OpenPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		Thread.sleep(2000);
// Radio Button Example
//		WebElement BMW = driver.findElement(By.id("bmwradio"));
//		BMW.click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("benzradio")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id='hondaradio']")).click();
//		driver.findElement(By.id("hondaradio")).click();
// Select Class Example 		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[@value='bmw'])[2]")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//*[@value='benz'])[2]")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@value='honda'])[2]")).click();
		WebElement firstSec= driver.findElement(By.xpath("//*[@id='carselect']"));
		Select abc= new Select(firstSec);
		abc.selectByVisibleText("Honda");
		
// Select Multiple Class Example //Need help  
//		WebElement multiSelect = driver.findElement(By.id("multiple-select-example"));
//		Select dropMulti = new Select(multiSelect);
//		dropMulti.selectByVisibleText("Apple");
//		dropMulti.selectByVisibleText("Peach");
		
// CheckBox Example
//		driver.findElement(By.xpath("//input[@id='bmwcheck']")).click();
//		driver.findElement(By.xpath("(//*[@name='cars'])[6]")).click();
//		WebElement checkHonda = driver.findElement(By.xpath("//input[contains(@id,'hondacheck')]"));
//		checkHonda.click();
		
//Switch Window Example
		driver.findElement(By.xpath("//button[contains(text(),'Open Window')]")).click();
		Thread.sleep(2000);
		driver.quit();
	
// Switch Tab Example
//		WebElement switchTab = driver.findElement(By.linkText("Open Tab"));
//		switchTab.click();
		
	}

}
