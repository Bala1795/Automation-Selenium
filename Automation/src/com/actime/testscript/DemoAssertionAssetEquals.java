package com.actime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertionAssetEquals {
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
Assert.assertEquals(aTitle, eTitle);
driver.close();
}
}//testcase and comparison fails,so execution stops & browser not closed