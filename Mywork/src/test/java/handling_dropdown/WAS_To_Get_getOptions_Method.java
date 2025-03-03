package handling_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Get_getOptions_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://x.com/");
   driver.manage().window().maximize();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
   Thread.sleep(3000);
   WebElement getopt=driver.findElement(By.id("SELECTOR_1"));
   getopt.click();
   Thread.sleep(1000);
   Select sel=new Select(getopt);
   List<WebElement> getoption1= sel.getOptions();
   int Count= getoption1.size();
   System.out.println(Count);
   driver.quit();
   
   
	}

}
