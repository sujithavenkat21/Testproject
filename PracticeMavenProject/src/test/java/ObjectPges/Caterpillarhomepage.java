package ObjectPges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.TestBase;

public class Caterpillarhomepage extends TestBase{
	
	public Caterpillarhomepage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(.//a[@href='/en/brands.html'])[1]")
	WebElement mouseOver;
	
	
	public WebElement getmouseOver()
	{
		return mouseOver;
	}
	
	
}
