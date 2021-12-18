package com.runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test_Runner {
	
public static void main(String[] args) throws AWTException, InterruptedException, IOException  {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver_96.exe");
		WebDriver driver=new ChromeDriver();
		
		//Google - Search Engine
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//Google - Entering search keyword
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("Automation Practice.com");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
		//WebElement google_Search = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		//google_Search.click();
		
		//Clicking the search result
		WebElement search_Result = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		search_Result.click();
		Thread.sleep(3000);
		
		//Redirecting to Automation Practice.com
		
		//Mouse Hover on Women
		WebElement women = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[1]"));
		Actions s=new Actions(driver);
		s.moveToElement(women).build().perform();
	
		//Selecting Casual dress from women
		WebElement dresses = driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[3]"));
		dresses.click();
		Thread.sleep(3000);

		WebElement casual_dress = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[1]"));
		casual_dress.click();
		Thread.sleep(3000);

		//mouse hovering on in stock
		WebElement instock = driver.findElement(By.xpath("//span[@class='available-now']"));
		s.moveToElement(instock).build().perform();
		
		//adding to the cart
		
		WebElement cart = driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']"));
		cart.click();
		Thread.sleep(3000);
		
		//Proceed to checkout

		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		checkout.click();
		Thread.sleep(3000);

		
		//Increasing the quantity of dress
		WebElement quantity = driver.findElement(By.xpath("//input[@class='cart_quantity_input form-control grey']"));
		quantity.sendKeys("9");
		
		//Proceed to checkout
		WebElement proceed = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		proceed.click();
		Thread.sleep(3000);
		
		//create an account
		WebElement account = driver.findElement(By.id("email_create"));
		account.sendKeys("imk@gmail.com");
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		Thread.sleep(3000);

		//Form
		WebElement title = driver.findElement(By.id("id_gender2"));
		title.click();
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("sree");
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("M");
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("lmnoyp");
		
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
		firstname1.sendKeys("sree");
		WebElement lastname1 = driver.findElement(By.id("lastname"));
		lastname1.sendKeys("M");
		WebElement address1 = driver.findElement(By.id("address1"));
		address1.sendKeys("82,ikh road");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("chennai");
		WebElement state = driver.findElement(By.id("id_state"));
		Select o = new Select(state);
		o.selectByVisibleText("Texas");
		WebElement postcode = driver.findElement(By.id("postcode"));
		postcode.sendKeys("00000");
		WebElement id_country = driver.findElement(By.id("id_country"));
		Select t = new Select(id_country);
		t.selectByValue("21");
		WebElement phone_mobile = driver.findElement(By.id("phone_mobile"));
		phone_mobile.sendKeys("987456222");
		WebElement submitAccount = driver.findElement(By.id("submitAccount"));
		submitAccount.click();
		Thread.sleep(3000);
		
		//Proceed to checkout
		WebElement checkout2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		checkout2.click();
		Thread.sleep(3000);
		
		//shipping
		WebElement checkbox = driver.findElement(By.id("uniform-cgv"));
		checkbox.click();		
		WebElement checkout3 = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		checkout3.click();
		Thread.sleep(3000);
		
		//payment
		WebElement payment = driver.findElement(By.xpath("//a[@class='bankwire']"));
		payment.click();
		Thread.sleep(3000);
		
		//Order Confirmation
		WebElement Confirmation = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		Confirmation.click();
		Thread.sleep(3000);
		
		//Screenshot
		//TakesScreenshot ts=(TakesScreenshot) driver;
		//File d=ts.getScreenshotAs(OutputType.FILE);
		//File r=new File("C:\\Users\\Orpak\\eclipse-workspace\\Greens_Selinium\\Screenshot\\error2.png");
		//FileUtils.copyFile(d,r);
		//Thread.sleep(3000);
		

	}

}



