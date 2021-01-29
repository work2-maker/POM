package com.POM1.qa.Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.POM1.qa.BaseClass.baseClass;

import io.qameta.allure.Attachment;

public class AllureListeners extends baseClass implements ITestListener{
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		saveFailureScreenShot(driver);
		saveTextLog(result.getMethod().getConstructorOrMethod().getName());
	}
	
	
	
	
	




	@Attachment(value="Screenshot",type="image/png")
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}

}
