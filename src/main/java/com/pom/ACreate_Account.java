package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACreate_Account {

	public WebDriver driver;
	
	@FindBy(id="email_create")
	private WebElement account;
	
	@FindBy(id="SubmitCreate")
	private WebElement create;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getCreate() {
		return create;
	}
	
	public ACreate_Account(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);	
}
}
