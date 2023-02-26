package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeLatest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.ie.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://www.Hdfcbank.com");
		
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("HDFC Bank – Personal Banking & Netbanking Services"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
