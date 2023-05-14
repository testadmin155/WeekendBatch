package TestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CarLease {
	
	@Test(groups= {"Sanity"})
	public void CarLeaseWEB()
	{
		System.out.println("CarLease from WEB");
	}
	
	@Test
	public void CarLeaseApp()
	{
		System.out.println("CarLease from App");
		Assert.assertTrue(true);
	}
	
	@Test
	public void CarLeaseBranch()
	{
		System.out.println("CarLease from Branch");
	}
	

}
