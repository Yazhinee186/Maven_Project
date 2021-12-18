package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AHome_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[1]")
	private WebElement women;
	
	@FindBy(xpath="(//a[@class='sf-with-ul'])[3]")
	private WebElement dresses;
	

	public WebElement getWomen() {
		return women;
	}


	public WebElement getDresses() {
		return dresses;
	}

	
	public AHome_Page(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);	
}

}
