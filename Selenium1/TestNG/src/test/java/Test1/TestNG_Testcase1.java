package Test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Testcase1 
{
	@BeforeTest
	public void connectDB() 
	{
		System.out.println("ConnectDB");
		
	}
	@AfterTest
	public void disconnectDB() 
	{
		System.out.println("DisConnectDB");
		
	}
	@BeforeMethod
	public void openingbroser() 
	{
		System.out.println("Opening the browser");
		
	}
	@AfterMethod
	public void closingBrowser() 
	{
		System.out.println("Closing the browser");
		
	}
	
	@Test(priority = 2)
	public void dologin() 
	{
		System.out.println("Execution has been passed");
		
	}
	
	@Test (priority = 1)
	public void user_registration() 
	{
		System.out.println("Registration Passed");
		
	}

}
