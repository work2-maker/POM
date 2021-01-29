package com.POM1.qa.CommonFunctionalities;

import org.openqa.selenium.WebDriver;

import com.POM1.qa.BaseClass.baseClass;

public class commonFunctions extends baseClass{
	WebDriver driver;


	//VV IMP to Create Consturctor in every PageClass

	//Constructor that will be automatically called as soon as the object of the class is created
	public commonFunctions(WebDriver driver) {
		this.driver=driver;
	}
	
		//NavigateToMethod
	    public void NavigateToUrl(String uRl) 
	   {
	    	driver.navigate().to(uRl);
	    }
	    
}
