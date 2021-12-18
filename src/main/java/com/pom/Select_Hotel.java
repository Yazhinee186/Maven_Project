package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;	
	
	@FindBy(id="continue")
	private WebElement continue_1;	
	
public Select_Hotel(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);	
		
	}

public WebElement getRadiobutton_0() {
	return radiobutton_0;
}

public WebElement getContinue_1() {
	return continue_1;
}



}
