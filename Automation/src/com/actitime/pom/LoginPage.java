package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement logbtn;
	
	public LoginPage(WebDriver driver) 
	{
	untbx=driver.findElement(By.id("username"));
	pwtbx=driver.findElement(By.name("pwd"));
	logbtn=driver.findElement(By.xpath("//div[.='Login ']"));	
	
	}
	
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
        pwtbx.sendKeys(pw);
        logbtn.click();
}

}



