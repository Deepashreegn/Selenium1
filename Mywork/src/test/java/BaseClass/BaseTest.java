package BaseClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class  BaseTest 
{
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static FileReader fr;
	
	
	@BeforeTest
       public void setup() throws IOException
       {
    	   if (driver==null) 
    	   {
    		   FileReader fr=new FileReader("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\src\\test\\resources\\configFiles\\config.properites");
    	       prop.load(fr);
    	   }
    	   if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
    			   {
    		   WebDriverManager.chromedriver().setup();//base
    			  driver = new ChromeDriver();//base
    			  driver.get(prop.getProperty("testurl"));//properties
    			   }
    	   else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
    			   {
    		   WebDriverManager.firefoxdriver().setup();
    		   driver = new ChromeDriver();//base
    		   driver.get(prop.getProperty("testurl"));//properties
    			   }
       }
	@AfterTest
       public void teardown()
       {
    	   driver.close();
    	   System.out.println("Teardown successful");
	}
}


