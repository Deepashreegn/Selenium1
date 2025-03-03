package Practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.Browsers;

public class Fetch_tooltip_RefrencePointUSingTESTNG extends Browsers
{
  @Test
    public void fetch()
    {
	    WebElement kann= driver.findElement(By.id("u_0_5_5F"));
		 String tooltip=kann.getAttribute("title");
		 System.out.println(tooltip);
		 String refPoint=kann.getAttribute("href");
		 System.out.println(refPoint);
    }
  }

