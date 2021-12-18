package com.runner;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.Base_Class;
import com.logger.Property_Log;
import com.sdp.Page_Object_Manager;

public class Log_Runner extends Base_Class{
	
	public static WebDriver driver=getBrowser("chrome");
	
	public static Page_Object_Manager pm=new Page_Object_Manager(driver);
	
	static Logger log=Logger.getLogger(Property_Log.class);

	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("URL Launch Initiated");
		
		url("https://adactinhotelapp.com/");
		
		log.warn("URL Launched Successfully");

		sleep(3000);
		
		String username = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 1, 5);
			
		inputvalue(pm.getInstancehp().getEmail(),username);
		
		String password = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 2, 5);
		
		inputvalue(pm.getInstancehp().getPassword(),password);
		
		clickonElement(pm.getInstancehp().getLogin()); 
		
		sleep(3000);
		
		String location = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 4, 5);
		
		dropdown("text", pm.getInstancesearch().getLocation(), location);
		
		String hotel = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 5, 5);
		
		dropdown("value", pm.getInstancesearch().getHotels(), hotel);
		
		String room_type = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 6, 5);
		
		dropdown("value", pm.getInstancesearch().getRoom_type(), room_type);
		
		String room_nos = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 7, 5);
		
		dropdown("value", pm.getInstancesearch().getRoom_nos(), room_nos);		
		
		String check_in = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 8, 5);
		
		inputvalue(pm.getInstancesearch().getDatepick_in(), check_in);
		
		String check_out = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 9, 5);

		inputvalue(pm.getInstancesearch().getDatepick_out(),check_out);
		
		String adult = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 10, 5);
	
		dropdown("value", pm.getInstancesearch().getAdult_room(), adult);
		
		String child = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 11, 5);
	
		dropdown("value", pm.getInstancesearch().getChild_room(), child);
		
		clickonElement(pm.getInstancesearch().getSubmit()); 
		sleep(3000);
		
		clickonElement(pm.getInstanceselect().getRadiobutton_0()); 

		clickonElement(pm.getInstanceselect().getContinue_1()); 		
		sleep(3000);
		
		String first_name = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 15, 5);
		
		inputvalue(pm.getInstancebook().getFirst_name(), first_name);
		
		String last_name = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 16, 5);
		
		inputvalue(pm.getInstancebook().getLast_name(), last_name);
		
		String address = read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 17, 5);
		
		inputvalue(pm.getInstancebook().getAddress(),address);
		
		String card=read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 18, 5);
		
		inputvalue(pm.getInstancebook().getCc_num(), card);
		
		String type=read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 19, 5);
		
		dropdown("value", pm.getInstancebook().getCc_type(), type);
		
		String month=read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 20, 5);
		
		dropdown("value", pm.getInstancebook().getCc_exp_month(), month);
		
		String year=read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 21, 5);
		
		dropdown("value", pm.getInstancebook().getCc_exp_year(), year);
		
		String cvv=read_Particular("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Adactin_TestCases.xlsx", 22, 5);
		
		inputvalue(pm.getInstancebook().getCc_cvv(), cvv);
		
		clickonElement(pm.getInstancebook().getBook_now()); 
		sleep(3000);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s11=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\Screenshots\\booking1.png");
		FileUtils.copyFile(s11,d1);
		sleep(3000);
		
		log.fatal("Completed");

		

}


}


