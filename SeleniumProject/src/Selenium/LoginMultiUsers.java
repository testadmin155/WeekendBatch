package Selenium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMultiUsers {
	
	static WebDriver driver;
	
	static void Login(String username, String password)
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username); //
		driver.findElement(By.name("passwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		String msg = driver.findElement(By.id("div_login_error")).getText();
		System.out.println(msg);
		
		if (msg.equals("Wrong username and password combination."))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeLatest\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Login("Anees", "Test@1234");
		Thread.sleep(3000);
		
		Login("Usman", "Password@1234");
		Thread.sleep(3000);
		
		Login("Ashwini", "Testing");
		Thread.sleep(3000);
		
		Login("Acahala", "Test@987");
		Thread.sleep(3000);
		
		Login("Shoaib", "Password");
		Thread.sleep(3000);
		
		
		/*
		 In Website what are the fields you see
		 
		 1. Edit Field/Text Field
		 2. Radio button
		 3. CheckBoxes
		 4. Dropdowns
		 5. Buttons
		 6. Mousehover
		 7. Calenders
		 
		 
		 
		 */
		
		// <a href="/gp/help/customer/display.html/ref=ap_signin_notification_condition_of_use?ie=UTF8&amp;nodeId=200545940" xpath="1">Conditions of Use</a>
		
		//Xpath - //a[text()='Conditions of Use']
		
		

	}

}
