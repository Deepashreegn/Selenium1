package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WAS_To_perform_click_action_on_disabled_button_using_javascriptexecutor {

	private static final Object disabled = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//     WebDriverManager.chromedriver().setup();
//     WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.oracle.com/in/java/technologies/downloads/#jdk20_windows");
		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@name='licenseAccept'])[2]")).click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabled);
		
		
	}

}
