package com.crm.genericLib;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * This abstract class is used for configure pre-conditions and post-conditions
 * @author USER
 *
 */
public abstract class BaseTest implements IAutoConsts {
	
	public static WebDriver driver;
	FileLib flib;
	
	/**
	 * This pre-condition is used for open the browser and enter the url
	 * @throws Throwable
	 */
	@BeforeClass
	public void openBrowser()throws Throwable
	{
		flib=new FileLib();
		String browserValue=flib.getPropKeyValue(PROP_PATH, "browser");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver =new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			Reporter.log("Enter Valid browser");
		}
		driver.manage().window().maximize();
		driver.get(flib.getPropKeyValue(PROP_PATH, "url"));
	}
	
	/**
	 * This post-condition is used for close the all the browser windows
	 */
	
	@AfterClass
		public void closeBrowser()
		{
			driver.quit();
		}
}


