package com.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.Maven_Project.Base_Class;



public class Runner_Miniproject2 extends Base_Class{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		
		driver= getBrowser("chrome");		
		
		url("https://www.google.co.in/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		inputvalue(search,"Adactin Automation");
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		sleep(3000);
		
		WebElement search_Result = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		clickonElement(search_Result); 
		sleep(3000);
		
		/*New Registration
		 
		WebElement register = driver.findElement(By.xpath("//a[@href='Register.php']"));
		register.click();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Yazhinee");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Indrajith");
		WebElement re_password = driver.findElement(By.id("re_password"));
		re_password.sendKeys("Indrajith");
		WebElement full_name = driver.findElement(By.id("full_name"));
		full_name.sendKeys("Yazhinee Dinesh");
		WebElement email_add = driver.findElement(By.id("email_add"));
		email_add.sendKeys("yazh@gmail.com");
		WebElement captcha = driver.findElement(By.id("captcha-form"));
		captcha.sendKeys("perryman");
		WebElement agree = driver.findElement(By.id("tnc_box"));
		agree.click();
		WebElement Submit = driver.findElement(By.id("Submit"));
		Submit.click();
		Thread.sleep(3000);
		
		*/
		WebElement username = driver.findElement(By.id("username"));
		inputvalue(username,"Indrajith");
		
		WebElement password = driver.findElement(By.id("password"));
		inputvalue(password,"I660Q2");
		
		WebElement login = driver.findElement(By.id("login"));
		clickonElement(login); 
		
		sleep(3000);
		
		WebElement location = driver.findElement(By.id("location"));			
		dropdown("text", location, "Melbourne");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		dropdown("value", hotels, "Hotel Cornice");
		
		
		WebElement room_type = driver.findElement(By.id("room_type"));
		dropdown("value", room_type, "Deluxe");
		
	
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		dropdown("value", room_nos, "4");		
		
		WebElement date = driver.findElement(By.id("datepick_in"));
		inputvalue(date, "18/12/2021");
		
		WebElement date1 = driver.findElement(By.id("datepick_out"));
		inputvalue(date1, "23/12/2021");
				
		WebElement adult = driver.findElement(By.id("adult_room"));
		dropdown("value", adult, "2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		dropdown("value", child, "2");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		clickonElement(submit); 
		sleep(3000);
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		clickonElement(radio); 
		
		WebElement continue_1 = driver.findElement(By.id("continue"));
		clickonElement(continue_1); 		
		sleep(3000);
		
		WebElement first_name = driver.findElement(By.id("first_name"));
		inputvalue(first_name, "Indrajith");
		
		WebElement last_name = driver.findElement(By.id("last_name"));
		inputvalue(last_name, "Dinesh");
		
		WebElement address = driver.findElement(By.id("address"));
		inputvalue(address, "82,dummy text,xyz");
		
		WebElement cc_num = driver.findElement(By.id("cc_num"));
		inputvalue(cc_num, "1234 5678 9012 3456");
		
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		dropdown("value", cc_type, "MAST");
		
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		dropdown("value", cc_exp_month, "4");
			
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		dropdown("value", cc_exp_year, "2022");
		
			
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		inputvalue(cc_cvv, "678");
		
		WebElement book_now = driver.findElement(By.id("book_now"));
		clickonElement(book_now); 
		sleep(3000);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s11=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\Screenshots\\error.png");
		FileUtils.copyFile(s11,d1);
		sleep(3000);
		

}


}

