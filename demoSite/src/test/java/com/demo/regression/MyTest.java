package com.demo.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.demo.business.Sample_01;
import com.demo.site.Base;

public class MyTest {

	@Test
	public void test01(){
		Base b = new Base();
		WebDriver driver = b.getDriver("FF");
		Sample_01 sample = PageFactory.initElements(driver, Sample_01.class);
		String url = "http://demo.tanmaysarkar.com/sample_01.html";
		driver.get(url);
		driver.manage().window().maximize();
		sample.formFillup("srinivas", "dodda", "Hyderabad");
		driver.close();
	}
	
}
