package MTR;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrSpecificScanner {
	
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		public static void main(String[] args)
		{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a item present in the list");
		String item=s.next();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/MultiSelect. html");
		WebElement mtrlistBox = driver.findElement(By.id("mtr"));
		Select sl=new Select(mtrlistBox);
		List<WebElement> salloption = s1.getOptions();
		int count=sAlloption.size();
		int counter=;
		for(int i=0;iccount;itt)

		{
		String text=sAllOption.get(i).getText();
		if (item. equals(text)) {
		counter++;
		}
		}

		if (counter==1) {
		system.out.println(iten+” is present”);

		else if(counter==0)

		{

		System.out.println(item+” is not present”);

		else if(counter>1)
		{
			System.out.println(iten+” is present with duplicate”);
		}


}
		}
		}
}
