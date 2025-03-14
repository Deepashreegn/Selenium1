package program;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.chrome.driver", "./new chrome/chromedriver.exe");
  WebDriver	ch = new ChromeDriver();
 ch.get("https://devstudent.qspiders.com/login");
 ch.manage().window().maximize();
 ch.findElement(By.name("email")).sendKeys("ntest16@gmail.com");
ch.findElement(By.xpath("(//input[@name='password'])[4]")).sendKeys("Admin@123");

ch.findElement(By.xpath("//span[text()='Login']")).click();
Thread.sleep(3000);
//ch.findElement(By.xpath("//label[.='Join New Class']")).click();
Thread.sleep(2000);
ch.findElement(By.xpath("//input[@type='text']")).sendKeys("QGU-CGSCGD-E68");
Thread.sleep(2000);
ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[6]")).click();
Thread.sleep(2000);
WebElement ele = ch.findElement(By.xpath("(//div[@class='p-4'])[2]"));
if(ele.isDisplayed());
System.out.println("cancel");
ch.findElement(By.xpath("(//span[.='Cancel'])[3]")).click();
//Thread.sleep(2000);
//ch.findElement(By.xpath("//span[.='root435']")).click();
//ch.findElement(By.xpath("//label[.='Add Email ID']")).click();
//Thread.sleep(2000);
//ch.findElement(By.xpath("//input[@type='text']")).sendKeys("root509@gmail.com");
//ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[5]")).click();
////
//WebElement e = ch.findElement(By.xpath("//div[@class='p-4']"));
//
//if(e.isDisplayed());
//System.out.println("cancel");
//Thread.sleep(2000);
//ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[6]")).click();
Thread.sleep(4000);
ch.findElement(By.xpath("//label[.='Add Placement Form']")).click();
Thread.sleep(2000);
ch.findElement(By.id("file")).sendKeys("C:\\Users\\Developer41\\Downloads\\rejected_image (2).jfif");
ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[6]")).click();
Thread.sleep(2000);
ch.findElement(By.xpath("//input[@placeholder='Enter Name here']")).clear();
ch.findElement(By.xpath("//input[@placeholder='Enter Name here']")).sendKeys("rootfourthreethree");
//Thread.sleep(5000);
//
//Actions action = new Actions(ch);
//Thread.sleep(2000);
//
//WebElement date = ch.findElement(By.xpath("(//label[text()='Date of Birth']/../../..//div[@class=\"grid grid-cols-1 last:mb-0 mb-3 text-white text-sm box-border h-24 w-50 p-2 border-2 border-gray-700\"])[2]"));
//Thread.sleep(2000);
//        
//    action.moveByOffset(584, 204).click().perform();
//    Thread.sleep(2000);
//    Robot robot = new Robot();
//    robot.keyPress(KeyEvent.VK_LEFT);
//    robot.keyRelease(KeyEvent.VK_LEFT);
//    robot.keyPress(KeyEvent.VK_LEFT);
//    robot.keyRelease(KeyEvent.VK_LEFT);
//    robot.keyPress(KeyEvent.VK_ENTER); // press enter key
//    robot.keyRelease(KeyEvent.VK_ENTER); // release enter key
    Thread.sleep(2000);
ch.findElement(By.xpath("//input[@aria-placeholder='Search Gender here']")).sendKeys("Female");
Robot r = new Robot();
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
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
ch.findElement(By.xpath("(//label[@class ='text-xs font-bold'])[3]")).click();
            ch.findElement(By.xpath("(//label[@class='text-xs font-bold'])[2]")).click();
            Thread.sleep(2000);
//ch.findElement(By.xpath("(//span[@class='pl-1 pr-1'])[7]")).click();
//Thread.sleep(2000);
//ch.findElement(By.xpath("//input[@placeholder='Enter the amount here']")).sendKeys("1000");
//ch.findElement(By.xpath("//span[.='Yes I have read all the terms and conditions and accepted it']")).click();
//Thread.sleep(2000);
//ch.findElement(By.xpath("(//span[.='Pay'])[1]")).click();
//Thread.sleep(6000);
//            ch.switchTo().alert();
//ch.findElement(By.xpath("//div[@id='modal-close']")).click();
//Thread.sleep(2000);
//ch.findElement(By.id("positiveBtn")).click();
         ch.findElement(By.xpath("//span[.='Show']")).click();
         ch.findElement(By.xpath("(//span[.='Show Receipt'])[1]")).click();
         Thread.sleep(2000);
         ch.findElement(By.xpath("//span[.='Student']")).click();
         ch.findElement(By.xpath("//label[.='Help']")).click();
         Thread.sleep(2000);
         ch.findElement(By.xpath("(//span[@class='inline-flex justify-center items-center w-6 h-6'])[2]")).click();






	}
}
