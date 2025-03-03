package MultiBrowserParallelTesting;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import junit.framework.Assert;

public class MultipleBrowserPArallelExecution 
{
		WebDriver driver;
		ChromeDriver chromedriver=new ChromeDriver();
		FirefoxDriver fd=new FirefoxDriver();
		
		@Parameters("Browser")
		@BeforeTest
	   public void setup(String Browser)
	   {
		   if(Browser.equalsIgnoreCase("chrome"))
		   {
	      WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
		   }
		   else if(Browser.equalsIgnoreCase("firefox"))
		   {
			   WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver(); 
		   }
	   }
		@Test
	   public void onChrome() throws InterruptedException
	   {
		driver.get("https://www.facebook.com/login/");
		String actual=driver.getTitle();
		String Expected="Facebook";
		Assert.assertEquals(actual.contains("Facebook"), Expected.contains("Facebook"));
		   Thread.sleep(4000);
	   }
	   @AfterTest
	   public void teardown()
	   {
		driver.quit();
	   }
	}

