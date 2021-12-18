package com.runner;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.Base_Class;
import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;
import com.sdp.Page_Object_Manager;

public class SDP_Runner extends Base_Class{
	
	public static WebDriver driver=getBrowser("chrome");
	
	public static Page_Object_Manager pm=new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		url("https://adactinhotelapp.com/");
		sleep(3000);
			
		inputvalue(pm.getInstancehp().getEmail(),"Indrajith");
		
		inputvalue(pm.getInstancehp().getPassword(),"I660Q2");
		
		clickonElement(pm.getInstancehp().getLogin()); 
		
		sleep(3000);
		
		dropdown("text", pm.getInstancesearch().getLocation(), "Melbourne");
		
		dropdown("value", pm.getInstancesearch().getHotels(), "Hotel Cornice");
		
		dropdown("value", pm.getInstancesearch().getRoom_type(), "Deluxe");
		
		dropdown("value", pm.getInstancesearch().getRoom_nos(), "4");		
		
		inputvalue(pm.getInstancesearch().getDatepick_in(), "18/12/2021");

		inputvalue(pm.getInstancesearch().getDatepick_out(), "23/12/2021");
	
		dropdown("value", pm.getInstancesearch().getAdult_room(), "2");
	
		dropdown("value", pm.getInstancesearch().getChild_room(), "2");
		
		clickonElement(pm.getInstancesearch().getSubmit()); 
		sleep(3000);
		
		clickonElement(pm.getInstanceselect().getRadiobutton_0()); 

		clickonElement(pm.getInstanceselect().getContinue_1()); 		
		sleep(3000);
		
		inputvalue(pm.getInstancebook().getFirst_name(), "Indrajith");
		
		inputvalue(pm.getInstancebook().getLast_name(), "Dinesh");
		
		inputvalue(pm.getInstancebook().getAddress(), "82,dummy text,xyz");
		
		inputvalue(pm.getInstancebook().getCc_num(), "1234 5678 9012 3456");
		
		dropdown("value", pm.getInstancebook().getCc_type(), "MAST");
		
		dropdown("value", pm.getInstancebook().getCc_exp_month(), "4");
		
		dropdown("value", pm.getInstancebook().getCc_exp_year(), "2022");
		
		inputvalue(pm.getInstancebook().getCc_cvv(), "678");
		
		clickonElement(pm.getInstancebook().getBook_now()); 
		sleep(3000);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s11=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\Screenshots\\booking1.png");
		FileUtils.copyFile(s11,d1);
		sleep(3000);
		

}


}


