package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Testcase3 {
	
	@Test(priority = 2, dependsOnMethods = "user_registration")
	public void dologin() 
	{
		System.out.println("Execution has been passed");
		
	}
	
	@Test (priority = 1)
	public void user_registration() 
	{
		System.out.println("Registration Passed");
		Assert.fail("user registration failed, bcoz button is missing");
		
	}

}
