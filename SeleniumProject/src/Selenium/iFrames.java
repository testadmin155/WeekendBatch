package Selenium;

import org.openqa.selenium.By;

public class iFrames extends BaseTest{

	public static void main(String[] args) {
		
		browserinit("https://demo.automationtesting.in/Frames.html");
		
		//Frames can be identified using name or id
		//driver.switchTo().frame("SingleFrame");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		
		
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();  // whenever <a and href is present you can use locator linktext

	}

}
