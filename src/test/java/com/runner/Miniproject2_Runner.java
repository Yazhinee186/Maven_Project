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

public class Miniproject2_Runner {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Adactin Automation");
		
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement search_Result = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		search_Result.click();
		Thread.sleep(3000);
		
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
		username.sendKeys("Indrajith");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Vaiduriya");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(3000);
		WebElement location = driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByVisibleText("Melbourne");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotels);
		s1.selectByValue("Hotel Cornice");
		WebElement room_type = driver.findElement(By.id("room_type"));
		Select s2=new Select(room_type);
		s2.selectByValue("Deluxe");
		WebElement room_nos = driver.findElement(By.id("room_nos"));
		Select s3=new Select(room_nos);
		s3.selectByValue("4");
		WebElement date = driver.findElement(By.id("datepick_in"));
		date.sendKeys("18/12/2021");
		WebElement date1 = driver.findElement(By.id("datepick_out"));
		date1.sendKeys("23/12/2021");
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select s4=new Select(adult);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5=new Select(child);
		s5.selectByValue("2");
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		Thread.sleep(3000);
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement continue_1 = driver.findElement(By.id("continue"));
		continue_1.click();
		Thread.sleep(3000);
		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.sendKeys("Indrajith");
		WebElement last_name = driver.findElement(By.id("last_name"));
		last_name.sendKeys("Dinesh");
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("82,dummy text,xyz");
		WebElement cc_num = driver.findElement(By.id("cc_num"));
		cc_num.sendKeys("1234 5678 9012 3456");
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select s6=new Select(cc_type);
		s6.selectByValue("MAST");
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(cc_exp_month);
		s7.selectByValue("4");
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(cc_exp_year);
		s8.selectByValue("2022");
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys("678");
		WebElement book_now = driver.findElement(By.id("book_now"));
		book_now.click();
		Thread.sleep(3000);
		
		//Screenshot
		TakesScreenshot ts=(TakesScreenshot) driver;
		File s11=ts.getScreenshotAs(OutputType.FILE);
		File d1=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\Screenshots\\error.png");
		FileUtils.copyFile(s11,d1);
		Thread.sleep(3000);
		

}


}
