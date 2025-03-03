package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incubation_Run_multiple_method {
   @Test
	public void logintoIncubation() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testincubbd.qspiders.com/login");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("bdmccm@gmail.com",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("!@#",Keys.ENTER);
		System.out.println("Title of the page is: "+ driver.getTitle());
		driver.close();
	}
   @Test
   public void switchtoCC()
   {
	    WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.findElement(By.xpath(null));
   }
}
