package TestSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.TestBase;

public class Keywords extends TestBase{
	
	String testName = this.getClass().getSimpleName();
	public Keywords(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void mouseOver(WebElement element) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		Thread.sleep(2000l);
	}
	
	public void click(WebElement element)
	{
		element.click();
	}
	
	public void sendText(WebElement element, String testName) throws Exception
	{
		element.sendKeys(testName);
	}

}
