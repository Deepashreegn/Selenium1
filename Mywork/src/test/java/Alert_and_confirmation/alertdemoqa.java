package Alert_and_confirmation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertdemoqa {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1000);
        WebElement btn=driver.findElement(By.id("alertButton"));
        Thread.sleep(1000);
        Actions act=new Actions(driver);
        Thread.sleep(1000);
        act.doubleClick(btn).perform();
        Thread.sleep(1000);
        Alert alt=driver.switchTo().alert();
        Thread.sleep(1000);
        alt.accept();
        Alert confirm=driver.switchTo().alert();
        confirm.accept();

	}

}
