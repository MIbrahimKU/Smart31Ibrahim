package smart.StepDefinations;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreenKartStrps {
	WebDriver	driver;

	@Given("^go to green kart home page$")
	public void go_to_green_kart_home_page() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    
	}

	@Given("^user veryfy the page title$")
	public void user_veryfy_the_page_title() throws Throwable {
		String expected="GreenKart - veg and fruits kart";
		String actule=driver.getTitle();
		Assert.assertTrue("The text does not match expected",expected.contains(actule));
		System.out.println("Get Tital and Test Pass:: "+driver.getTitle());
	    
	    
	}

	@When("^user capture all items frome the page$")
	public void user_capture_all_items_frome_the_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		List<WebElement> prices = driver.findElements(By.xpath("//p[@class='product-price']"));
		for (WebElement price : prices) {
			System.out.println(price.getText().trim());
	    }
		driver.quit();
	}

	@When("^Print sortd prices in decending order$")
	public void print_sortd_prices_in_decending_order() throws Throwable {
		Thread.sleep(5000);
		driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    List<WebElement> pricesElements = driver.findElements(By.xpath("//p[@class='product-price']"));
	   List<Integer> prices = new ArrayList<>();
	   for(WebElement price : pricesElements) {
	       prices.add(Integer.parseInt(price.getText().trim()));
	   }
	   Collections.sort(prices, Collections.reverseOrder());

	    for (Integer price : prices) {
	       System.out.println(price);
	   }
	    driver.quit();
	}	

	

	@When("^add secend and third item into cart$")
	public void add_secnd_and_third_item_into_cart() throws Throwable {
	    driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
        
	    List<WebElement> addButtons = driver.findElements(By.xpath("//button[contains(text(), 'ADD')]"));
        addButtons.get(1).click();
        addButtons.get(2).click();
        
	    
	}

	@Then("^user go to cart page$")
	public void user_go_to_cart_page() throws Throwable {
	    
	    
	}

	@Then("^user verify total price$")
	public void user_verify_total_price() throws Throwable {
	    
	    
	}

	@Then("^user veryfy successfully shiped items$")
	public void user_veryfy_successfully_shiped_items() throws Throwable {
	    
	    
	}
	
}
