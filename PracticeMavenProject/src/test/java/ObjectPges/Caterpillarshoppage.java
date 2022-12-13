package ObjectPges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class Caterpillarshoppage extends TestBase{
	
	public Caterpillarshoppage(WebDriver driver) throws Exception
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		try {
			featureLink.isDisplayed();
		}catch(Exception e) {
			throw new Exception("This is not home page"); 
		}
	}
	
	@FindBy(xpath=".//a[contains(@href, 'feature')]")
	WebElement featureLink;
	
	@FindBy(xpath=".//a[@id=\"customer_register_link\"]")
	WebElement register;
	
	@FindBy(xpath=".//a[@id=\"customer_login_link\"]")
	WebElement login;
	
	
	public WebElement getregister()
	{
		return register;
	}

	public WebElement getlogin()
	{
		return login;
	}
	public WebElement getFeatureLink()
	{
		return featureLink;
	}
}
