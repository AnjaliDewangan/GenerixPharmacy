package com.cyient.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase2 {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	    
	      DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "anjalidewangan_j4t1EP");
	      caps.setCapability("browserstack.key", "YzWvva94H15ZvuXGKQJo");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://970aadfe25709b87224a5e4a0eb418bcf8e6a931");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "Generic Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "pharmacy_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        

	      /* Write your Custom code here */
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	        
	        driver.findElementByXPath("//*[@resource-id='com.generix_Pharmacy:id/btnSkipContinue']").click();

	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Email / Mobile No.\")").sendKeys("anjalidewangan98271@gmail.com");
	        Thread.sleep(1000);
	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Password\")").sendKeys("Anjali98271");
	        Thread.sleep(1000);
	        driver.findElementByXPath("//*[@text='Login']").click();
	        Thread.sleep(1000);
//SCROLL
//	        String visibleText = "GENERICS";
//	        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"+ visibleText + "\").instance(0))").click();
//
//	        driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"com.generix_Pharmacy:id/txtCategoryName\")").click();

	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	    
	    }
		
		
	}

