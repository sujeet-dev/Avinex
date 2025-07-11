package Lecture8;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_TestCase3 
{
	@Test(priority=2, dependsOnMethods = "doRegistration")
	public void doLogin() {
		System.out.println("User Login the page");
		
		
	}
	
	
	@Test(priority=1)
	public void doRegistration()
	{
		System.out.println("User registration the page");
		assertTrue(false, "Test case failed as button was missing");
	}
	

}
