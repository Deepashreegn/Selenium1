package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_Disabled_element {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bdincub.qspiders.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bd_manager_user@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("user1user1");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.get("https://bdincub.qspiders.com/spoc_creation");
		WebElement date=driver.findElement(By.xpath("//button[@type='submit']"));
//		driver.findElement(By.xpath("//input[@id='toDate']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",date);
	}

}
