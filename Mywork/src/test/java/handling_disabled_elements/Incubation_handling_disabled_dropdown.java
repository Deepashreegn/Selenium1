package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incubation_handling_disabled_dropdown {

	private static final Object disabled = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
//	     WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://106.51.74.69:9084");
//			Thread.sleep(1000);
//			driver.get("");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("new@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
			driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
			Thread.sleep(1000);
			
			driver.get("http://106.51.74.69:9084/addressing_list");
			Thread.sleep(1000);
			driver.findElement(By.id("_addressing_assignButtn__zDXAJ")).click();
			Thread.sleep(1000);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", disabled);
			Thread.sleep(2000);
			driver.quit();
	}

}
