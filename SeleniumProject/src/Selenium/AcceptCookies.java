package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class AcceptCookies extends BaseTest{
	
public static void main(String[] args) {
		
		browserinit("https://www2.hm.com/fr_be/index.html");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//ul[@class='ZBbS']/li[1]"))).perform();
		driver.findElement(By.xpath("//a[text()='Chaussures et accessoires']")).click();
		
}

}
