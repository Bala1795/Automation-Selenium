package MTR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrAlphabeticalOrder {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Balu/Desktop/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s= new Select (mtrListBox);
		List<WebElement> alloptions = s.getOptions();
		int count = alloptions.size();
		/*ArrayList <String> a= new ArrayList <String> (); 
		for(int i=0;i<count;i++)                           
		{
			String text=alloptions.get(i).getText();
			a.add(text);
		}
		Collections.sort(a);
		for(String b:a)
		{
			System.out.println(b);
		}*/
		TreeSet<String> ts = new TreeSet<String>(); 
		 for(int i=0;i<count;i++)
		 {
String text= alloptions.get(i).getText();
              ts.add(text);
                }
for(String text:ts) 
{
System.out.println(text);
}
		 
		
		
		
	}

}
