package program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./new chrome/chromedriver.exe");
		 WebDriver ch = new ChromeDriver();
		 
//HELP REGISTRAION		 
		 
		 
		ch.get("https://devhelp.qspiders.com/login");
		ch.manage().window().maximize();
		 Thread.sleep(2000);
		ch.findElement(By.xpath("//input[@placeholder='user@example.com']")).sendKeys("help@gmail.com");
		ch.findElement(By.name("password")).sendKeys("Admin@123");
		ch.findElement(By.xpath("//span[.='Login']")).click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//span[@class='pl-1 pr-2']")).click();
		Thread.sleep(1000);
		ch.findElement(By.xpath("//input[@aria-placeholder='+91']")).sendKeys("355");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		ch.findElement(By.xpath("//input[@placeholder='Enter your number here']")).sendKeys("3010425100");
		Thread.sleep(5000);
		ch.findElement(By.name("name")).sendKeys("root");
		ch.findElement(By.xpath("//input[@placeholder='Enter your email here']")).sendKeys("r50@gmail.com");
		ch.findElement(By.xpath("//input[@placeholder='confirm your email here']")).sendKeys("r50@gmail.com");
		ch.findElement(By.xpath("//input[@aria-placeholder='Search country here']")).sendKeys("un");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
//		WebElement xyz = ch.findElement(By.xpath("//input[@aria-placeholder='Search state here']"));
//		xyz.click();
//		xyz.sendKeys("man");
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		Thread.sleep(1000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		ch.findElement(By.xpath("//input[@aria-placeholder='Search district here']")).sendKeys("An");
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		ch.findElement(By.xpath("//input[@aria-placeholder='Select highest degree passout year']")).sendKeys("2015");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		ch.findElement(By.xpath("//input[@placeholder='Please enter password']")).sendKeys("Admin@123");
		ch.findElement(By.xpath("//input[@placeholder='Please enter confirmed password']")).sendKeys("Admin@123");
		ch.findElement(By.xpath("(//span[@class='pl-2 pr-2'])[1]")).click();
		
//NAVIGATE TO STUDENT		
		Navigation nav = ch.navigate();
		
//STUDENT LOGIN AND COURSE SELECTION		
		nav.to("https://devstudent.qspiders.com/login");
		Thread.sleep(2000);
		 ch.findElement(By.name("email")).sendKeys("r46@gmail.com");
		 ch.findElement(By.xpath("(//input[@name='password'])[4]")).sendKeys("Admin@123");
		 Thread.sleep(1000);
		 ch.findElement(By.xpath("//span[text()='Login']")).click();
		 Thread.sleep(2000);
		 ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[6]")).click();
		 Thread.sleep(2000);
		 ch.findElement(By.xpath("//input[@type='text']")).sendKeys("QGU-JSAJVD-M1");
		 Thread.sleep(2000);
		 ch.findElement(By.xpath("//span[.='Add Batch code']")).click();
		 Thread.sleep(2000);
		 ch.findElement(By.xpath("(//span[.='Click to Select this Course'])[2]")).click();
		 Thread.sleep(2000);
		 
//ADD PLACEMENTFORM		 
		 ch.findElement(By.xpath("//label[.='Add Placement Form']")).click();
		 Thread.sleep(2000);
		 ch.findElement(By.id("file")).sendKeys("C:\\Users\\Developer41\\Downloads\\rejected_image (2).jfif");
		 ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[6]")).click();
		 Thread.sleep(2000);
		 ch.findElement(By.xpath("//input[@placeholder='Enter Name here']")).clear();
		 ch.findElement(By.xpath("//input[@placeholder='Enter Name here']")).sendKeys("rootfourthreethree");
		  Thread.sleep(5000);
		  ch.findElement(By.xpath("//input[@aria-placeholder='Search Gender here']")).sendKeys("Female");
		  Robot a = new Robot();
		  a.keyPress(KeyEvent.VK_ENTER);
		  a.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  ch.findElement(By.id("aadhyes")).click();
		  ch.findElement(By.id("passno")).click();
		  ch.findElement(By.id("panyes")).click();
		  ch.findElement(By.xpath("(//input[@name='URL'])[2]")).sendKeys("https://www.youtube.com/results?search_query=how+to+inspect+radio+button");
		  ch.findElement(By.xpath("(//input[@aria-placeholder='Search state here'])[1]")).sendKeys("kar");
		  Robot r1 = new Robot();
		  r1.keyPress(KeyEvent.VK_ENTER);
		  r1.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//span[.='Next']")).click();
		  Thread.sleep(3000);
		  ch.findElement(By.xpath("//input[@aria-placeholder='Search highest degree here']")).sendKeys("degree");
		  Robot r2 = new Robot();
		  r2.keyPress(KeyEvent.VK_ENTER);
		  r2.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@id='percentage']")).click();
		  ch.findElement(By.xpath("//input[@placeholder='Enter 10th Percentage']")).sendKeys("39");
		  ch.findElement(By.xpath("//input[@aria-placeholder='Select 10th Year of Pass Out']")).sendKeys("2015");
		  Robot r3 = new Robot();
		  r3.keyPress(KeyEvent.VK_ENTER);
		  r3.keyRelease(KeyEvent.VK_ENTER);
		  ch.findElement(By.xpath("//input[@id='2']")).click();
		  ch.findElement(By.xpath("//input[@id='cgpa1']")).click();
		  ch.findElement(By.xpath("//input[@placeholder='Enter 12th CGPA']")).sendKeys("8");
		  ch.findElement(By.xpath("//input[@aria-placeholder='Select 12th Year of Pass Out']")).sendKeys("2018");
		  Robot r4 = new Robot();
		  r4.keyPress(KeyEvent.VK_ENTER);
		  r4.keyRelease(KeyEvent.VK_ENTER);
		  ch.findElement(By.xpath("//input[@id='yes']")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@placeholder='Enter number of year gap']")).sendKeys("1year");
		  ch.findElement(By.id("percentage4")).click();
		  ch.findElement(By.xpath("//input[@placeholder='Enter Degree Percentage']")).sendKeys("100");
		  ch.findElement(By.xpath("//input[@aria-placeholder='Search  Degree here']")).sendKeys("bha");
		  Robot r5 = new Robot();
		  r5.keyPress(KeyEvent.VK_ENTER);
		  r5.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("(//span[@class='control-label'])[3]")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.name("Other Stream Name")).sendKeys("abcdxyz");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@aria-label='search  Degree University name here']")).sendKeys("be");
		  Robot r6 = new Robot();
		  r6.keyPress(KeyEvent.VK_ENTER);
		  r6.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("(//span[@class='control-label'])[5]")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.name("Other College Name")).sendKeys("zxcvgfdsaw23");
		  ch.findElement(By.id("yes3")).click();
		  ch.findElement(By.xpath("(//input[@autocomplete='username'])[7]")).sendKeys("2years");
		  ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[7]")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.id("expyes")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@aria-placeholder='Select total year']")).sendKeys("2");
		  Robot r7 = new Robot();
		  r7.keyPress(KeyEvent.VK_ENTER);
		  r7.keyRelease(KeyEvent.VK_ENTER);
		  ch.findElement(By.xpath("//input[@aria-placeholder='Select total month']")).sendKeys("0");
		  Thread.sleep(2000);
		  Robot r8 = new Robot();
		  r8.keyPress(KeyEvent.VK_ENTER);
		  r8.keyRelease(KeyEvent.VK_ENTER);
		  ch.findElement(By.id("development")).click();
		  ch.findElement(By.id("workyes")).click();
		  ch.findElement(By.xpath("//input[@placeholder='Enter company']")).sendKeys("apple");
		  ch.findElement(By.xpath("//input[@placeholder='Enter designation']")).sendKeys("software engg");
		  ch.findElement(By.xpath("//input[@placeholder='Enter ctc']")).sendKeys("24lpa");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@placeholder='Enter total experience']")).sendKeys("5 years");
		  ch.findElement(By.xpath("//input[@placeholder='Enter notice period']")).sendKeys("2months");
		  ch.findElement(By.id("noticeno")).click();
		  ch.findElement(By.xpath("//input[@placeholder='Enter skills']")).sendKeys("python");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[8]")).click();
		  Thread.sleep(2000);
		  ch.findElement(By.name("ready_to_relocate")).click();
		  ch.findElement(By.xpath("//input[@aria-placeholder='Search Location']")).sendKeys("m");
		  r8.keyPress(KeyEvent.VK_ENTER);
		  r8.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("(//input[@placeholder='Enter name'])[1]")).sendKeys("joshi");
		  ch.findElement(By.xpath("(//input[@aria-placeholder='+91'])[1]")).sendKeys("8");
		  r8.keyPress(KeyEvent.VK_ENTER);
		  r8.keyRelease(KeyEvent.VK_ENTER);
		  ch.findElement(By.xpath("(//input[@placeholder='Enter number'])[1]")).sendKeys("34567890987");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//input[@placeholder='Enter Relation']")).sendKeys("mother");
		  ch.findElement(By.xpath("//span[.='Add another Emergency']")).click();
		  ch.findElement(By.xpath("(//input[@placeholder='Enter name'])[2]")).sendKeys("chandu");
		  ch.findElement(By.xpath("(//input[@placeholder='Enter number'])[2]")).sendKeys("3456789098");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("(//input[@placeholder='Enter Relation'])[2]")).sendKeys("mother");
		  ch.findElement(By.xpath("(//input[@placeholder='Enter name'])[3]")).sendKeys("preetha");
		  ch.findElement(By.xpath("(//input[@placeholder='Enter number'])[3]")).sendKeys("3456789090");
		  Thread.sleep(2000);
		  ch.findElement(By.xpath("//span[.='Submit']")).click();
		  Thread.sleep(2000);
		  
//VIEW PLACEMENT FORM		  
		  ch.findElement(By.xpath("(//label[@class ='text-xs font-bold'])[3]")).click();
		  Thread.sleep(2000);
		  
//PAYMENT	  
		              ch.findElement(By.xpath("(//label[@class='text-xs font-bold'])[2]")).click();
		              Thread.sleep(2000);
		              Thread.sleep(2000);
		            ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[6]")).click();
		            Thread.sleep(2000);
		            ch.findElement(By.xpath("//input[@placeholder='Enter the amount here']")).sendKeys("1000");
		            ch.findElement(By.xpath("//span[.='Yes I have read all the terms and conditions and accepted it']")).click();
		            Thread.sleep(2000);
		            ch.findElement(By.xpath("(//span[.='Pay'])[1]")).click();
		            Thread.sleep(4000);
//		         Actions act = new Actions(ch);
//		            WebElement xyz = ch.findElement(By.xpath("(//div[.='Show QR'])[2]"));
//		            act.doubleClick(xyz).perform();
		          
		            Thread.sleep(10000);
		              
		              ch.findElement(By.xpath("//span[.='Show']")).click();
		          ch.findElement(By.xpath("(//span[.='Show Receipt'])[1]")).click();
		          JavascriptExecutor js=(JavascriptExecutor)ch;
		          ch.getWindowHandles().forEach(tab->ch.switchTo().window(tab));
		          switchTotab(ch,0);
		         
//		   
//		       
//		             
//		             nav.back();
		             Thread.sleep(2000);
		              ch.findElement(By.xpath("//span[.='Student']")).click();
		              ch.findElement(By.xpath("//label[.='Help']")).click();
		              Thread.sleep(2000);
		             ch.findElement(By.xpath("(//span[@class='inline-flex justify-center items-center w-6 h-6'])[2]")).click();
//LOGOUT
		              ch.findElement(By.xpath("//span[@class='font-bold']")).click();
		              Thread.sleep(2000);
		              ch.findElement(By.xpath("//label[.='Logout']")).click();
		              Thread.sleep(2000);
		              ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[1]")).click();
		              
		          JavascriptExecutor js1 = (JavascriptExecutor)ch;
		          js1.executeScript("window.open('https://godev.qspiders.com/', '_blank'");
		          ch.getWindowHandles().forEach(tab->ch.switchTo().window(tab));
		          switchTotab(ch,1);
//		          switchTotab(ch,0);
		          
		              

	}

	private static void switchTotab(WebDriver ch, int i) {
		// TODO Auto-generated method stub
		
	}

}
