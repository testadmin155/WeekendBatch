package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Calendar extends BaseTest{

	public static void main(String[] args) {
		
		browserinit("https://book.spicejet.com/");
		
		//driver.findElement(By.id("custom_date_picker_id_1")).click();
		
		WebElement element = driver.findElement(By.id("custom_date_picker_id_1"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		//March 24
		String Month = "March 2023";
		String Day = "25";
		
		for (int monthHeader =1; monthHeader<=12;monthHeader++)
		{
		
		String firstheader=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-first')]/div/div")).getText();
		System.out.println(firstheader);
		
		String secondheader=driver.findElement(By.xpath("//div[contains(@class,'ui-datepicker-group-last')]/div/div")).getText();
		System.out.println(secondheader);
		
		
		if(firstheader.equals(Month))
		{
			List<WebElement> alldays = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group-first')] //a[contains(@class,'ui-state-default')]"));
			System.out.println(alldays.size());
			for (int i=0; i<alldays.size();i++)
			{
				System.out.println(alldays.get(i).getText());
				if(alldays.get(i).getText().equals(Day))
				{
					alldays.get(i).click();
					break;
				}
			}
			
			break;
		}
		
		else if(secondheader.equals(Month))
		{
			List<WebElement> alldays = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group-last')] //a[contains(@class,'ui-state-default')]"));
			System.out.println(alldays.size());
			for (int i=0; i<alldays.size();i++)
			{
				System.out.println(alldays.get(i).getText());
				if(alldays.get(i).getText().equals(Day))
				{
					alldays.get(i).click();
					break;
				}
			}
			
			break;
		}
		
		else
		{
		 driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-triangle-e')]")).click();
		}
		
	}
		
  }

}
