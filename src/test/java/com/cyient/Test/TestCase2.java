package com.cyient.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TestCase2 {
	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
	      
	      // Set your access credentials
	      caps.setCapability("browserstack.user", "anjalidewangan_SNflt6");
	      caps.setCapability("browserstack.key", "Z7qhHTCpEPtJq4qf7qUa");
	      
	      // Set URL of the application under test
	      caps.setCapability("app", "bs://20e765a58fd9116e41e7fb010a7e0dba831e9997");
	      
	      // Specify device and os_version for testing
	      caps.setCapability("device", "Google Pixel 3");
	      caps.setCapability("os_version", "9.0");
	        
	      // Set other BrowserStack capabilities
	      caps.setCapability("project", "First Java Project Medplus");
	      caps.setCapability("build", "Java Android");
	      caps.setCapability("name", "Inspect_first_test_Medplus");

		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://hub.browserstack.com/wd/hub"),
				caps);
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
	}

}
