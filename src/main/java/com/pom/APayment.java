package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APayment {
	
	public WebDriver driver;


	
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement payment;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirmation;
	
	
	
	public WebElement getPayment() {
		return payment;
	}



	public WebElement getConfirmation() {
		return confirmation;
	}



	public APayment(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);	
}

}
