package handling_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WAS_To_Switch_To_default_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        WebElement f=driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-970x250-1_0']"));
        driver.switchTo().frame(f);
        System.out.println("y");
	}

}
