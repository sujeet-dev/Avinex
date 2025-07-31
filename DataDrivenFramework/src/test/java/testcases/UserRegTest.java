package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class UserRegTest extends BaseTest{
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void userRegTest(String firstName, String lastName, String address) {
		
		System.out.println(firstName+"----"+lastName+"----"+address);
		
	}
	
	
}
