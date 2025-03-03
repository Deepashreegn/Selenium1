package handleMultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WASTOFetchNoOfLinksPResentInAmazonPage 
{
	@Test
      public void handlemultipleelement() throws InterruptedException
      {
		WebDriverManager.chromedriver().setup();
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in/");
//    	driver.get("https://www.website.com/?source=SC&country=IN");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	List<WebElement> links=driver.findElements(By.xpath("//a"));
    	int count=links.size();
    	System.out.println(count);
//    	driver.quit();
    	for(int i=0; i<=links.size(); i++)
    	{
    		WebElement address=links.get(i);
    		String refPoint=address.getAttribute("href");
    		System.out.println(refPoint);
    	}
    	
      }     
}
