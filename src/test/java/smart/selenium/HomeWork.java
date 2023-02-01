package smart.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {
public static void main(String[] args) throws Exception {
	//excelread();
	webvalue();
	
//	ArrayList<String> excelTeam= new ArrayList<String>(Arrays.asList(excelread()));
//	ArrayList<String> webTeam= new ArrayList<String>(Arrays.asList(webvalue()));
//	ArrayList<String> unmachTeam= new ArrayList<String>(Arrays.asList(webvalue()));
	//for(WenElement team:teams) {
	//	webTeam.add(team.getText().trim());
		}
	//System.out.println(webTeam);
	//secountList.removeAll(firstList);
	//System.out.println(secountList); 
//}
	
	static String excelread() throws Exception {			
	FileInputStream fis = new FileInputStream(new File("AllTeamName.xls")); //
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet sheet = wb.getSheetAt(0);
	int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
	String value="";
	System.out.println("Total Team :" + rowCount+1);
	for (int j = 0; j < rowCount + 1; j++) {
	value= sheet.getRow(j).getCell(0).getStringCellValue();
	System.out.println(j+1 + ") " + value);
	
		}
	return value; }
	
	
	static String webvalue() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("(//*[@style='background-color:#37003c;'])[1]")).click();
	//This code is for scroll down 
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)", "");
	//webElement to capture all team names 
	List<WebElement> value= driver.findElements(By.xpath("//body/div[@id='root']/div[@class='container']/div[@class='products-wrapper']/div[@class='products']/div[1]"));
	String price="";
	for(int i=0;i<value.size()+1;i++) {
		price= value.get(i).getText().trim();
		System.out.println(i+1+") "+price);
		
	}
	return price;}
	
	/*static ArrayList<String> compierMethod() throws Exception {
		ArrayList<String> firstList= new ArrayList<String>(Arrays.asList(excelread()));
		ArrayList<String> secountList= new ArrayList<String>(Arrays.asList(webvalue()));
		
		
		secountList.removeAll(firstList);
		*/
		
		
		
	}
	


	


