package com.demo.business;

import org.openqa.selenium.WebDriver;

import com.demo.page.Sample_01_;

public class Sample_01 extends Sample_01_ {

	public Sample_01(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   public void formFillup(String fname, String lname, String addr){
	  getFname().clear();
	  getFname().sendKeys(fname);
	  getLname().clear();
	  getLname().sendKeys(lname);
	  getAddress().clear();
	  getAddress().sendKeys(addr);
   }
}
