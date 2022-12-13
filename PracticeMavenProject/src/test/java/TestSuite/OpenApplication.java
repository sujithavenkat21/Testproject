package TestSuite;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ObjectPges.Caterpillarhomepage;
import Utilities.TestBase;

public class OpenApplication extends TestBase{
	
	String testName = this.getClass().getSimpleName();
	  
	@BeforeMethod
	public void RunningBeforeMethod() throws Exception
	{
		initialize();
		driver.get(readXlsFile("OpenApplication"));
		driver.manage().window().fullscreen();
	    Thread.sleep(2000l);
	 }
	
	@Test(priority=2)
	public void navigation() throws Exception
	{
		Keywords key = new Keywords(driver);
		Caterpillarhomepage homepage = new Caterpillarhomepage(driver);
		Assert.assertTrue(homepage.getmouseOver().isDisplayed());
		key.mouseOver(homepage.getmouseOver());
		Thread.sleep(2000l);
		getScreenShot("OpenApplication");
	}
	
	@AfterMethod
	public void RunningAfterMethod() throws Exception
	{
		 driver.close();
	}
}
