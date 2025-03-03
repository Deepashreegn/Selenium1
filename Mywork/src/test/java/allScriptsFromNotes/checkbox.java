package allScriptsFromNotes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

    public static void main(String[] args) throws InterruptedException 
    {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver= new ChromeDriver();
        driver.get("file:///D:/DEEPA%20PERSONAL/eclipse/.html");
        Thread.sleep(1500);
        WebElement cbox=driver.findElement(By.xpath("(//input)[3]"));
        if(cbox.isDisplayed())
        {
            
        if(cbox.isEnabled())
        {
            Thread.sleep(1000);
            if(cbox.isSelected())
            {
                System.out.println("selected");
            }
            else {
                cbox.click();
                System.out.println("clicked");
            }
        }
        else {
            System.out.println("disabled");
        }
       }
        else
        {
            System.out.println("Not displayed");
        }
    }
}