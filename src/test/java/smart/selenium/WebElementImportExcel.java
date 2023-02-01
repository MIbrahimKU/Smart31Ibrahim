package smart.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementImportExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		
			Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			
			List<WebElement> value = select.getOptions();
						System.out.println("Total Number of Country: "+value.size());
			for(int i=0;i<value.size()+1;i++) {
				String allCountryName=select.getOptions().get(i).getText();
				
				FileInputStream fis = new FileInputStream(new File("C:\\Users\\khali\\Desktop\\Smart IT\\Output.xls"));
				HSSFWorkbook wb=new HSSFWorkbook(fis);
				HSSFSheet sheet = wb.getSheetAt(0);
				
				sheet.getRow(i).getCell(1).setCellValue(allCountryName);
				FileOutputStream fso =new FileOutputStream("C:\\Users\\khali\\Desktop\\Smart IT\\Output.xls");
				wb.write(fso);
				String value2=sheet.getRow(i).getCell(1).getStringCellValue();
				System.out.println(value2);
				
				

			}	}	}


