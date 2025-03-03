import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opennewtab 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
    	ChromeDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
            driver.get("https://www.google.co.uk/");
            Thread.sleep(2000);
            WebElement searchBox = driver.findElement(By.xpath("//textarea[@name='q']"));
            searchBox.sendKeys("Java");
            searchBox.sendKeys(Keys.RETURN);
            Thread.sleep(9000);
            List<WebElement> links = driver.findElements(By.cssSelector("h3"));
            Thread.sleep(3000);
            for (WebElement link : links) {
                if (link.isDisplayed()) {
                    String openInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
                    Thread.sleep(3000);
                    link.sendKeys(openInNewTab);
                    Thread.sleep(1000); // Wait for tab to open
                }
            Thread.sleep(5000);
            driver.quit();
        }
    }
}
