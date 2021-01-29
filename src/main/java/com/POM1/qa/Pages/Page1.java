package com.POM1.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.POM1.qa.BaseClass.baseClass;

import io.qameta.allure.Step;

public class Page1 extends baseClass{

	WebDriver driver;

	// VV IMP to Create Consturctor in every PageClass

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public Page1(WebDriver driver) {
		this.driver = driver;
	}


	// Define all locators related to : WelcomePage here only...

	// Element1
	By NameField = By.cssSelector("body > app-root > form-comp > div > form > div:nth-child(1) > input");

	// Element2
	By EmailField = By.cssSelector("body > app-root > form-comp > div > form > div:nth-child(2) > input");

	// Element3
	By SubmitBtn = By.cssSelector("body > app-root > form-comp > div > form > input");

	// Element4
	By textBox2 = By.cssSelector("body > app-root > form-comp > div > h4 > input");

	// Element5
	By successMsg = By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]");

	// WelcomePage Methods --To be linked to testCases

	// Method1
	@Step("Entering name in Textbox1")
	public void EnterNameTextbox1(String str) {
		driver.findElement(NameField).sendKeys(str);
	}

	@Step("Getting name of textbox 1")
	public String GetNameTextbox1() {
		String enteredName = driver.findElement(NameField).getText();
		return enteredName;
	}

	@Step("Entering email in Email Textbox")
	public void EnterEmail(String str1) {
		driver.findElement(EmailField).sendKeys(str1);
	}

	// Method3
	@Step("Click Submit Button")
	public void ClickSubmitBtn() {
		driver.findElement(SubmitBtn).click();
	}

	// Method 4
	@Step("Get Welcome Page Title")
	public String GettitleofWelcomePage() {
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String titleWlcm = driver.getTitle();
		return titleWlcm;
	}
    
	@Step("Get text entered in Textbox 2")
	public String getTextofTextbox2() {

		String text2 = driver.findElement(textBox2).getText();
		return text2;

	}
	
	@Step("Click on Text box 2")
	public void ClickTextBox2()
	{
		driver.findElement(textBox2).click();
	}

	@Step("Get success Msg")
	public String getSuccessMessage() {
		String msg = driver.findElement(successMsg).getText();
	    return msg;
	}
	
	
	@Step("Get Welcome Page url")
	public String PageUrl()
	{
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		String WlcmUrl=driver.getCurrentUrl();
		return WlcmUrl;
	}
	
	
	@Step("Title Value Verification")
	public boolean TitleComparison()
	{
		String actualTitle=driver.getTitle();
		String expectedTitle="ProtoCommerce";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			return true;
		else
			return false;
		
	}
	
	@Step("Url Value Verification")
	public boolean UrlComparison()
	{
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://rahulshettyacademy.com/angularpractice/";
		
		if(actualUrl.equalsIgnoreCase(expectedUrl))
			return true;
		else
			return false;
		
	}
	
	
	@Step("Textbox value comparison")
	public boolean textboxvalueComparison()
	{
		
		String valueTextbox1=GetNameTextbox1();
	    String valueTextbox2=getTextofTextbox2();
	    if(valueTextbox1.equals(valueTextbox2))
	    	return true;
	    else
	    	return false;
	}
	
	@Step("Open Welcome Page ")
	public void OpenWelcomePage()
	{
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	}
	
	
	
}
