package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Was_To_Fetch_refPoint_and_toollTip_ofKannada_in_FB_Login_page {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement tooltip=driver.findElement(By.xpath("//a[contains(text(),'ಕನ್ನಡ')]"));
		String s=tooltip.getAttribute("title");
		System.out.println(s);
		String s1=tooltip.getAttribute("href");
		System.out.println(s1);
//		driver.close();
		driver.quit();
	}

}
