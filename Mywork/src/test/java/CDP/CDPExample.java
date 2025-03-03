package CDP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.Network;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import java.util.Optional;

import com.google.common.base.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CDPExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        // Accessing the DevTools
        DevTools devTools = ((ChromeDriver) driver).getDevTools();
        devTools.createSession();

        // Enabling Network Monitoring
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Adding a Listener to Capture Network Requests
        devTools.addListener(Network.requestWillBeSent(), request -> {
            System.out.println("URL: " + request.getRequest().getUrl());
        });

        driver.get("https://example.com");

        driver.quit();
    }
}
