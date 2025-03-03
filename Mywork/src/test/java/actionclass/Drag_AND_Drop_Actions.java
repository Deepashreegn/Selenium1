package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_AND_Drop_Actions {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	  WebElement seoul=driver.findElement(By.id("box5"));
	  Thread.sleep(2000);
	  WebElement spain=driver.findElement(By.id("box106"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(seoul, spain).perform();
	}

}
