package Test1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Testcase2 
{
	@Test
	public void Compaire() 
	{
		String expected="Google.com";
		String actual="gmail.com"
				;


//		if (expected.equals(actual)) 
//		{
//			System.out.println("Title result pass");
//
//		} else {
//			System.out.println("title is failed");
//		}
		SoftAssert sa=new SoftAssert();
		
		sa.assertEquals(actual, expected);
		sa.assertTrue(false, "test case failed that button was missing");
		sa.fail("failing the test as the condition was not met");
		
		sa.assertAll();
	}

}
