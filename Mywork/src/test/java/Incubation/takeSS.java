package Incubation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takeSS {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
//    	ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver = new FirefoxDriver();
    	driver.get("https://demoqa.com/alerts");
//    	driver.get("https://www.website.com/?source=SC&country=IN");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	TakesScreenshot ts=(TakesScreenshot) driver;
//    	WebElement ts=(WebElement) driver;
    	Thread.sleep(2000);
//    	WebElement we=driver.findElement(By.id("alertButton"));
//    	File src= ts.getScreenshotAs(OutputType.FILE);
    	File src= ts.getScreenshotAs(OutputType.FILE);
    	Thread.sleep(2000);
    	File dst1=new File("C:\\Users\\nanda\\OneDrive\\Pictures\\Screenshots/.png");
    	Thread.sleep(2000);
    	FileHandler.copy(src, dst1);
    	driver.close();
    	driver.quit();
    	
    	
	}

}
