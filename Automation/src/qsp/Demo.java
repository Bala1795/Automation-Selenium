package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		ChromeDriver c= new ChromeDriver();// we use objrefvar as driver also 
		c.get("https://www.google.com");//to open the browser
c.close();//to close the browser
	}

}
