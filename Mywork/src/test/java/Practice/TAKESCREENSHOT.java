package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TAKESCREENSHOT {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.id("alertButton"));
		Thread.sleep(2000);
		WebElement ts=(WebElement) driver;
		Thread.sleep(2000);
		File src=ts.getScreenshotAs(OutputType.FILE);
//		File dst=new File("C:\\Users\\nanda\\OneDrive\\Pictures\\Screenshots/.png");
		File dst=new File("C:\\Users\\nanda\\OneDrive\\Pictures\\ss/.png");
		FileHandler.copy(src, dst);
		driver.quit();
		

	}

}
