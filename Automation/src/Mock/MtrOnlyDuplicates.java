package Mock;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrOnlyDuplicates {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Balu/Desktop/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s= new Select (mtrListBox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
TreeSet <String> a= new TreeSet <String>();//use hashset also
		for(int i=0;i<count;i++)
		{
			String text=alloptions.get(i).getText();
			if(a.add(text)==false)
			{
				System.out.println(text);
			}
		}
	}
}
		
	


