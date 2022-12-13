package ObjectPges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class loginPage extends TestBase {
	
	public loginPage(WebDriver driver) throws Exception
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		try {
			
			login.isDisplayed();
			
		}catch(Exception e) {
			
			throw new Exception("This is not home page"); 
		}
	}
	
	@FindBy(xpath=".//input[@type=\"submit\"]")
	WebElement login;
	
	@FindBy(xpath=".//input[@id=\"CustomerEmail\"]")
	WebElement userEmail;
	
	@FindBy(xpath=".//input[@id=\"CustomerPassword\"]")
	WebElement userPassword;
	
	@FindBy(xpath="(.//a[contains(@href,'shopcaterpillar')])[1]")
	WebElement returntostore;
	
	public WebElement getlogin()
	{
		return login;
	}
	
	public WebElement getUserEmail()
	{
		return userEmail;
	}
	
	public WebElement getUserPassword()
	{
		return userPassword;
	}
	
	public WebElement getReturnStore()
	{
		return returntostore;
	}

}
