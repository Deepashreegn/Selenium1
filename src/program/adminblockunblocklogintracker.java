package program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class adminblockunblocklogintracker {

    public static void main(String[] args) throws InterruptedException, AWTException
    {
        String key="webdriver.chrome.driver";
        String value="./new chrome/chromedriver.exe";
        System.setProperty(key, value);
        ChromeDriver c=new ChromeDriver();
        c.manage().window().maximize();
        
        c.get("https://godev.qspiders.com/");
        Thread.sleep(1000);
        c.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("admin@gmail.com");
        Thread.sleep(1000);
        c.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin@123");
        Thread.sleep(2000);
        c.findElement(By.xpath("//span[text()='Login']")).click();
        Thread.sleep(3000);
        c.findElement(By.xpath("//a[@href='/users']")).click();
        
        c.findElement(By.xpath("//input[@aria-placeholder='Search By Role']")).sendKeys("tracker");
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
        
        c.findElement(By.xpath("//input[@aria-label='Search By Branch']")).sendKeys("bhubaneswar jspiders");
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        c.findElement(By.xpath("//span[text()='Search']")).click();
        Thread.sleep(2000);
        
        WebElement blockbutton=c.findElement(By.xpath("(//span[text()='Block'])[4]"));
        Thread.sleep(2000);
        Point loc=blockbutton.getLocation();
        int x=loc.getX();
        int y=loc.getY();
        
        JavascriptExecutor jse=(JavascriptExecutor)c;
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(2000);
        blockbutton.click();
        c.findElement(By.xpath("(//button[@type='button'])[6]")).click();
        
        jse.executeScript("window.open('https://devtracker.qspiders.com/', '_blank');");
//        c.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        switchToTab(c,1);
        
        Thread.sleep(2000);
        c.findElement(By.name("email")).sendKeys("kajal.nayak@qspiders.in");
        c.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Admin@123");
        c.findElement(By.xpath("(//span[text()='Login'])")).click();
        Thread.sleep(2000);
        switchToTab(c,0);
        Thread.sleep(1000);
        c.findElement(By.xpath("(//span[text()='Unblock'])[2]")).click();
        Thread.sleep(2000);
        c.findElement(By.xpath("(//span[text()='Unblock'])[1]")).click();
        Thread.sleep(2000);
        switchToTab(c,1);
        Thread.sleep(1000);
        c.findElement(By.xpath("(//span[text()='Login'])")).click();
        Thread.sleep(2000);
        c.findElement(By.xpath("//a[@href='/users']")).click();
        c.findElement(By.xpath("//input[@aria-placeholder='Search By Role']")).sendKeys("tr");
        
        
        
        }

    private static void switchToTab(WebDriver c, int tabIndex)
    {
    
        String[] windowHandles = c.getWindowHandles().toArray(new String[0]);

        // Switch to the desired tab by index
        c.switchTo().window(windowHandles[tabIndex]);
    }

}