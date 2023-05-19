package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarBuyLoan extends Annotations{
	
	@Test(groups= {"Regression"})
	public void CarBuyLoanWEB()
	{
		System.out.println("CarBuyLoan from WEB");
	}
	
	@Test(groups= {"Sanity"})
	public void CarBuyLoanApp()
	{
		System.out.println("CarBuyLoan from App");
		Assert.assertTrue(true);
	}
	
	@Test(groups= {"Regression"})
	public void CarBuyLoanBranch()
	{
		System.out.println("CarBuyLoan from Branch");
	}
	

}
