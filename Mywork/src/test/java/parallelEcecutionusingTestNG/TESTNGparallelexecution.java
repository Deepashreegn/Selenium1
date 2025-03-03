package parallelEcecutionusingTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TESTNGparallelexecution
{
    @Test
	public void test1()
    {
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.flipkart.com/");
    }
    @Test
    public void test2()
    {
    	WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
