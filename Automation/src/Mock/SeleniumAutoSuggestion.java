package Mock;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoSuggestion {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();//opening the browser
	driver.get("https://www.google.com/");//opening the url
	driver.findElement(By.name("q")).sendKeys("selenium");//in search box type selenium,b4 enter inspect
	Thread.sleep(2000);//using bcoz new window is opening
	
	List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
    System.out.println(allSugg.size());
    for (WebElement a:allSugg)
    {
    	System.out.println(a.getText());
    }
	/*for(int i=0;i<allSugg.size();i++)
	{
	 String text = allSugg.get(i).getText();
	 System.out.println(text);
	}*/
	allSugg.get(allSugg.size()-1).click();// after geting text click lastb4 Autosuggestion
	driver.close();
}
}

