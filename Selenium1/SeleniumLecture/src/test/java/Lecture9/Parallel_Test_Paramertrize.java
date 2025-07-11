package Lecture9;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel_Test_Paramertrize 
{
	@Parameters({"browser","url"})
	@Test
	public void launchBrowser(String browser, String url) 
	{
		
		System.out.println(browser+"--------"+url);
	}

}
