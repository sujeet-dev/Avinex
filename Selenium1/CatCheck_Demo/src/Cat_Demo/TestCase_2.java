package Cat_Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();

		  driver.get("http://the-internet.herokuapp.com/basic_auth");
		  driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  Runtime.getRuntime().exec("E:\\AutoIT\\Login2.exe");
		  

	}

}
