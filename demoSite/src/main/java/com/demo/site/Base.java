package com.demo.site;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver = null;
	public WebDriver getDriver(String browser){
		
		if(browser.toUpperCase().equals("FF"))
			System.setProperty("webdriver.gecko.driver", "C:\\softwares\\webdrivers\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    return driver;
	        
	}
}
