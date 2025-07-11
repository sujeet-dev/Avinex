package CatCheck_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intranet_Login_Logout
{
	public static String browser="edge";
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		if (browser.equals("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
			
		}else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
	 
	  driver.manage().window().maximize();
	  driver.get("http://10.2.10.77/main/index.asp");
	  
	  driver.findElement(By.name("UserInitials")).sendKeys("ssi");
	  driver.findElement(By.name("UserPassword")).sendKeys("ssi");
	  driver.findElement(By.name("B1")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("In1")).clear();
	  driver.findElement(By.name("In1")).sendKeys("10:03 AM");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.name("Out1")).sendKeys("7:07 PM");
	  
	  Thread.sleep(1000);
	  
//	  driver.findElement(By.name("B1")).click();

	}

}
