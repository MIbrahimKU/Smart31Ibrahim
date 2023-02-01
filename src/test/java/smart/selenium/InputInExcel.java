package smart.selenium;

import java.io.FileOutputStream;
import java.io.IOException;
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



public class InputInExcel {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.premierleague.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@style='background-color:#37003c;'])[1]")).click();
		//This code is for scroll down 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		//webElement to capture all team names 
		List<WebElement> teams= driver.findElements(By.xpath("//table/tbody/tr/td[3]/a/span[2]"));
		//write all team name inside new excel sheet
		HSSFWorkbook wb=new HSSFWorkbook(); 									//create a new workbook object
		HSSFSheet sheet = wb.createSheet("TeamNames");							//create a new sheet inside a workbook 
		
		for(int i=0;i<teams.size()+1;i++) {
			Row row =sheet.createRow(i);
			Cell cell=row.createCell(0);
			System.out.println(teams.get(i).getText().trim());
			cell.setCellValue(teams.get(i).getText().trim()); 						//write all name inside sheet 
			FileOutputStream fso =new FileOutputStream("AllTeamName.xls");			//location of excel file inside project
			wb.write(fso);															//create excel file with all names 
			
		}
		
		
	}
	
}
