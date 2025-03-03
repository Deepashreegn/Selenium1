package handling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Check_Whether_dropdown_is_singleSelect_Or_MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver= new ChromeDriver();
       driver.get("file:///C:/Deepa%20Selenium%2013-10-24/.html");
       Thread.sleep(1000);
       WebElement dropdown=driver.findElement(By.xpath("//select[@id='country dropdown']"));
       Thread.sleep(1000);
       Select sel= new Select(dropdown);
       if(sel.isMultiple())
       {
    	   System.out.println("multi-select");
       }
       else
       {
    	   System.out.println("sisgle select");
       }
    	   
       
       
		
	}

}
