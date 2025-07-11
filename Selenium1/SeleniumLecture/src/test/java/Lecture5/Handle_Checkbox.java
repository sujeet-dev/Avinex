package Lecture5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Checkbox {
	
	public static boolean isElementPresent(By by) 
	{
		try {
			  driver.findElement(by);
			  return true;
		} catch (Throwable e) {
			return false;
		}
	}
	
	public static WebDriver driver;

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  
	  //For multiple checkbox
	  
//	  for (int i = 1; i <=4; i++) 
//	  {
//		  driver.findElement(By.xpath("(//input[@name='sports'])[" + i + "]")).click();
////		driver.findElement(By.xpath("//div[4]/input[" + i + "]")).click();
//	}
	  
//	  driver.findElement(By.xpath("(//input[@value='soccer'])[1]")).click();
//	  int i=1;
//	  while (true) 
//	  {
//		  driver.findElement(By.xpath("(//input[@name='sports'])[" + i + "]")).click();
//		i++;
//	}
	  System.out.println(isElementPresent(By.xpath("(//input[@name='sports'])[9]")));
	  
	  
	  WebElement block=  driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
	  java.util.List<WebElement> checkboxes = block.findElements(By.name("sports"));
	  
	    System.out.println(checkboxes.size());  
	    
	    for (WebElement checkbox : checkboxes) 
	    {
	    	checkbox.click();
			
		}

	}

}
