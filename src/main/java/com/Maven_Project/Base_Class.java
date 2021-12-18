package com.Maven_Project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static String value;
	public static Actions actions;
	
	public static WebDriver getBrowser(String type) {
		
		if(type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_96.exe");
				driver=new ChromeDriver();
		}
				
		else if(type.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
				driver=new FirefoxDriver();
		}
				
		else if(type.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
				driver=new InternetExplorerDriver();
		}
				
		else {
			System.out.println("Invalid Browser");							
			
		}
		
		driver.manage().window().maximize();
		return driver;	
		
	}
	
	public static void clickonElement(WebElement element) {
		
		element.click();	

	}
	
	public static void inputvalue(WebElement element,String value) {
		element.sendKeys(value);

	}
	
    public static void url(String url) {
    	
    driver.get(url);
	
    }
    public static void close() {
		driver.close();

	}
    
    public static void quit() {
	
    	driver.quit();

    }
    
    public static void dropdown(String type,WebElement element,String value) {
    	
    	Select s=new Select(element);
    	
    	if(type.equalsIgnoreCase("value")) {
    		
    		s.selectByValue(value);
    		
    	}
    	
    	else if(type.equalsIgnoreCase("text")) {
    		s.selectByVisibleText(value);
    	}
    	
    	else if(type.equalsIgnoreCase("index")) {
    		
    		int index = Integer.parseInt(value);
    		
    		s.selectByIndex(index);
    	}
    	
	}
    
    public static void actions(String type,WebElement element) {
    	
    	Actions s1=new Actions(driver);
    	
    	if(type.equalsIgnoreCase("click")) {
    		
    		s1.click(element).build().perform();
    	}
    	
    	else if (type.equalsIgnoreCase("contextclick")) {
    	
    	s1.contextClick(element).build().perform();
    }
    
    	else if(type.equalsIgnoreCase("moveToElement")) {
    		s1.moveToElement(element).build().perform();
    	}
    }
    
    public static void sleep(long milli_seconds) throws InterruptedException {
    	
    	Thread.sleep(milli_seconds);	

	}
    
public static String read_Particular(String path,int row_index,int cell_index) throws IOException {
					
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {			
		value = cell.getStringCellValue();
				}
		
		else if(cellType.equals(cellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int val=(int)cellValue;
			value=String.valueOf(val);
		}		
	
		return value;
			}
	
    
}














