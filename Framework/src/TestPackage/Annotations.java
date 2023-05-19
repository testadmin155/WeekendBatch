package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Annotations {
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("This is a Before Suite");
	}
	
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This is a Before Class");
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This is a Before Test");
	}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This is a Before Method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This is a After Method");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This is a After Test");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("This is a After Class");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("This is a After Suite");
	}

}
