package com.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.Base_Class;
import com.helper.File_Reader_Manager;
import com.logger.Property_Log;
import com.pom.AAddress;
import com.pom.ACasual_Dress;
import com.pom.ACreate_Account;
import com.pom.AHome_Page;
import com.pom.APayment;
import com.pom.AShipping;
import com.pom.ASign_In;
import com.pom.ASummary;
import com.sdp.Automation_PageObjectManager;

public class Runner_Automation_Full extends Base_Class{
	
	public static WebDriver driver=getBrowser("chrome");
	
	static Logger log=Logger.getLogger(Property_Log.class);
	public static Automation_PageObjectManager pm=new Automation_PageObjectManager(driver);	
	
	
public static void main(String[] args) throws Throwable  {
		
		PropertyConfigurator.configure("log4j.properties");
	
		log.info("URL Launch Initiated");	
		
		String url1 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl1();
			
		url(url1);
		
		log.warn("URL Launched Successfully");
		
		sleep(3000);
		
		actions("moveToElement", pm.getInstancehp().getWomen());
			
		clickonElement(pm.getInstancehp().getDresses());
		
		sleep(3000);
		
		clickonElement(pm.getInstancecd().getCasual_dress());
		sleep(3000);
		
		actions("moveToElement", pm.getInstancecd().getInstock());		
		
		clickonElement(pm.getInstancecd().getCart());
		sleep(3000);		
		
		clickonElement(pm.getInstancecd().getCheckout());
		sleep(3000);
		
		String quantity = read_Particular(File_Reader_Manager.getInstanceFRM().getInstanceCR().getPath1(), 31, 5);
		
		inputvalue(pm.getInstancesum().getQuantity(), quantity);				
		
		clickonElement(pm.getInstancesum().getProceed());
		sleep(3000);		
		
		String username1 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername1();

		inputvalue(pm.getInstanceac().getAccount(), username1);		
		
		clickonElement(pm.getInstanceac().getCreate());
		sleep(3000);
		
		clickonElement(pm.getInstancein().getTitle());
		
		String firstname = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Automation practise.xlsx", 5, 5);
		
		inputvalue(pm.getInstancein().getFirstname(), firstname);
		
		String lastname = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Automation practise.xlsx", 6, 5);
		
		inputvalue(pm.getInstancein().getLastname(), lastname);
		
		String password1 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword1();
		
		inputvalue(pm.getInstancein().getPassword(), password1);	
				
		String firstname1 = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Automation practise.xlsx", 5, 5);
		
		inputvalue(pm.getInstancein().getFirstname1(), firstname1);
		
		String lastname1 = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 6, 5);
		
		inputvalue(pm.getInstancein().getLastname1(), lastname1);
		
		String address = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 15, 5);
		
		inputvalue(pm.getInstancein().getAddress1(), address);
		
		String city = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 17, 5);
		
		inputvalue(pm.getInstancein().getCity(), city);
		
		String state = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 18, 5);
		
		dropdown("Text", pm.getInstancein().getState(), state);		
		
		String postcode = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 19, 5);
		
		inputvalue(pm.getInstancein().getPostcode(), postcode);
		
		//String country = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 20,5);
		
		dropdown("value", pm.getInstancein().getId_country(), "21");	
		
		String mobile = read_Particular("C:\\\\Users\\\\Orpak\\\\eclipse-workspace\\\\Maven_Project\\\\target\\\\Automation practise.xlsx", 22, 5);
		
		inputvalue(pm.getInstancein().getPhone_mobile(), mobile);
		
		clickonElement(pm.getInstancein().getSubmitAccount());
		sleep(3000);
	
		clickonElement(pm.getInstanceaa().getCheckout2());
		sleep(3000);
			
		
		clickonElement(pm.getInstances().getCheckbox());
		
		clickonElement(pm.getInstances().getCheckout3());
		sleep(3000);		
		
		clickonElement(pm.getInstancep().getPayment());
		sleep(3000);
		
		
		clickonElement(pm.getInstancep().getConfirmation());
		sleep(3000);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File d=ts.getScreenshotAs(OutputType.FILE);
		File r=new File("C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Screenshot\\error2.png");
		FileUtils.copyFile(d,r);
		sleep(3000);
		
		log.fatal("Completed");
		

	}

}

