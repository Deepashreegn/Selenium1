package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newtab {
	
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
	WebDriver ch= new ChromeDriver();
 ch.get("https://www.flipkart.com/");
 WebElement e = ch.findElement(By.linkText("https://www.flipkart.com/"));
Actions a = new Actions(ch);
a.contextClick(e).perform();
	}

}
