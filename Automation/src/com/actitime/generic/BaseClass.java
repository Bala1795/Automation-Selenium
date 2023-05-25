package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static WebDriver driver;
	
	@BeforeTest
	public void  openBrowser() {
		Reporter.log("Openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterTest
	
	public void closeBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("Login",true);
	FileLib f= new FileLib();
	String url = f.getProperty("url");
	String un = f.getProperty("username");
	String pw = f.getProperty("password");
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	
}
@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
	driver.findElement(By.id("logoutLink")).click();
	
}
}
