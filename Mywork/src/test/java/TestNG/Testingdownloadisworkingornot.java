package TestNG;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.testng.Reporter;

public class Testingdownloadisworkingornot {

	public class TestNGExample {
	    @Before
	    public void testMethod() 
	    {
//	        System.out.println("TestNG is working!");
	    	Reporter.log("begining of framework", true);
	    }
	    @Test
	    public void test()
	    {
	    	Reporter.log("end of framework", false);
	    }
	}
	
}
