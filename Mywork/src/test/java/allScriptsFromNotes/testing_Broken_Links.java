package allScriptsFromNotes;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testing_Broken_Links 
{
	    public static void main(String[] args) {
	    	WebDriverManager.chromedriver().setup();
	    	ChromeDriver driver = new ChromeDriver();
	        driver.get("https://devqspiders.qspiders.com");

	        // Get all links on the page
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            verifyURLStatus(url);
	        }
//	        driver.quit();
	    }

	    public static void verifyURLStatus(String url) {
	        try {
	            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
	            connection.setRequestMethod("GET");
	            connection.connect();
	            int responseCode = connection.getResponseCode();
	            if (responseCode == 200) {
	                System.out.println(url + " is working (Status: 200 OK)");
	            } else {
	                System.out.println(url + " is broken (Status: " + responseCode + ")");
	            }
	        } catch (Exception e) {
	            System.out.println(url + " is invalid or unreachable.");
	        }
	    }
	}

