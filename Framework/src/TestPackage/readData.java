package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class readData {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Testing Session\\SeleniumTraining\\WeekendBatch\\Framework\\data.properties");
		
		prop.load(fis);
		
		//script to read data from property file
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("Browser"));
		
		//Script to write data to property file
		prop.setProperty("training", "Selenium");
		prop.setProperty("place", "Brussles");
		
		FileOutputStream fos = new FileOutputStream("E:\\Testing Session\\SeleniumTraining\\WeekendBatch\\Framework\\data.properties");
		prop.store(fos, "savingfile");
		
		
		
	}

}
