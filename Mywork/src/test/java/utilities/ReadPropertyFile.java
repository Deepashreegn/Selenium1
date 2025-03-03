package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {//basic logic for reading values out of property file

	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("C:\\Users\\nanda\\eclipse-workspace\\Mywork\\src\\test\\resources\\configFiles\\config.properites");
        Properties p= new Properties();
        p.load(fr);
        System.out.println(p.getProperty("browser"));
        System.out.println(p.getProperty("testurl"));
	}

}
