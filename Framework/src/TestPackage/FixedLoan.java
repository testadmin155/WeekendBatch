package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FixedLoan extends Annotations{

	@Test(dependsOnMethods = {"FixedLoanApp"})
	public void FixedLoanWEB()
	{
		System.out.println("FixedLoan from WEB");
	}
	
	@Test
	public void FixedLoanApp()
	{
		System.out.println("FixedLoan from App");
		Assert.assertTrue(true);
	}
	
	@Test
	public void FixedLoanBranch()
	{
		System.out.println("FixedLoan from Branch");
	}

}
