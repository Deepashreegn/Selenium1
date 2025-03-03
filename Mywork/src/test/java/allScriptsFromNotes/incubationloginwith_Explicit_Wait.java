package allScriptsFromNotes;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class incubationloginwith_Explicit_Wait
{
	public static void main(String[] args) {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        try {
            // Open the application
            driver.get("http://106.51.74.69:9084/login");
            driver.manage().window().maximize();

            // Initialize WebDriverWait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));

            // Wait for Email input field to be visible and enter text
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            emailField.sendKeys("bd_manager_uer@gmail.com");

            // Wait for Password input field to be visible and enter text
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
            passwordField.sendKeys("user1user1");

            // Wait for Login button to be clickable and click it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
            loginButton.click();

            // Optionally, wait for the next page or dashboard to load after login
            wait.until(ExpectedConditions.urlContains("dashboard")); // Adjust URL keyword accordingly

            System.out.println("Login successful!");

        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

