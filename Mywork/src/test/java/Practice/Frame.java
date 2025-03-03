package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {

	public static void main(String[] args) 
			//throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		driver.get("https://demoqa.com/frames");
//		Thread.sleep(2000);	
		driver.switchTo().frame("frame1");
//		Thread.sleep(2000);
		driver.switchTo().defaultContent();
//		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		System.out.println("switched to child frame");
	}

}
