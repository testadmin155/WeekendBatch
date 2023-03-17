package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends BaseTest{

	public static void main(String[] args) {
		
		browserinit("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Actions mouse = new Actions(driver);
		
		//mouse.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		mouse.dragAndDrop(source, target).perform();
	}

}
