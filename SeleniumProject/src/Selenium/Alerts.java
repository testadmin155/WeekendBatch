package Selenium;

import org.openqa.selenium.By;

public class Alerts extends BaseTest{

	public static void main(String[] args) {
		
		browserinit("https://demo.automationtesting.in/Alerts.html");
		
		/*
		//script to accept the Alert with only Ok button
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		String alerttext=driver.switchTo().alert().getText();
		System.out.println(alerttext);
		
		driver.switchTo().alert().accept();
		*/
		
		//script to accept the Alert with  Ok and cancel button
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		String alertmessage= driver.switchTo().alert().getText();
		System.out.println(alertmessage);
		
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		String actionmessage = driver.findElement(By.id("demo")).getText();
		if (actionmessage.equals("You Pressed Cancel"))
		{
			System.out.println("Alert is Cancelled");
		}
		else
		{
			System.out.println("Alert is Accepted");
		}

	}

}
