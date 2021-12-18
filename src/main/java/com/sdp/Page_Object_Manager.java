package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Hotel;
import com.pom.Home_Page;
import com.pom.Search_Hotel;
import com.pom.Select_Hotel;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private Home_Page hp;
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_Hotel book;
	
	
public Page_Object_Manager(WebDriver driver2) {
		
		this.driver=driver2;
		
}

	public Home_Page getInstancehp() {
		
		if(hp==null) {
			hp=new Home_Page(driver);
		}
		return hp;
	}
	
	public Book_Hotel getInstancebook() {
		
		if(book==null) {
			book=new Book_Hotel(driver);
		}
		return book;
	}
	
	public Search_Hotel getInstancesearch() {
		
		if(search==null) {
			search=new Search_Hotel(driver);
		}
		return search;
	}
	
	public Select_Hotel getInstanceselect() {
		
		if(select==null) {
			select=new Select_Hotel(driver);
		}
		return select;
	}
	
}
