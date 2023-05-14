package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Practise website - https://demo.automationtesting.in/Register.html
		
		/*
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Locator - ID
		//driver.findElement(By.id("login1")).sendKeys("testautomation");
		//driver.findElement(By.id("password")).sendKeys("Password@1234");
		
		//Locator - name
		//driver.findElement(By.name("login")).sendKeys("testautomation");
		//driver.findElement(By.name("passwd")).sendKeys("Test@1234");
		//driver.findElement(By.name("proceed")).click();
		
		*/
		
		//Locator - Xpath
		/*
		driver.get("https://mail.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		String url =driver.getCurrentUrl();
		if(url.equals("https://mail.rediff.com/cgi-bin/login.cgi"))
		{
			System.out.println("Sign-in link is working");
		}
		else
		{
			System.out.println("Sign-in link is not working");
		}
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("testautomation");
		Thread.sleep(3000);  //milliseocnds
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Test@1234");
		Thread.sleep(5000);  //milliseconds
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		*/
		
		//Locator - CssSelector
		//Tagname is optional for CssSelector 
		driver.get("https://mail.rediff.com/");
		driver.findElement(By.cssSelector("a[title='Already a user? Sign in']")).click();  //tagName[attribute='value']   
		driver.findElement(By.cssSelector("input#login1")).sendKeys("testautomation");  //tagName#id    
		driver.findElement(By.cssSelector("#password")).sendKeys("Test@1234"); //#id 
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.signinbtn")).click(); //tagName.classname
		
		String Expectedmessage = "Wrong username and password combination.";
		String Actualmessage = driver.findElement(By.id("div_login_error")).getText();
		
		/*if(Actualmessage.equals(Expectedmessage))
		{
			System.out.println("Test case is passed");
			
		}
		else
		{
			System.out.println("Test case is Failed");
			
			
		}*/
		
		Assert.assertEquals(Actualmessage, Expectedmessage);
		
		//driver.close();
		

	}

}
