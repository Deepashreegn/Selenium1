package Alert_and_confirmation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class accept_allert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://demoqa.com/alerts");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  WebElement we=driver.findElement(By.id("alertButton"));
		  Thread.sleep(2000);
		  Actions act=new Actions(driver);
		  Thread.sleep(2000);
		  act.doubleClick(we).perform();
		  Thread.sleep(2000);
		  Alert al=driver.switchTo().alert();
		  Thread.sleep(2000);
		  al.accept();

	}

}
