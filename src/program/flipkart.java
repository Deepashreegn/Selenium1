package program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
WebDriver ch= new ChromeDriver();
ch.get("https://www.flipkart.com/");
Thread.sleep(2000);
//ch.findElement(By.xpath("//span[@class='_30XB9F']")).click();
//Thread.sleep(2000);
//ch.findElement(By.xpath("//img[@alt='Close Feedback']")).click();
//Thread.sleep(2000);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);


r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);


 WebElement ele = ch.findElement(By.xpath("//span[.='Men']"));
 Thread.sleep(2000);
Actions a = new Actions(ch);
a.moveToElement(ele).perform();
Thread.sleep(2000);
ch.findElement(By.xpath("//a[@title='T-Shirts']")).click();
Thread.sleep(2000);
WebElement e = ch.findElement(By.xpath("//span[.='Women']"));
Thread.sleep(2000);
Actions s = new Actions(ch);
s.moveToElement(e).perform();
Thread.sleep(2000);
ch.findElement(By.xpath("(//a[@title='Sarees'])[1]")).click();
Thread.sleep(2000);
ch.findElement(By.xpath("(//img[@class='_2r_T1I'])[1]")).click();
Thread.sleep(10000);
ch.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	}

}
