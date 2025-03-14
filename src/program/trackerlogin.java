package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class trackerlogin {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://devtracker.qspiders.com/login");
		c.findElement(By.xpath("//input[@name='email']")).sendKeys("harsha.h@qspiders.in");
		c.findElement(By.xpath("(//input[@name='password'])[4]")).sendKeys("Admin@123");
	
	c.findElement(By.xpath("//span[text()='Login']")).click();

	}

}
