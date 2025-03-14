package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
 WebDriver ch = new ChromeDriver();
 ch.get("https://www.youtube.com/playlist?list=PLhW3qG5bs-L_s9HdC5zNshE5Ti8jABwlU");
//String t = ch.getTitle();
//System.out.println(t);
//String pg = ch.getPageSource();
//System.out.println(pg);
//String url = ch.getCurrentUrl();
//System.out.println(url);
// WebElement links = ch.findElement(By.xpath("//a"));
// System.out.println(links);
// WebElement img = ch.findElement(By.xpath("//img"));
// System.out.println(img);
//WebElement home = ch.findElement(By.xpath("//span[text()='Home']"));
//home.click();
//ch.findElement(By.xpath("//yt-formatted-string[.='Home']")).click();
Thread.sleep(2000);
 ch.findElement(By.xpath("//input[@id='search']")).sendKeys("pushpa movie trailer");
 Thread.sleep(2000);
 ch.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
 Thread.sleep(2000);
 ch.manage().window().maximize();
 Thread.sleep(2000);
// ch.findElement(By.xpath("//a[@title='#Pushpa - The Rise (Hindi) Official Trailer | Allu Arjun, Rashmika, Sunil, Fahadh | DSP | Sukumar']")).click();
//ch.findElement(By.xpath("//a[@id='video-title'][21]")).click();
 ch.findElement(By.xpath("//yt-formatted-string[.='Subscriptions']")).click();
 Thread.sleep(2000);
 ch.findElement(By.xpath("//yt-formatted-string[.='Movies']")).click();
ch.findElement(By.xpath("//yt-formatted-string[.='Home']")).click();

 
	}

}
