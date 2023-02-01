package smart.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExcelJahidBhai {

		public static void main(String[] args) throws Throwable {
			//Webdriver is interface of selenium API.driver is an object and chrome driver is an class, using this code seleinium is driving chrome browser. 
			WebDriver driver = new ChromeDriver();
			//using the get method opening the browser and going to specific side.
			driver.get("https://www.premierleague.com/tables");
			//maximize the browser.
			driver.manage().window().maximize();
			//This is the code for selenium build implicit wait. one condition wait for DOM to load.
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			// Initialize and wait till element(link)
			//became clickable - timeout in 10 seconds
			WebElement ad1 = new WebDriverWait(driver, Duration.ofSeconds(10))
			        .until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@style='background-color:#37003c;'])[1]")));
			ad1.click();
			//click to remove pop up.
			//driver.findElement(By.xpath("(//*[@style='background-color:#37003c;'])[1]")).click();
			//click to remove the ad.
			
			WebElement adv= driver.findElement(By.xpath("//*[@id='advertClose']"));
			adv.click();
			//driver.findElement(By.xpath("//*[@id='advertClose']")).click();
			
			// This code is for scroll down
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)", "");
			// webelement to capture all team names
			List<WebElement> teams = driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
			
			  ArrayList<String> webTeams= new ArrayList<String>();		
			  ArrayList<String> exlTeams= new ArrayList<String>();
			  ArrayList<String> unMatchTeams= new ArrayList<String>();	
			  for(WebElement team: teams) {
				  webTeams.add(team.getText().trim());
			  }
			System.out.println(webTeams);
			FileInputStream fis= new FileInputStream(new File("AllTeamName25.xls"));
			HSSFWorkbook wb=new HSSFWorkbook(fis);
			HSSFSheet sheet= wb.getSheetAt(0);
			for (int i=0;i<sheet.getLastRowNum();i++) {
				exlTeams.add(sheet.getRow(i).getCell(0).getStringCellValue());
			}
			System.out.println(exlTeams);
			wb.close();
			
			for (String unMatch: webTeams) {
				if (!exlTeams.contains(unMatch)) {
					unMatchTeams.add(unMatch);
				}
			}
			System.out.println(unMatchTeams);
				
		}
	}


