package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class AddCustomerTest extends BaseTest  {
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void addCustomer(String firstName, String lastName, String postCode) throws InterruptedException {
		
		click("addCustomerBtn_CSS");
		type("firstname_CSS",firstName);
		type("lastname_CSS",lastName);
		type("postcode_CSS",postCode);
		click("addcust_CSS");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Customer added successfully"));
		alert.accept();
		
		Thread.sleep(3000);
	}

}
