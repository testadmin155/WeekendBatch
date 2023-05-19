package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MortageLoan extends Annotations{
	
	@Test
	public void MortageLoanWEB()
	{
		System.out.println("MortageLoan from WEB");
		Assert.assertTrue(true);
	}
	
	@Test
	public void MortageLoanApp()
	{
		System.out.println("MortageLoan from App");
		Assert.assertTrue(true);
	}
	
	@Test(groups= {"Sanity"})
	public void MortageLoanBranch()
	{
		System.out.println("MortageLoan from Branch");
	}

}
