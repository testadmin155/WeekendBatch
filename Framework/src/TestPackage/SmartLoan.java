package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmartLoan extends Annotations{

	@Test
	public void SmartLoanWEB()
	{
		System.out.println("SmartLoan from WEB");
	}
	
	@Test(groups= {"Sanity"})
	public void SmartLoannApp()
	{
		System.out.println("SmartLoan from App");
		Assert.assertTrue(true);
	}
	
	@Test
	public void SmartLoanBranch()
	{
		System.out.println("SmartLoan from Branch");
	}
	
}
