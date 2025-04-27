package program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class manager {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://devmanager.qspiders.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath("//input[@name='login']")).sendKeys("Nithin.gr@qspiders.in");
	d.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
	Thread.sleep(1000);
	d.findElement(By.xpath("//span[.='Login']")).click();
	Thread.sleep(1000);
	
//BATCHPLAN CREATIONS	
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@aria-label='Search branch here']")).sendKeys("gurugram qspiders");
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("//input[@aria-label='Search class timimgs ']")).sendKeys("weekday");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("//input[@aria-label='Search course here']")).sendKeys("ap");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("//input[@aria-label='Search subject here']")).sendKeys("ap");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@aria-label='Search trainer here']")).sendKeys("ni");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@aria-label='Search  timimgs ']")).sendKeys("af");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
//	d.findElement(By.xpath("//input[@min='2023-11-24']")).click();
	d.findElement(By.xpath("//input[@aria-label='hr']")).sendKeys("5");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("//input[@aria-label='min']")).sendKeys("10");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@aria-label='am\\pm']")).sendKeys("a");
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("//input[@type='number']")).sendKeys("55");
	d.findElement(By.xpath("(//textarea[@class='max-w-full focus:ring focus:outline-none dark:placeholder-gray-400 px-2 w-full h-20 border border-gray-700 dark:bg-gray-800 rounded'])[1]")).sendKeys("nil");
	Thread.sleep(1000);
    d.findElement(By.xpath("(//textarea[@class='max-w-full focus:ring focus:outline-none dark:placeholder-gray-400 px-2 w-full h-20 border border-gray-700 dark:bg-gray-800 rounded'])[2]")).sendKeys("nil");
	d.findElement(By.xpath("//span[.='Submit']")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("(//span[.='Edit'])[1]")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Chandrakantha HD");
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	d.findElement(By.xpath("//span[.='Save']")).click();
	Thread.sleep(2000);
	
//EDITING 	
	d.findElement(By.xpath("(//span[.='Demo'])[1]")).click();
	d.findElement(By.xpath("//input[@placeholder='Demo Days']")).clear();
	Thread.sleep(1000);
	d.findElement(By.xpath("//input[@placeholder='Demo Days']")).sendKeys("4");
	Thread.sleep(2000);
	d.findElement(By.xpath("(//span[.='Add'])[1]")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("(//span[.='Push'])[1]")).click();
	d.findElement(By.xpath("//input[@placeholder='Push Days']")).clear();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@placeholder='Push Days']")).sendKeys("4");
	Thread.sleep(1000);
	d.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[9]")).click();
	Thread.sleep(1000);
	d.findElement(By.xpath("(//button[.='Cancel'])[2]")).click();
	d.findElement(By.xpath("//input[@aria-label='Select reasons here']")).click();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	d.findElement(By.xpath("//textarea[@placeholder='Comments']")).sendKeys("qwertyuiopasdfghxcvbn234567");
	Thread.sleep(1000);
	d.findElement(By.xpath("//span[.='Confirm']")).click();
	
JavascriptExecutor jv = (JavascriptExecutor)d;
jv.executeScript("window.open('https://godev.qspiders.com/login'), '_blank'");
d.getWindowHandles().forEach(tab->d.switchTo().window(tab));
switchToTab(d,1);
Thread.sleep(1000);
d.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("admin@gmail.com");
d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");
d.findElement(By.xpath("//span[.='Login']")).click();
switchTotab(d,0);

	
	
	}

	private static void switchToTab(WebDriver d, int i) {
		// TODO Auto-generated method stub
		
	}

	private static void switchTotab(WebDriver d, int i) {
		// TODO Auto-generated method stub
		
	}

//	private static void switchToTab(WebDriver d, int i) {
//		// TODO Auto-generated method stub
		
	}

	
