package TestPackage;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

	//teststcase1
	@Test
	public void testcase1()
	{
		Assert.assertTrue(true);
	}
			
	
	//Testcase2
	@Test
	public void testcase2()
	{
		//Assert.assertTrue(false);
		Assert.assertEquals(4, 3);
	}
	
	
	//testcase3
	
}
