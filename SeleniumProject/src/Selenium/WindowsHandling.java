package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowsHandling extends BaseTest{
	
	public static void main(String[] args) {
		
		browserinit("https://demo.automationtesting.in/Windows.html");
		
		//Script to handle multiple tabs
		
		/*driver.findElement(By.xpath("//button[contains(@class,'btn-info')]")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String firstwindow = it.next();
		String secondwindow=it.next();
		System.out.println("FirstWindow - "+firstwindow);
		System.out.println("SecondWindow - "+secondwindow);
		
		driver.switchTo().window(secondwindow);
		String message = driver.findElement(By.xpath("//div[contains(@class,'text-center')]/h1")).getText();
		System.out.println(message);
		
		driver.switchTo().window(firstwindow);
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[2]")).click();
		
		//driver.close();
		driver.quit();
	*/
		
		//script to handle multiple windows
		
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String firstwindow = it.next();
		String secondwindow=it.next();
		System.out.println("FirstWindow - "+firstwindow);
		System.out.println("SecondWindow - "+secondwindow);
		
		driver.switchTo().window(secondwindow);
		String message = driver.findElement(By.xpath("//div[contains(@class,'text-center')]/h1")).getText();
		System.out.println(message);
		
		driver.switchTo().window(firstwindow);
		driver.findElement(By.xpath("//ul[contains(@class,'nav-stacked')]/li[1]")).click();
		
		//driver.close();
		driver.quit();
		
	}

}
