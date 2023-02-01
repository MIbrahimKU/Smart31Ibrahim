package smart.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPointTest {
		
	public static void main(String[] args) {
		String url = ("https://courses.letskodeit.com/practice");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
// Storing Title name in the String variable  		
		String title = driver.getTitle();
// Storing Title length in the Int variable 
		int titleLength=driver.getTitle().length();
		System.out.println("Title of the page is: "+title);
		System.out.println("Length of the title is: "+titleLength);
		String actuleUrl=driver.getCurrentUrl();
		if (actuleUrl.equals("https://courses.letskodeit.com/practice"))
		{
			System.out.println("Verification Successful - The corrent URL is opened");
		}
		else {
			System.out.println("Verification Failed - An incorrect URL is opened.");
		}
		
// Storing Page Source in String variable  		
		String pageSource = driver.getPageSource();
// Storing Page Source length in Int variable  
		int pageSourceLength = pageSource.length();
		System.out.println("Total length of the Page Sourch is: "+pageSourceLength);
		//driver.close();
		
		
	}

}
