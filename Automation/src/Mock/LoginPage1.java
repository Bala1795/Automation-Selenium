package Mock;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 {
	@FindBy(id="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement logbtn;
	
	
	

	public void setLogin1(String un,String pw) 
	{
	untbx.sendKeys(un);
    pwtbx.sendKeys(pw);
    logbtn.click();
}
}