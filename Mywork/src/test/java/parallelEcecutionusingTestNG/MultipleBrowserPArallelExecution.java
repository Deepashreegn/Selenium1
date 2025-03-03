package parallelEcecutionusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserPArallelExecution 
{
	WebDriver driver=null;
//	WebDriverManager.ch
	@BeforeTest
	@Parameters("Browser")
   public void setup(String Browser)
   {
	   System.out.println("Browser name is:"+Browser);
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
   public void Chrome() throws InterruptedException
   {
	   driver.get("https://www.facebook.com/login/");
	   Thread.sleep(4000);
   }
   public void FF()
   {
	   driver.get("https://www.facebook.com/login/");
   }
   @AfterTest
   public void teardown()
   {
	   driver.close();
	   System.out.println("test completed");
   }
}
