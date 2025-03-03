package Incubation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Fetch_errorMsg_and_welcome_text 
{
   @Test
   public void errormsg() throws InterruptedException
   {
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://devplaced.qspiders.com/");
	   driver.manage().window().maximize();
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   Thread.sleep(2000);
	   js.executeScript("window.scrollBy(0,800)");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[contains(text(),'Request a call back')]")).click();
	  WebElement geterror= driver.findElement(By.xpath("//input[@id='fullName']"));
	  geterror.sendKeys("hieee");
	   String error=geterror.getText();
	   System.out.println(error);
   }
}
