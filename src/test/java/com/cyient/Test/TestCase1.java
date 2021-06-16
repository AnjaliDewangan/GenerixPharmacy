package com.cyient.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestCase1 {

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
	      caps.setCapability("project", "First Java Project");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "first_test");
	        
	      
	      // Initialise the remote Webdriver using BrowserStack remote URL
	      // and desired capabilities defined above
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
	            new URL("http://hub.browserstack.com/wd/hub"), caps);
	        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

	      /* Write your Custom code here */
	        driver.findElementByXPath("//*[@resource-id='com.generix_Pharmacy:id/btnSkipContinue']").click();	
	        
//	        driver.findElementByXPath("//*[@text='Skip']").click();
	        
	        driver.findElementByXPath("//*[@text='New user? Create Account']").click();
	        driver.findElementByXPath("//android.widget.EditText").sendKeys("ANJALI DEWANGAN");
//	        driver.findElementByXPath("//android.widget.EditText[2]").sendKeys("anjalidewangan98271@gmail.com");
//	        driver.findElementByXPath("//android.widget.EditText[3]").sendKeys("8596988607");
//	        driver.findElementByXPath("//android.widget.EditText[4]").sendKeys("Anjali98271");
//	        driver.findElementByXPath("//android.widget.EditText[4]").sendKeys("Anjali98271");
	        
	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Email\")").sendKeys("anjalidewangan98271@gmail.com");
	    	driver.findElementByAndroidUIAutomator("UiSelector().text(\"Mobile Number*\")").sendKeys("8596988607");
	    	driver.findElementByAndroidUIAutomator("UiSelector().text(\"Password\")").sendKeys("Anjali98271");
	    	driver.findElementByAndroidUIAutomator("UiSelector().text(\"Confirm Password\")").sendKeys("Anjali98271");


//	        
	        driver.findElementByXPath("//android.widget.CheckBox").click();
	        driver.findElementByXPath("//*[@text='Register']").click();
	        
	      // Invoke driver.quit() after the test is done to indicate that the test is completed.
	      driver.quit();
	    
	}
		
	}
