package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://devplaced.qspiders.com/");

        // Get all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print all link texts
        for (WebElement link : links) {
            System.out.println(link.getText());
        }
        
        driver.quit();
    }
}

