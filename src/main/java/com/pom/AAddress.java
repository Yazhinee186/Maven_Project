package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AAddress {
	
	public WebDriver driver;	


	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement checkout2;
	

	public WebElement getCheckout2() {
		return checkout2;
	}
	
	public AAddress(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);	
}
}
