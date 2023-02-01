package smart.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelReadWrite {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, InterruptedException {
		/* FileInputStream fis = new FileInputStream(new File("C:\\Users\\khali\\Desktop\\Smart IT\\Output.xls"));
		// FileInputStream fis = new FileInputStream(new File("AllTeamName.xls")); //
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println("Total Country :" + rowCount);
		for (int j = 0; j < rowCount + 1; j++) {
			String value = sheet.getRow(j).getCell(0).getStringCellValue();

			System.out.println(j + ") " + value);
		}

// Edit/update/write value ::

		sheet.getRow(18).getCell(0).setCellValue(" ");
		sheet.getRow(20).getCell(0).setCellValue(" ");
		FileOutputStream fso = new FileOutputStream("C:\\Users\\khali\\Desktop\\Smart IT\\Output.xls");
		wb.write(fso);
		String value1 = sheet.getRow(19).getCell(0).getStringCellValue();
		System.out.println("Delete Country :" + value1);
		String value2 = sheet.getRow(20).getCell(0).getStringCellValue();
		System.out.println("Delete Country :" + value2); */

		// new code start :::

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		List<WebElement> value = driver.findElements(By.xpath("//select[@name='country']"));
		System.out.println("Total Number of Country: " + value.size());
		HSSFWorkbook wb1 = new HSSFWorkbook();
		HSSFSheet sheet1 = wb1.getSheetAt(0);

		for (int i = 0; i < value.size() + 1; i++) {
			Row row = sheet1.createRow(i);
			Cell cell = row.createCell(0);
			System.out.println(value.get(i).getText());
			cell.setCellValue(value.get(i).getText()); // write all name inside sheet
			FileOutputStream fso1 = new FileOutputStream("C:\\Users\\khali\\Desktop\\Smart IT\\Output.xls"); // location
			wb1.write(fso1);

			}

	}

}
