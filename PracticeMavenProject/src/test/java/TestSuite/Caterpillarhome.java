package TestSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectPges.Caterpillarshoppage;
import ObjectPges.Registerpage;
import Utilities.TestBase;

public class Caterpillarhome extends TestBase{
	
	String testName = this.getClass().getSimpleName();
	
	
	
	@BeforeMethod
	public void RunningBeforeMethod() throws Exception
	{
		
		initialize();
		
	}
	
	@Test
	public void register() throws Exception
	{
	    Keywords key = new Keywords(driver);
	    driver.get(readXlsFile("Caterpillarhome"));
	    Caterpillarshoppage shoppage = new Caterpillarshoppage(driver);
		key.click(shoppage.getregister());
		Thread.sleep(3000l);
	    driver.manage().window().fullscreen();
	    Thread.sleep(3000l);
	    Registerpage register = new Registerpage(driver);
		key.sendText(register.getfirstName(), readXlsFile("FirstName").toString());
		key.sendText(register.getlastName(), readXlsFile("LastName"));
		key.sendText(register.getEmail(), readXlsFile("Email"));
		key.sendText(register.getpassword(), readXlsFile("Password"));
		key.click(register.getReturnToStore());
		Thread.sleep(2000l);
	}
	
	@AfterMethod
	public void RunningAfterMethod() throws Exception
	{
		 driver.close();
	}

}
