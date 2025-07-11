package CatCheck_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static String browser="firefox";
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		if (browser.equals("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else 
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		String title= driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
	}

}
