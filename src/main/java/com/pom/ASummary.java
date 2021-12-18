package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ASummary {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@class='cart_quantity_input form-control grey']")
	private WebElement quantity;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed;

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public ASummary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);	
	}

}
