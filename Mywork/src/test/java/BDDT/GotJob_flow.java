package BDDT;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GotJob_flow {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
	  WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("dynamicButton")));
	  element.click();

//	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.get("https://testhr.qspiders.com/login");
	  driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("HR3@career.com");
	  driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("test@123");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
//	  Thread.sleep(2000);
	  driver.get("https://testhr.qspiders.com/all_student_list");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[contains(text(),' Search ')]")).click();
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='type number']")).sendKeys("911352641056");
//	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//button[contains(text(),' Search ')]")).click();
//	  Thread.sleep(8000);
//	  driver.findElement(By.xpath("//body[1]//div[2]//span[2]//*[local-name()='svg' and @viewBox='0 0 24 24' and @class='inline-block' and @width='16' and@height='16']")).click();
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//tr[1]//td[@data-label='Got Job' and @class='text-center']")).click();
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[contains(text(),'Got Job from External Company')]")).click();
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//section/section//div[1][@tabindex='-1' and @class='relative mx-auto w-full flex items-center justify-end box-border cursor-pointer border border-gray-300 rounded bg-gray-800 text-base leading-snug outline-none']")).click();
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Joining Date']")).sendKeys("22022025");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Package']")).sendKeys("10");
//	  Thread.sleep(2000);
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[1]//div[6]//input[@type='text' and @class='w-full absolute inset-0 outline-none focus:ring-0 appearance-none box-border border-0 text-base font-sans bg-gray-800 rounded pl-3.5']")).sendKeys(Keys.ENTER,"wakad jspiders");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//section[1]//section[1]//div[1]//div[2]//input[1][@type='text' and @class='w-full absolute inset-0 outline-none focus:ring-0 appearance-none box-border border-0 text-base font-sans bg-gray-800 rounded pl-3.5']")).sendKeys(Keys.DOWN,"jf");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//section[1]//div[2]/div/div/div//input[@type='text' and @class='w-full absolute inset-0 outline-none focus:ring-0 appearance-none box-border border-0 text-base font-sans bg-gray-800 rounded pl-3.5']")).sendKeys(Keys.ENTER,"raja");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//section[1]//section[1]//div[3]//div[1]//input[1][@type='text' and @class='w-full absolute inset-0 outline-none focus:ring-0 appearance-none box-border border-0 text-base font-sans bg-gray-800 rounded pl-3.5']")).sendKeys(Keys.ENTER,"not");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@placeholder='Comment']")).sendKeys("//input[@placeholder='Comment']");
//	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(text(),' Submit ')]")).click();
	  driver.close();
	  driver.quit();
	}

}
