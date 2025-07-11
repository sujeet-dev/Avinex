 package Lecture8;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNG_TestCase1 {
	@BeforeTest
	public void CosmosDB(){
		System.out.println("Coonect to the database");
	}
	@AfterTest
	public void CloseCosmosDB() {
		System.out.println("Disconnect the Database");
	}
	@BeforeMethod
	public void launchingBrowser() {
		
		
		System.out.println("Launching the browser");
	}
	@AfterMethod
	public void ClosingBrowser() 
	{
		System.out.println("Closing the browser");
		Reporter.log("browser closed");
	}

	@Test(priority = 2)
	public void doLogin() {
		
		
		System.out.println("Executing the login page");
	}
	
	@Test(priority = 1)
	public void UserRegistration() {
		Reporter.log("Perform User Reg test");
		System.out.println("Executing the user registration flow");
	}

}
