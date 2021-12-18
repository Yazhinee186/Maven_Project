package com.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Maven_Project.Base_Class;
import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Pom_Runner extends Base_Class{
	
	public static WebDriver driver=getBrowser("chrome");
	
	public static Home_Page hp=new Home_Page(driver);
	public static Book_Hotel book=new Book_Hotel(driver);
	public static Search_Hotel search=new Search_Hotel(driver);
	public static Select_Hotel select=new Select_Hotel(driver);	
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		url("https://adactinhotelapp.com/");
		sleep(3000);
			
		inputvalue(hp.getEmail(),"Indrajith");
		
		inputvalue(hp.getPassword(),"I660Q2");
		
		clickonElement(hp.getLogin()); 
		
		sleep(3000);
		
		dropdown("text", search.getLocation(), "Melbourne");
		
		dropdown("value", search.getHotels(), "Hotel Cornice");
		
		dropdown("value", search.getRoom_type(), "Deluxe");
		
		dropdown("value", search.getRoom_nos(), "4");		
		
		inputvalue(search.getDatepick_in(), "18/12/2021");

		inputvalue(search.getDatepick_out(), "23/12/2021");
	
		dropdown("value", search.getAdult_room(), "2");
	
		dropdown("value", search.getChild_room(), "2");
		
		clickonElement(search.getSubmit()); 
		sleep(3000);
		
		clickonElement(select.getRadiobutton_0()); 

		clickonElement(select.getContinue_1()); 		
		sleep(3000);
		
		inputvalue(book.getFirst_name(), "Indrajith");
		
		inputvalue(book.getLast_name(), "Dinesh");
		
		inputvalue(book.getAddress(), "82,dummy text,xyz");
		
		inputvalue(book.getCc_num(), "1234 5678 9012 3456");
		
		dropdown("value", book.getCc_type(), "MAST");
		
		dropdown("value", book.getCc_exp_month(), "4");
		
		dropdown("value", book.getCc_exp_year(), "2022");
		
		inputvalue(book.getCc_cvv(), "678");
		
		clickonElement(book.getBook_now()); 
		sleep(3000);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s11=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\Screenshots\\booking.png");
		FileUtils.copyFile(s11,d1);
		sleep(3000);
		

}


}


