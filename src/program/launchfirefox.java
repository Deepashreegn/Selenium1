package program;


import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefox{
public static void main(String[] args)
{
	String key="webdriver.gecko.driver";
    String value="./softwares/geckodriver.exe";
    System.setProperty(key, value);
  FirefoxDriver d=  new FirefoxDriver();
d.get("https://devstudent.qspiders.com/login");
}
}
