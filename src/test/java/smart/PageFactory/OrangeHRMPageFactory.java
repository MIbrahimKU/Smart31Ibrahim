package smart.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPageFactory {
public OrangeHRMPageFactory(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}

	@FindBy (how =How.XPATH,using="//*[@name='username']")
	private static WebElement username;
	
	@FindBy (how =How.XPATH,using="//*[@name='password']")
	private static WebElement password;
	
	@FindBy (how =How.XPATH,using="//*[@type='submit']")
	private static WebElement login;
	
	@FindBy (how =How.XPATH,using="//*[@class='oxd-topbar-header-breadcrumb']")
	private static WebElement Stext;

	
	public WebElement getStext() {
		return Stext;
	}

	public void setStext(WebElement stext) {
		Stext = stext;
	}

	public WebElement getPassword() {
		return password;
	}

	public  void setPassword(WebElement password) {
		OrangeHRMPageFactory.password = password;
	}

	public WebElement getLogin() {
		return login;
	}

	public  void setLogin(WebElement login) {
		OrangeHRMPageFactory.login = login;
	}

	public  WebElement getUsername() {
		return username;
	}

	public  void setUsername(WebElement username) {
		OrangeHRMPageFactory.username = username;
	}
	
	
}
