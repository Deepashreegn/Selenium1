package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_Dropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		WebElement dd=driver.findElement(By.xpath("//select[@name='_sacat']"));	
		dd.click();
		Select sel=new Select(dd);
		if(sel.isMultiple())
		{
			System.out.println("dropdown is multi-select");
		}
		else
		{
			System.out.println("dropdown is single-select");
		}
		driver.quit();
	}

}
