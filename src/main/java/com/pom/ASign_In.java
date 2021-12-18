package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ASign_In {

	public WebDriver driver;
	

	
	@FindBy(id="id_gender2")
	private WebElement title;
	
	@FindBy(id="customer_firstname")
	private WebElement firstname;
	
	@FindBy(id="customer_lastname")
	private WebElement lastname;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="firstname")
	private WebElement firstname1;
	
	@FindBy(id="lastname")
	private WebElement lastname1;
	
	@FindBy(id="address1")
	private WebElement address1;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
	private WebElement postcode;
		
	@FindBy(id="id_country")
	private WebElement id_country;
	
	@FindBy(id="phone_mobile")
	private WebElement phone_mobile;
	
	@FindBy(id="submitAccount")
	private WebElement submitAccount;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getFirstname1() {
		return firstname1;
	}

	public WebElement getLastname1() {
		return lastname1;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getId_country() {
		return id_country;
	}

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	public WebElement getSubmitAccount() {
		return submitAccount;
	}
	
	public ASign_In(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);	
	}
	
}
