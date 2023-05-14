package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlexiLoan {
	
	@Test(groups= {"Sanity"})
	public void FlexiLoanWEB()
	{
		System.out.println("FlexiLoan from WEB");
	}
	
	@Test
	public void FlexiLoanApp()
	{
		System.out.println("FlexiLoan from App");
		Assert.assertTrue(true);
	}
	
	@Test
	public void FlexiLoanBranch()
	{
		System.out.println("FlexiLoan from Branch");
	}

}
