package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DestinationFromTo {
	
	static WebDriver driver;
	
public void FromTo(String From,String To)
	
	{
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		System.out.println("//a[@value='"+From+"']");
		System.out.println("//a[@value='"+To+"']");
		driver.findElement(By.xpath("//a[@value='"+From+"']")).click();
		driver.findElement(By.xpath("(//a[@value='"+To+"'])[2]")).click();
		//driver.findElement(By.xpath("(//a[@text='Nashik (ISK)'])[2]")).click();
	}

	public static void main(String[] args) {
		
		
		DestinationFromTo obj = new DestinationFromTo();
		obj.FromTo("BLR","HYD");
		
		////a[text()=' Bengaluru (BLR)'] - this is to identify when there is no Attribute for <a (links)
		
		//NoSuchElementException: no such element
		//ElementClickInterceptedException: element click intercepted:Element is not clickable at point
		//ISK
		
		
		
		
		
		
	}

}
