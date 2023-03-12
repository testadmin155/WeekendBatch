package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseTest {
	static WebDriver driver;
	
	static void browserinit(String url)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Session\\SeleniumTraining\\BrowserDrivers\\ChromeLatest\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void tearDown()
	{
		driver.close();
	}
	
	public void SelectPassanger(String adultcount, String childcount, int Infantcount)
	{
		//Script to select Number of Passengers
		
				//Script to click on Passenger field
				//String defaultvalue=driver.findElement(By.id("divpaxinfo")).getText();
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
	
public void FromTo(String From,String To)
	
	{
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		System.out.println("//a[@value='"+From+"']");
		System.out.println("//a[@value='"+To+"']");
		driver.findElement(By.xpath("//a[@value='"+From+"']")).click();
		driver.findElement(By.xpath("(//a[@value='"+To+"'])[2]")).click();
		//driver.findElement(By.xpath("(//a[@text='Nashik (ISK)'])[2]")).click();
	}



public void checkbox(String Optiontext, String checkboxOption)
{
	//Script to select a option
	int text =driver.findElements(By.xpath("//div[contains(@class,'padding-bottom-3')]/p")).size();

	List<WebElement> alloptions =driver.findElements(By.xpath("//div[contains(@class,'padding-bottom-3')]/p"));
					 
	for (WebElement discountoption:alloptions)
			{
				//System.out.println(discountoption.getText());
				if (discountoption.getText().equals(Optiontext))
				{
					driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_"+checkboxOption+"")).click();			
				}
			}
}


	public static void main(String[] args) {
		
		

	}

}
