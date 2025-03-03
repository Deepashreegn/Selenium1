package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Interact_with_Hidden_text_field_in_facebook_signup_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/r.php");
     driver.manage().window().maximize();
     WebElement a=driver.findElement(By.xpath("//input[@value='-1']"));
     Thread.sleep(1000);
     a.click();
     WebElement text= driver.findElement(By.id("custom_gender"));
     Thread.sleep(1000);
     text.click();
     Thread.sleep(1000);
     JavascriptExecutor js=(JavascriptExecutor) driver;
     Thread.sleep(1000);
     js.executeScript("arguments[0].value='hello';", text);
     
	}

}
