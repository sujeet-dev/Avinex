package JavaScriptExecutor;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_JavaScriptExecutor {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		  
		  Thread.sleep(2000);
		  Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");
		  
		  Thread.sleep(5000);
		  
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  js.executeAsyncScript("alert('hello')");


	}

}
