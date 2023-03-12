package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class MouseActions extends BaseTest{

	public static void main(String[] args) {
		
		browserinit("https://www.amazon.in/");
		
		//Actions mouse = new Actions(null, null);		//Depricated - mean this is no more available
		Actions mouse = new Actions(driver);
		
		//mouse.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
		
		/*
		// script to click on prime vedios link
		driver.findElement(By.xpath("//span[text()='Your Prime Video']")).click();
		String vediourl=driver.getCurrentUrl();
		
		if (vediourl.equals("https://www.primevideo.com/?ref_=_apv"))
		{
			System.out.println("Prime vedio is displayed");
		}
		else
		{
			System.out.println("Prime vedio is not displayed");
		}
		*/
		
		// script to right click
		//mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Your Prime Video']"))).contextClick().perform();
		
		//Script to enter Capital letters
		//mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").perform();
		
		//Script to double click
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").doubleClick().perform();
		
		driver.close();
	}

}
