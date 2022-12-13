package TestSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ObjectPges.Caterpillarshoppage;
import ObjectPges.Registerpage;
import ObjectPges.loginPage;
import Utilities.TestBase;

public class Caterpillarhome extends TestBase{
	
	String testName = this.getClass().getSimpleName();
	Keywords key = new Keywords(driver);
	
	
	@BeforeMethod
	public void RunningBeforeMethod() throws Exception
	{
		
		initialize();
		
	}
	
	@Test(priority=0)
	public void register() throws Exception
	{
	    driver.get(readXlsFile("Caterpillarhome"));
	    Caterpillarshoppage shoppage = new Caterpillarshoppage(driver);
		key.click(shoppage.getregister());
		Thread.sleep(3000l);
	    driver.manage().window().fullscreen();
	    Thread.sleep(3000l);
	    Registerpage register = new Registerpage(driver);
		key.sendkeys(register.getfirstName(), readXlsFile("FirstName"));
		key.sendkeys(register.getlastName(), readXlsFile("LastName"));
		key.sendkeys(register.getEmail(), readXlsFile("Email"));
		key.sendkeys(register.getpassword(), readXlsFile("Password"));
		key.click(register.getReturnToStore());
		Thread.sleep(2000l);
	}
	
	@Test(priority=1)
	public void login() throws Exception
	{
		driver.get(readXlsFile("Caterpillarhome"));
		Caterpillarshoppage shoppage = new Caterpillarshoppage(driver);
		key.click(shoppage.getlogin());
		loginPage login = new loginPage(driver);
		key.sendkeys(login.getUserEmail(),readXlsFile("Email"));
		key.sendkeys(login.getUserPassword(),readXlsFile("Password"));
		key.click(login.getReturnStore());
		Thread.sleep(2000l);
	}
	
	
	@AfterMethod
	public void RunningAfterMethod() throws Exception
	{
		 driver.close();
	}

}
