package com.POM1.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

import org.openqa.selenium.support.PageFactory;


import com.POM1.qa.BaseClass.baseClass;
import com.POM1.qa.Pages.Page1;

import io.qameta.allure.Description;

public class Page1TestCases extends baseClass{

	@BeforeMethod   // It will Run Before every test method/ methods on this page 
	public void OpenPage()
	{
		initialize();
		Page1 w = PageFactory.initElements(driver, Page1.class);
		w.OpenWelcomePage();
	}
	
	
	
	
//TESTCASE 1:	
	@Test(priority = 1, description = "Verify WelcomePage Url")
	@Description("Test1: Welcome Page Url Verification.")
	public void VerifyWelcomePageUrl() throws InterruptedException {
		// Use page references

		Page1 w = PageFactory.initElements(driver, Page1.class);
		AssertJUnit.assertEquals(w.UrlComparison(), true);
		Thread.sleep(5000);
	}

//TESTCASE 2:
	@Test(priority = 2, description = "Verify WelcomePage Title")
	@Description("Test2: Welcome Page Title Verification.")
	public void VerifyWelcomePageTitle() throws InterruptedException {

		// Creating object of Page classes required
		Page1 w = PageFactory.initElements(driver, Page1.class);

		w.OpenWelcomePage();

		AssertJUnit.assertEquals(w.TitleComparison(), true);
		Thread.sleep(5000);
	}

	
//TESTCASE 3:
	@Test(priority = 3, description = "Verify text returned is same as Name entered")
	@Description("Test3: TextBoxes value Verification.")
	public void VerifyTextofBothTextboxes() throws InterruptedException {

		Page1 w = PageFactory.initElements(driver, Page1.class);
		// Process
		w.OpenWelcomePage(); // Step1: opening Welcome Page Url
		Thread.sleep(2000);		w.EnterNameTextbox1("Amit"); // Step2: Enter name in Textbox1
		Thread.sleep(2000);
		w.ClickTextBox2(); // Step3: Get Text of Textbox2
		// Forced Test Failure
		Assert.assertTrue(false);
		Assert.assertEquals(w.textboxvalueComparison(), true);
	}
	
	
	@AfterMethod // It will run After Every Test Method/ methods on  this file
	public void ClosePage()
	{
		driver.close();
	}


}
