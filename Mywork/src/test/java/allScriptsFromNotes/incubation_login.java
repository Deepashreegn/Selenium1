package allScriptsFromNotes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class incubation_login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://106.51.74.69:9084/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("new@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
