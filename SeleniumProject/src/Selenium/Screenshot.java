package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Screenshot extends BaseTest{

	public static void main(String[] args) {
		 
        browserinit("https://www.amazon.in/");
		
		Actions mouse = new Actions(driver);
		
		//Script to double click
		mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").doubleClick().perform();
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			Files.copy(screenshot, new File ( "C:\\Users\\Aneesh\\Documents\\Zoom\\Weekend Batch\\amazon1.png"));
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.close();

	}

}
