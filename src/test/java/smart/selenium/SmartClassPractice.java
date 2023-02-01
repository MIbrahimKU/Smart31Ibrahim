package smart.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SmartClassPractice {
	
	static void Grade(int num) {
		if 		(num<=64) {System.out.println("Grade F");}
		else if (num>=65 && num<=75) { System.out.println("Grade D");}
		else if	(num>=76 && num<=85) { System.out.println("Grade C");}
		else if (num>=86 && num<=95) {System.out.println("Grade B");}
		else   	{System.out.println("Grade A");}
	}
	
	static void oneDArray() {
			String [] apple = new String[4];
			apple[0]="Mohammad";
			apple[1]="Ibrahim";
			apple[2]="khalil";
			apple[3]="ullah";
			
			for(String x:apple) {   System.out.println(x); 	} 					//Advanced for loop
			for(int i=0;i<apple.length;i++) {	System.out.println(apple[i]);} //old java loop
			}
	
	static void twoDArray() {
		String name [][]= {{"Md","Ibrahim","Khalil","Ullah"},
							{"Mehebuba","Hasnin","shmu",""},
							{"Mumtahina","Ibrahim","Arsiya","null"}}; 
		for (String[] x:name) { System.out.println(Arrays.toString(x));}  //Advanced for loop
		}

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void arrayList() {
//		ArrayList VariableName = new ArrayList<>(); //homogeneous arrayList accept any Data_type value:  
		List<String> myArray = new ArrayList<String>();
		myArray=new LinkedList();
		myArray.add("Mohammad"); 
		myArray.add("Ibrahim");
		myArray.add("Khalil");
		myArray.add("Ullah");
		
		for(int i=0; i<myArray.size();i++) { System.out.println(myArray.get(i));}
		}
	
	static void dropDownList() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("REGISTER")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
			dropdown.click();
		Select select = new Select(dropdown);
		select.selectByVisibleText("FRANCE"); 	//select By Visible Text 
		
		//select.selectByIndex(1);				//select By Index
	
		//select.selectByValue("BANGLADESH"); 	//select By Value
	
		
	}
	
	public static void getSecondLargest(){  
		  int[] a= {10,100,20,50,200,50};
		  int temp= a[0];
		for (int i = 0; i < a.length; i++)   
		        {  
		          if (temp < a[i])   
		                {  
		                    temp = a[i];  
		        
		            } 
		          System.out.println(temp); 
		        } 
	}
		       
		
	
public static void number() {
	ArrayList<Integer> num = new ArrayList<Integer>();
	
	num.add(1); 
	num.add(2);
	num.add(3);
	num.add(4);
	num.add(5);
	num.add(6);
	num.add(7);
	num.add(8);
	num.add(9);
	num.add(10);
	System.out.println(num);
	for (Integer x:num) {
		System.out.println(x);}
	}
public static void getPassword () throws Exception {
	FileInputStream fis = new FileInputStream(new File("Password.xls")); 
	@SuppressWarnings("resource")
	HSSFWorkbook wb = new HSSFWorkbook(fis);
	HSSFSheet sheet = wb.getSheetAt(0);
	String userName = sheet.getRow(1).getCell(1).getStringCellValue();
	String password = sheet.getRow(2).getCell(1).getStringCellValue();
		System.out.println("userName " + userName+" Password: "+password);
		
	
}
	
	public static void main(String[] args) throws Exception {
		//Grade(64);
		//oneDArray();
		//twoDArray();
		//arrayList();
		//dropDownList();
		//number(); 
		//getSecondLargest();
		FileInputStream fis = new FileInputStream(new File("Password.xls")); 
		@SuppressWarnings("resource")
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sheet = wb.getSheetAt(0);
		String userName = sheet.getRow(1).getCell(1).getStringCellValue();
		String password = sheet.getRow(2).getCell(1).getStringCellValue();
			System.out.println("userName " + userName+" Password: "+password);
			
	

	}
	}


