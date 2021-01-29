package com.POM1.qa.BaseClass;

import java.util.concurrent.TimeUnit;



import com.POM1.qa.BrowserFactory.BrowserFactory;

public class baseClass extends BrowserFactory{
	
  
	public void initialize(){

		    driver=CreateBrowserInstance("chrome");		

            driver.manage().window().maximize();

        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	//Test cleanup
	public void TeardownTest()
    {
      driver.quit();
    }
}
