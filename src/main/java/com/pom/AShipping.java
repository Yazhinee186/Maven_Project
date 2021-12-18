package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AShipping {
	
	public WebDriver driver;

	@FindBy(id="uniform-cgv")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement checkout3;
	
	

	public WebElement getCheckbox() {
		return checkbox;
	}



	public WebElement getCheckout3() {
		return checkout3;
	}



	public AShipping(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);	
	}
	
}
