package handling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TWITTER_handle_Dropdown_using_selectByINDEX_VALUE_ByVISIBLEText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
      ChromeDriver  driver =new ChromeDriver();
      driver.get("https://x.com/");
      driver.manage().window().maximize();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//span[contains(text(),'Create account')]")).click();
      Thread.sleep(3000);
      WebElement selectByIndex=driver.findElement(By.xpath("//select[@id='SELECTOR_1']"));
      selectByIndex.click();
      Thread.sleep(1000);
      Select sel=new Select(selectByIndex);
      if(sel.isMultiple())
      {
    	  System.out.println("multiSelect");
      }
      else {
    	  System.out.println("single select");
      }
      sel.selectByIndex(1);
      WebElement  selectByValue = driver.findElement(By.xpath("//select[@id='SELECTOR_2']"));
      Thread.sleep(1000);
      Select sel1=new Select(selectByValue);
      sel1.selectByValue("1");
      WebElement SelectByVisibletext=driver.findElement(By.xpath("//select[@id='SELECTOR_3']"));
      Thread.sleep(1000);
      Select sel3=new Select(SelectByVisibletext);
      sel3.selectByVisibleText("2024");
//      sel.deselectAll(); //deselect all will not work for single select dropdown
//      sel1.deselectAll();
//      sel3.deselectAll();'
//      sel.deselectByIndex(1);
//      sel1.deselectByValue("1");
//      sel3.deselectByVisibleText("2024");
      driver.quit();
      
	}

}
