package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
//import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase 
{

	public WebDriver driver;
	//public Logger log = Logger.getLogger("devpinoyLogger");
	public Properties prop = new Properties();
	  
	
	public void initialize() throws Exception
	{
		FileInputStream path = new FileInputStream("C:\\Users\\Sujitha\\eclipse-workspace\\PracticeMavenProject\\src\\test\\java\\TestResources\\Test.properties");
		prop.load(path);
		
		if(prop.getProperty("browser").contentEquals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sujitha\\eclipse-workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").contentEquals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sujitha\\eclipse-workspace\\geckodriver.exe"); 
		driver = new FirefoxDriver();	
		}
		
	       
	}
	 
	public void getScreenShot(String testName) throws Exception
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\Sujitha\\eclipse-workspace\\PracticeMavenProject\\src\\test\\java\\TestResults\\Screenshots\\"+testName+".png"));
	}
	
	public String readXlsFile(String testName) throws Exception
	{
		File newXl = new File("C:\\Users\\Sujitha\\eclipse-workspace\\PracticeMavenProject\\src\\test\\java\\TestResources\\Data.xlsx");
		
		FileInputStream readXl = new FileInputStream(newXl);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(readXl);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			if(sheet.getRow(i).getCell(0).toString().contentEquals(testName)) {
			String value = sheet.getRow(i).getCell(1).toString();
			readXl.close();
			return value;
		}
		}
			return null;
		
	    
	
	}
	

}