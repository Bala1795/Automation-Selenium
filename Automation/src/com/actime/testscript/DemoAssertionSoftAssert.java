package com.actime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertionSoftAssert {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public static void verifytitle() {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
String eTitle="Soogle";
String aTitle=driver.getTitle();
SoftAssert s= new SoftAssert();//obj creation bcoz of non-static methods of softassert class
s.assertEquals(aTitle, eTitle);
driver.close();
s.assertAll();//update the status,any statement after  this method not executed if comparison fails
}
}
