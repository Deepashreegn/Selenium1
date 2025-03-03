package handling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class INCUBATION_Check_Whether_Dropdown_is_MultiSelect_Or_Not {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://106.51.74.69:9084/login");
       Thread.sleep(1000);
       driver.findElement(By.id("email")).sendKeys("new@gmail.com");
       driver.findElement(By.id("password")).sendKeys("123");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
       Thread.sleep(1000);
       driver.get("http://106.51.74.69:9084/");
       Thread.sleep(1000);
       WebElement dropdown= driver.findElement(By.xpath("//select[@id=':rd:']"));
//       dropdown.click();
       Thread.sleep(1000);
       Select sel=new Select(dropdown);
       if(sel.isMultiple())
       {
    	   System.out.println("is multiple");
       }
       else {
    	   System.out.println("is single select");
       }   
	}

}
