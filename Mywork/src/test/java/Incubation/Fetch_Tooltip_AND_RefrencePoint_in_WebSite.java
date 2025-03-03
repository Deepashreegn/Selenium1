package Incubation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetch_Tooltip_AND_RefrencePoint_in_WebSite
{
	@Test
	public void fetchTooltip() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bdincub.qspiders.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("new@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.get("https://bdincub.qspiders.com/appointment_details_list");
		Thread.sleep(2000);
		WebElement tooltip = driver.findElement(By.xpath("//tr[1]//p[@aria-label='bangalore_university(BU)_Tech Bhoomi_online']"));
		Thread.sleep(2000);
		String tooltip1=tooltip.getAttribute("aria-label");
		System.out.println(tooltip1);
		String ref_point=tooltip.getAttribute("href");
		System.out.println(ref_point);
        
	}
}
