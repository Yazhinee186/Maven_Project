package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.AAddress;
import com.pom.ACasual_Dress;
import com.pom.ACreate_Account;
import com.pom.AHome_Page;
import com.pom.APayment;
import com.pom.AShipping;
import com.pom.ASign_In;
import com.pom.ASummary;
import com.pom.Home_Page;

public class Automation_PageObjectManager {
	
	public static WebDriver driver;
	
	private AHome_Page hp;
	private AAddress aa;
	private ACasual_Dress cd;
	private ACreate_Account ac;
	private APayment p;
	private AShipping s;
	private ASign_In in;
    private ASummary sum;
    
	
public Automation_PageObjectManager(WebDriver driver2) {
		
		this.driver=driver2;	

}


public AHome_Page getInstancehp() {
	
	if(hp==null) {
		hp=new AHome_Page(driver);
	}
	return hp;
}

public AAddress getInstanceaa() {
	
	if(aa==null) {
		aa=new AAddress(driver);
	}
	return aa;
}


public ACasual_Dress getInstancecd() {
	
	if(cd==null) {
		cd=new ACasual_Dress(driver);
	}
	return cd;
}

public ACreate_Account getInstanceac() {
	
	if(ac==null) {
		ac=new ACreate_Account(driver);
	}
	return ac;
}

public APayment getInstancep() {
	
	if(p==null) {
		p=new APayment(driver);
	}
	return p;
}

public AShipping getInstances() {
	
	if(s==null) {
		s=new AShipping(driver);
	}
	return s;
}

public ASign_In getInstancein() {
	
	if(in==null) {
		in=new ASign_In(driver);
	}
	return in;
}

public ASummary getInstancesum() {
	
	if(sum==null) {
		sum=new ASummary(driver);
	}
	return sum;
}

}
