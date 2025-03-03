package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incubation_WAS_To_Pass_data_into_textfield_and_clear_the_data {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//       WebDriverManager.chromedriver().setup();
//       WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://106.51.74.69:9084");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//		driver.get("");
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("new@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(1000);
		driver.get("http://106.51.74.69:9084/gd_creation");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.id("assign_date")).click();
		Thread.sleep(2000);
		WebElement txtfield =driver.findElement(By.id(":ri:"));
		txtfield.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='100';", txtfield);
		{
            // Close the browser
            driver.quit();
        }
		
		
	}

}
