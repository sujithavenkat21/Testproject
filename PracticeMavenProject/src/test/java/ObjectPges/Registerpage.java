package ObjectPges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class Registerpage extends TestBase{
	

	public Registerpage(WebDriver driver) throws Exception
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		try {
			
			signup.isDisplayed();
			
		}catch(Exception e) {
			
			throw new Exception("This is not home page"); 
		}
	}
	
	@FindBy(xpath=".//input[@value=\"SIGN UP NOW!\"]")
	WebElement signup;
	
	@FindBy(xpath=".//input[@id=\"FirstName\"]")
	WebElement firstName;
	
	@FindBy(xpath=".//input[@id=\"LastName\"]")
	WebElement lastName;
	
	@FindBy(xpath=".//input[@id=\"Email\"]")
	WebElement email;
	
	@FindBy(xpath=".//input[@id=\"CreatePassword\"]")
	WebElement password;
	
	@FindBy(xpath=".//a[contains(@href,'shopcaterpillar')]")
	WebElement returntostore;
	
	public WebElement getfirstName()
	{
		return firstName;
	}
	
	public WebElement getlastName()
	{
		return lastName;
	}
	
	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement getpassword()
	{
		return password;
	}
	
	public WebElement getReturnToStore()
	{
		return returntostore;
	}
	
	public WebElement getsignup()
	{
		return signup;
	}

}
