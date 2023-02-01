package smart.StepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import smart.PageFactory.OrangeHRMPageFactory;


public class OrangeHRMSteps {
	WebDriver	driver;
	OrangeHRMPageFactory pf;
	
   
	@Given("^User go to Orange HRM home page$")
	public void user_go_to_Orange_HRM_home_page() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		pf= new OrangeHRMPageFactory(driver);
	    
	   
	}

	@Given("^User click on the username field$")
	public void user_click_on_the_username_field() throws Throwable {
		Thread.sleep(2000);
		pf.getUsername().click();
	   
	}

	@When("^User able to enter username on username field$")
	public void user_able_to_enter_username_on_username_field() throws Throwable {
		pf.getUsername().sendKeys("Admin");
	   
	}

	@When("^User able to click on the password field$")
	public void user_able_to_click_on_the_password_field() throws Throwable {
		pf.getPassword().click();
	   
	}

	@When("^User able to Enter Password on password field$")
	public void user_able_to_Enter_Password_on_password_field() throws Throwable {
		pf.getPassword().sendKeys("admin123");
	   
	}

	@Then("^User able to click on the login button$")
	public void user_able_to_click_on_the_login_button() throws Throwable {
		pf.getLogin().click();
	   
	}

	@Then("^User verify the Text in HomePage \"([^\"]*)\"$")
	public void user_verify_the_Text_in_HomePage(String arg1) throws Throwable {
		String expected=arg1;
		
	    String actule =pf.getStext().getText();
	    Assert.assertTrue("The text does not match expected",expected.contains(actule));
	    System.out.println("Thanks !!!");
	    driver.close();
	}



}
