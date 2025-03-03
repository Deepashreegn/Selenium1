package Incubation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollupanddownWebsite 
{
     @Test
     public void scroll() throws InterruptedException
     {
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://devplaced.qspiders.com/");
//    	driver.get("https://www.website.com/?source=SC&country=IN");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	 js.executeScript("window.scrollBy(0,8000)");
    	 Thread.sleep(2000);
    	 js.executeScript("window.scrollBy(0, -5000)");
     }
     
}
