package program;

import org.openqa.selenium.chrome.ChromeDriver;


public class launchbrowser 
{
public static void main(String[] args)
{
	String key="webdriver.chrome.driver";
    String value="./softwares/chromedriver.exe";
    System.setProperty(key, value);
  ChromeDriver d=  new ChromeDriver();
d.get("https://devstudent.qspiders.com/login");

 String dx = d.getCurrentUrl();
 System.out.println(dx);
 String dx1 = d.getTitle();
 System.out.println(dx1);
String dx2 = d.getPageSource();
System.out.println(dx2);
 d.quit();
}
}
