package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
	
	static WebDriver driver;

	public void checkbox(String Optiontext, String checkboxOption)
	{
		//Script to select a option
		int text =driver.findElements(By.xpath("//div[contains(@class,'padding-bottom-3')]/p")).size();

		List<WebElement> alloptions =driver.findElements(By.xpath("//div[contains(@class,'padding-bottom-3')]/p"));
						 
		for (WebElement discountoption:alloptions)
				{
					System.out.println(discountoption.getText());
					if (discountoption.getText().equals(Optiontext))
					{
						driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_"+checkboxOption+"")).click();			
					}
				}
	}
	
	
	public static void main(String[] args) {
		
		
		//Script to get the count of checkboxes
		int numberofCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(numberofCheckbox);
		
		HandlingCheckBox obj = new HandlingCheckBox();
		
		//obj.checkbox("Family & Friends","FamilyAndFriends");
		//obj.checkbox("Unaccompanied Minor","UNMR");
		obj.checkbox("LTC Fare","LTCFare");
	}

}
