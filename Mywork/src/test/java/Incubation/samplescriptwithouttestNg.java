package Incubation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class samplescriptwithouttestNg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		{
			   WebDriverManager.chromedriver().setup();
			   ChromeDriver driver=new ChromeDriver();
               driver.get("https://www.facebook.com/");
               driver.findElement(By.id("email")).sendKeys("Hello");
//               driver.findElement(By.xpath("//button[@id='u_0_5_iX']")).click();
//               WebElement error=driver.findElement();
		   }
	}

}
