package Lecture8;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.poi.ss.usermodel.helpers.BaseRowColShifter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class TestNG_TestCase2 
{
	
//	public static void main(String[] args) {
	
	public void validateTitle() {
	
		System.out.println("beggining");
	String expectedvalue="google.com";
	String actualvalue="gmail.com";
	
//	if (expectedvalue.equals(actualvalue))
//	{
//		System.out.println("Comapiring Pass");
//		
//	} else {
//		System.out.println("Compairing Fail");
//
//	}
	
	SoftAssert s=new SoftAssert();
	
	s.assertEquals(actualvalue, expectedvalue);
	s.assertTrue(false," Test case failed as the button was missing");
	
	System.out.println("Ending");
	
	s.assertAll();
	
	
	}
	

}
//}
