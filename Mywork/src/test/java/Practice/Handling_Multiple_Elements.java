package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Multiple_Elements {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//WAS TO FETCH NUMBER OF LINKS PRESENT IN A GIVEN WEBPAGE
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("ALL LINKS IN FACEBOOK LOGIN PAGE IS: "+links);
		int count=links.size();
		System.out.println("NUMBER OF LINKS ON FACEBOOK LOGIN PAGE IS: "+count);
		for(int i=0;i<=links.size();i++)
		{
			WebElement address=links.get(i);
			String refPoint = address.getAttribute("href");
			System.out.println("REFRENCE POINT OF ALL THE LINKS: "+refPoint);
//			driver.close();
			driver.quit();
		}
//	
	}

}
