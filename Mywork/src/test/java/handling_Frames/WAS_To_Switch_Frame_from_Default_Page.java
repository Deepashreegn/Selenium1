package handling_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Switch_Frame_from_Default_Page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriverManager.chromedriver().setup();
  ChromeDriver driver= new ChromeDriver();
  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows");
  Thread.sleep(2000);
  driver.findElement(By.id("iFrame")).click();
  Thread.sleep(2000);
  WebElement frame_add= driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
  driver.switchTo().frame(frame_add);
  Thread.sleep(1000);
  driver.findElement(By.id("S")).sendKeys("Switched to frame");
  Thread.sleep(1000);
  driver.switchTo().defaultContent();
  Thread.sleep(1000);
  driver.quit();
	}

}
