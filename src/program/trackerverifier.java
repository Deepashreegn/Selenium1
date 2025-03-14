package program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trackerverifier {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
	WebDriver ch = new ChromeDriver();
	ch.get("https://devtv.qspiders.com/login");
	ch.manage().window().maximize();
	ch.findElement(By.xpath("//input[@placeholder='Enter your email here']")).sendKeys("trackerverifier@gmail.com");
	JavascriptExecutor jse=(JavascriptExecutor)ch;
//	jse.executeAsyncScript("ch.findElement(By.xpath(\"//input[@placeholder='Enter your email here']", "value='Dropout@123'");
	ch.findElement(By.xpath("//input[@placeholder='Enter your password here']")).sendKeys("Admin@123");
	
//	ch.findElement(By.xpath("//span[.='Forgot Password?']")).click();
//	ch.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("inchara.r@qspiders.in");
//	
//	ch.findElement(By.xpath("//span[.='Send OTP']")).click();
//	Thread.sleep(1000);
	ch.findElement(By.xpath("//span[.='Login']")).click();
	 Thread.sleep(1000);
	 ch.findElement(By.xpath("//span[.='Concession']")).click();
	 ch.findElement(By.xpath("//span[.='Student Concession']")).click();
	 Thread.sleep(1000);
	WebElement x = ch.findElement(By.xpath("//input[@name='number']"));
	x.click();
	x.sendKeys("5081101101");
	JavascriptExecutor jse1=(JavascriptExecutor)ch;
	 jse1.executeScript("window.open('https://godev.qspiders.com/', '_blank');");
	 ch.getWindowHandles().forEach(tab->ch.switchTo().window(tab));
     switchToTab(ch,1);
     Thread.sleep(1000);
    ch.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("admin@gmail.com");
    ch.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");
    Thread.sleep(1000);
    ch.findElement(By.xpath("//span[.='Login']")).click();
    Thread.sleep(3000);
    ch.findElement(By.xpath("//a[@href='/users']")).click();
    ch.findElement(By.xpath("//input[@aria-placeholder='Search By Role']")).sendKeys("tr");
    
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    ch.findElement(By.xpath("//span[.='Search']")).click();
    for(int i=1;i<3;i++)
    {
        jse1.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);
        ch.findElement(By.xpath("(//span[.='Block'])[25]")).click();
        Thread.sleep(1000);
        ch.findElement(By.xpath("(//span[@class='pl-2 pr-2'])[5]")).click();
        ch.findElement(By.id("block")).click();
        ch.findElement(By.xpath("//span[.='Search']")).click();
        Thread.sleep(1000);
        ch.findElement(By.xpath("(//span[.='Unblock'])[3]")).click();
        ch.findElement(By.xpath("(//span[@class='pl-2 pr-2'])[5]")).click();
        Thread.sleep(2000);
        ch.findElement(By.xpath("//span[.='Add User']")).click();
        ch.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("textusera");
        ch.findElement(By.xpath("//input[@placeholder='Employee ID']")).sendKeys("QSP24");
        ch.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("a24@gmail.in");
        Thread.sleep(1000);
        ch.findElement(By.xpath("//input[@placeholder='Contact']")).sendKeys("9035011121");
        ch.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");
        ch.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Admin@123");
        Thread.sleep(1000);
        ch.findElement(By.xpath("//input[@aria-placeholder='Select Role']")).sendKeys("ra");
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        ch.findElement(By.xpath("//input[@aria-placeholder='Select Branch']")).sendKeys("gurugram qspiders");
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        ch.findElement(By.xpath("//span[.='Register']")).click();
    }
	}
    
	private static void switchToTab(WebDriver ch, int i) {
		// TODO Auto-generated method stub
		
	}

}
