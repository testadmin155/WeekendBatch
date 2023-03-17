package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization extends BaseTest{

	public static void main(String[] args)  {
		
		/* Synchronization is a process to make both script and Application under test (AUT) into sink.
		    There are 4 types of Synchronization
		    1. Thread.Sleep
		    2. Implicit wait
		    3. Explicit wait
		    4. Fluent wait
		    
		    Implicit wait: These waits are used to provide a default waiting time (say, 30 seconds) between the consecutive test steps across the entire test script. Hence, the subsequent test step would only be executed when the 30 seconds are over after executing the previous test step.
			
			Explicit wait: These waits are used to halt the execution until a particular condition is met or the maximum time has elapsed. Explicit waits are instantiated for a particular instance only, whereas implicit waits are not.
			
			FluentWait: FluentWait can define the maximum amount of time to wait for a specific condition and frequency with which to check the condition before throwing an “ElementNotVisibleException” exception.
			In simple words, it tries to find the web element repeatedly at regular intervals of time until the timeout or till the object gets found.

		 
		 */
		 
		
		browserinit("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		//ExplicitWait
		
		driver.findElement(By.id("display-other-button")).click();
		System.out.println(driver.findElement(By.id("hidden")).isDisplayed());
		
		// Thread.sleep
		/*try {
			Thread.sleep(30000);  /milliseconds
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 30);   //seconds
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
		
		System.out.println(driver.findElement(By.id("hidden")).isDisplayed());
		driver.findElement(By.id("hidden")).click();
		
		//Syntax fluent wait
		FluentWait fwait = new FluentWait(driver);
		fwait.withTimeout(30, TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS);
		driver.findElement(By.id("hidden")).click();
		
		
		
		
		

	}

}
