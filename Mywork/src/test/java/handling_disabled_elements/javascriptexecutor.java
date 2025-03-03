package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testincubbd.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("bd_manager_user@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("user1user1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		Thread.sleep(1000);
		driver.get("https://testincubbd.qspiders.com/create_collegeappointment");
//		driver.findElement(By.xpath("//div[2]//div[2]//a[2]//li[@class='MuiListItem-root MuiListItem-gutters MuiListItem-padding css-1tivb09']")).click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.id(":rq:"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled');", element);
		element.click();
		Thread.sleep(2000);
		js.executeScript("arguement[0].value='a';", element);
		String value = element.getAttribute("value");
	}

}
