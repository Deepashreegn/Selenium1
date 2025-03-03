package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_WEBELEMENT_scripts_in_one_program {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//WAS TO FETCH THE WELCOME TEXT IN FACEBOOK LOGIN PAGE		
		WebElement welcome=driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String welcome1=welcome.getText();
		System.out.println(welcome1);
//WAS TO FETCH FONT SIZE AND WIDTH OF WELCOME TEXT
		String fsize=welcome.getCssValue("font-size");
		System.out.println("font size of welocme text is "+ fsize);
		String width=welcome.getCssValue("width");
		System.out.println("font width of welocme text is "+width);
		Thread.sleep(3000);
//WAS TO FETCH THE DIMENSION OF LOGIN BUTTON IN FACEBOOK LOGIN PAGE and ERROR MESSAGE IN THE FACEBOOK LOGIN
		WebElement UN=driver.findElement(By.xpath("//input[@id='email']"));
		UN.sendKeys("hggh");
//USING KEYBOARD KEYS SELECT ALL TEXT AND BACKSPACE AND ENTER ANOTHER TEXT
		Thread.sleep(2000);
		UN.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		UN.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);
		UN.sendKeys("deepa");
		Thread.sleep(2000);
		WebElement loginbtn=driver.findElement(By.xpath("//button[@name='login']"));
	    Dimension d=loginbtn.getSize();
	    System.out.println("dimension of login button is "+d);
//TO GET HEIGHT AND WIDTH SEPERATELY
	    int height=d.getHeight();
	    int width1=d.getWidth();
	    System.out.println("height of login button = "+height+" and "+ "width of login button = "+width1);
		Thread.sleep(2000);
	    loginbtn.click();
		WebElement error=driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String e=error.getText();
		System.out.println(e);
		Thread.sleep(3000);
//WAS TO CHANGE TEH SCREEN RESOLUTION OF FACEBOOK LOGIN PAGE
		Dimension d1=new Dimension(500,200);
		driver.manage().window().setSize(d1);

	}

}
