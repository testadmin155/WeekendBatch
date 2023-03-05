package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	 /*
	 Dropdowns - There are two type of Dropdown 
	 1. Static 
	 2. Dynamic
	 
	 1. Static Dropdown:
	 		- If u find any dropdown with fixed options then it is called as static dropdown
	 		- If you find any dropdown with tagname Select,then Selenium has a class to identify element
	 		- We need to create an object for Select class and use it
	 		- If there is not Select tagname, then we can't use this Select class 
	 
	 */

	static WebDriver driver;
	
	public void SelectPassanger(String adultcount, String childcount, int Infantcount)
	{
		//Script to select Number of Passengers
		
				//Script to click on Passenger field
				String defaultvalue=driver.findElement(By.id("divpaxinfo")).getText();
				driver.findElement(By.id("divpaxinfo")).click();
				
				//Script to select Adult
				Select adult = new Select(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT")));
				adult.selectByVisibleText(adultcount);
				//Script to select Child
				Select child = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
				child.selectByValue(childcount);
				//Script to select Infant
				Select infant = new Select(driver.findElement(By.xpath("(//select[contains(@class,'wMed1s')])[3]")));
				infant.selectByIndex(Infantcount);
				
	}
	
	
	public void currencyType(String currval)
	{
		Select currencydropdown = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		String displayvalue = currencydropdown.getFirstSelectedOption().getText();
		System.out.println("Default selected value is : "+displayvalue);
		
		//currencydropdown.selectByValue("GBP");
		//currencydropdown.selectByIndex(6);
		currencydropdown.selectByVisibleText(currval);
		
		String displayvalue1 = currencydropdown.getFirstSelectedOption().getText();
		System.out.println("Selected value is : "+displayvalue1);
	}
	
	public static void main(String[] args) {
		
		StaticDropdown obj = new StaticDropdown();
		
		obj.currencyType("SAR");
		obj.SelectPassanger("3", "2", 1);

		// How to write X-path using class and using regular expression
		//(//select[@class='wMed1s required guests'])[3]
		//(//select[contains(@class,'wMed1s')])[3]
		
	}

}
