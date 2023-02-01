package smart.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import smart.PageFactory.OrangeHRMPageFactory;


public class OrangeHRM {
	static WebDriver	driver;
	static OrangeHRMPageFactory pf;
	//OrangeHRMPageFactory text;
	
public static void main(String[] args) throws InterruptedException {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //Open web side 
	driver.manage().window().maximize();											  // maximize web side 
	
	Thread.sleep(1000);				//this is Java Code make some delay 
	
	driver.findElement(By.name("username")).sendKeys("Admin");    //Enter User name automatic 
	driver.findElement(By.name("password")).sendKeys("admin123");	//Enter Password automatic 
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(2000);
	String expected="Dashboard";
	//String actule=driver.findElement(By.xpath("//*[@class='oxd-topbar-header-breadcrumb']")).getText();
	
	    
	     //text=new OrangeHRMPageFactory(driver);
	    pf=new OrangeHRMPageFactory(driver);
	    String  actule= pf.getStext().getText();
	    Assert.assertTrue("The text does not match expected",expected.contains(actule));
	    System.out.println("contains text value: "+actule);
	    
	 
	
}
}
