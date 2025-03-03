package allScriptsFromNotes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetch_links_and_refrence_point_OfKannadaFBpage
{
	@Test
	public void fetchlink()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		WebElement kann=driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
		String refrence_Point=kann.getAttribute("href");
		System.out.println(refrence_Point);
		
	}
	

}
