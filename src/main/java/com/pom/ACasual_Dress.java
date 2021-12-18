package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACasual_Dress {
	
	public WebDriver driver;

	@FindBy(xpath="(//a[@class='subcategory-name'])[1]")
	private WebElement casual_dress;
	
	@FindBy(xpath="//span[@class='available-now']")
	private WebElement instock;
	
	@FindBy(xpath="//a[@class='button ajax_add_to_cart_button btn btn-default']")
	private WebElement cart;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement checkout;
	
	public WebElement getCasual_dress() {
		return casual_dress;
	}

	public WebElement getInstock() {
		return instock;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	public ACasual_Dress(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);	
}

}
