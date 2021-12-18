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
import com.logger.Property_Log;
	import com.pom.AAddress;
	import com.pom.ACasual_Dress;
	import com.pom.ACreate_Account;
	import com.pom.AHome_Page;
	import com.pom.APayment;
	import com.pom.AShipping;
	import com.pom.ASign_In;
	import com.pom.ASummary;

	public class Automation_Pom extends Base_Class{
		
		public static WebDriver driver=getBrowser("chrome");
		
		static Logger log=Logger.getLogger(Property_Log.class);
		
		public static AHome_Page hp =new AHome_Page(driver);
		public static AAddress aa=new AAddress(driver);
		public static ACasual_Dress cd=new ACasual_Dress(driver);
		public static ACreate_Account ac=new ACreate_Account(driver);
		public static APayment p=new APayment(driver);
		public static AShipping s=new AShipping(driver);
		public static ASign_In in=new ASign_In(driver);
		public static ASummary sum=new ASummary(driver);
		
		
	public static void main(String[] args) throws AWTException, InterruptedException, IOException  {
			
			PropertyConfigurator.configure("log4j.properties");
		
			log.info("URL Launch Initiated");	
				
			url("http://automationpractice.com/index.php");
			
			log.warn("URL Launched Successfully");
			
			sleep(3000);
			
			//Mouse Hover on Women
			WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
			actions("moveToElement", hp.getWomen());
				
			//Selecting Casual dress from women
			WebElement dresses = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[3]"));
			clickonElement(hp.getDresses());
			
			sleep(3000);

			WebElement casual_dress = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[1]"));
			clickonElement(cd.getCasual_dress());
			sleep(3000);

			//mouse hovering on in stock
			WebElement instock = driver.findElement(By.xpath("//span[@class='available-now']"));
			actions("moveToElement", cd.getInstock());
			
			//adding to the cart
			
			WebElement cart = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
			clickonElement(cd.getCart());
			sleep(3000);
			
			//Proceed to checkout

			WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
			clickonElement(cd.getCheckout());
			sleep(3000);

			
			//Increasing the quantity of dress
			WebElement quantity = driver.findElement(By.xpath("//input[@class='cart_quantity_input form-control grey']"));
			inputvalue(sum.getQuantity(), "9");
					
			//Proceed to checkout
			WebElement proceed = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
			clickonElement(sum.getProceed());
			sleep(3000);
			
			//create an account
			WebElement account = driver.findElement(By.id("email_create"));
			inputvalue(ac.getAccount(), "imk@gmail.com");
			
			WebElement create = driver.findElement(By.id("SubmitCreate"));
			clickonElement(ac.getCreate());
			sleep(3000);

			//Form
			WebElement title = driver.findElement(By.id("id_gender2"));
			clickonElement(in.getTitle());
			WebElement firstname = driver.findElement(By.id("customer_firstname"));
			inputvalue(in.getFirstname(), "sree");
			WebElement lastname = driver.findElement(By.id("customer_lastname"));
			inputvalue(in.getLastname(), "M");
			WebElement password = driver.findElement(By.id("passwd"));
			inputvalue(in.getPassword(), " ");
			
			/*WebElement date = driver.findElement(By.id("uniform-days"));
			Select y = new Select(date);
			y.selectByValue("18");
			WebElement months = driver.findElement(By.id("months"));
			Select f = new Select(months);
			f.selectByValue("6");
			WebElement year = driver.findElement(By.id("years"));
			Select j = new Select(year);
			j.selectByValue("1989");*/
			
			WebElement firstname1 = driver.findElement(By.id("firstname"));
			inputvalue(in.getFirstname1(), "sree");
			WebElement lastname1 = driver.findElement(By.id("lastname"));
			inputvalue(in.getLastname1(), "M");
			WebElement address1 = driver.findElement(By.id("address1"));
			inputvalue(in.getAddress1(), "82,ikh road");
			WebElement city = driver.findElement(By.id("city"));
			inputvalue(in.getCity(), "chennai");
			WebElement state = driver.findElement(By.id("id_state"));
			dropdown("Text", in.getState(), "Texas");
			
			WebElement postcode = driver.findElement(By.id("postcode"));
			inputvalue(in.getPostcode(), "00000");
			WebElement id_country = driver.findElement(By.id("id_country"));
			dropdown("value", in.getId_country(), "21");
			
			WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
			inputvalue(in.getPhone_mobile(), "987456222");
			WebElement submitAccount = driver.findElement(By.id("submitAccount"));
			clickonElement(in.getSubmitAccount());
			sleep(3000);
		
			//Proceed to checkout
			WebElement checkout2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
			clickonElement(aa.getCheckout2());
			sleep(3000);
			
			
			//shipping
			WebElement checkbox = driver.findElement(By.id("uniform-cgv"));
			clickonElement(s.getCheckbox());
			WebElement checkout3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
			clickonElement(s.getCheckout3());
			sleep(3000);		
			//payment
			WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
			clickonElement(p.getPayment());
			sleep(3000);
			
			//Order Confirmation
			WebElement Confirmation = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
			clickonElement(p.getConfirmation());
			sleep(3000);
			
			//Screenshot
			TakesScreenshot ts=(TakesScreenshot) driver;
			File d=ts.getScreenshotAs(OutputType.FILE);
			File r=new File("C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Screenshot\\error2.png");
			FileUtils.copyFile(d,r);
			sleep(3000);
			
			log.fatal("Completed");
			

		}


	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	}


