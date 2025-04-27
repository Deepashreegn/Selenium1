package program;

import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) 
	{
		
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
ChromeDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
//d.findElementByXPath("//a[.='Create new account']").click();
d.findElementByXPath("//input[@aria-label='Email address or phone number']").sendKeys("7353643339");
d.findElementByXPath("//input[@placeholder='Password']").sendKeys("2a3d5j6m");
d.findElementByXPath("//button[@type='submit']").click();

	}

}
