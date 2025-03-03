package handling_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle_Dropdown_using_selectByINDEX_VALUE_ByVISIBLEText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       ChromeDriver driver = new ChromeDriver();
//       driver.get("http://106.51.74.69:9084/");
       driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("new@gmail.com");
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
//		Thread.sleep(1500);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
////		Thread.sleep(1000);
		driver.get("file:///C:/Deepa%20Selenium%2013-10-24/.html");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country dropdown']"));
		Thread.sleep(1000);
		dropdown.click();
		Select sel=new Select(dropdown);
	      sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.selectByValue("C");
		Thread.sleep(1000);
		sel.selectByVisibleText(" USA");
		
	}

}
