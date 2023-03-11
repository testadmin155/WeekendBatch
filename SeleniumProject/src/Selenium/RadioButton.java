package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends BaseTest{

	public static void main(String[] args) {
		
		RadioButton obj = new RadioButton();
		
		obj.browserinit();
		
		List<WebElement> traveloptions=driver.findElements(By.xpath("//div[@id='travelOptions']/div/label"));
		
		for(WebElement eachoption:traveloptions)
		{
			System.out.println(eachoption.getText());
		}
		
		
		if (driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).isSelected()==true);
		{
			//System.out.println(driver.findElement(By.xpath("//input[@id='custom_date_picker_id_2'][1]")).isDisplayed());
			//System.out.println(driver.findElement(By.xpath("//input[@id='custom_date_picker_id_2'][1]")).isEnabled());
			String returndatefielddisplay=driver.findElement(By.id("marketDate_2")).getAttribute("style");
			System.out.println(returndatefielddisplay);
			if(returndatefielddisplay.contains("0.5"))
			{
				System.out.println("return date is disabled");
			}
			else
			{
				System.out.println("return date is not disabled");
			}
			
		}
		
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).click();
		String returndatefielddisplay1=driver.findElement(By.id("marketDate_2")).getAttribute("style");
		System.out.println(returndatefielddisplay1);
		if(returndatefielddisplay1.contains("1.0"))
		{
			System.out.println("return date is Enabled");
		}
		else
		{
			System.out.println("return date is not Enabled");
		}
		
		
		//System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")).isSelected());

	}

}
