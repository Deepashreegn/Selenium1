package handling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Fetch_All_The_Options {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver= new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://myaccount.google.com/");
//     driver.findElement(By.xpath("//div[contains(text(),'About')]")).click();
     driver.findElement(By.xpath("//div[1]//li[1]//a[contains(text(),'Create an account')]")).click();
     driver.findElement(By.id("firstName")).sendKeys("deepa");
     driver.findElement(By.id("lastName")).sendKeys("shree");
     driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
     Thread.sleep(3000);
//     WebElement sel1=driver.findElement(By.id("gender"));
     WebElement sel1=driver.findElement(By.id("month"));
     sel1.click();
     Thread.sleep(2000);
     Select sel=new Select(sel1);
//     Thread.sleep(2000);
     List<WebElement> option=sel.getOptions();
//     List<WebElement> option=sel.getAllSelectedOptions();
     int count = option.size();
     System.out.println(count);  
     driver.quit();
	}
}
