package Practice_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_Checkbox {

	public static void main(String[] args) 
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   
	   /// Case 1:- 
//	   driver.findElement(By.xpath("(//input[@name='sports'][@value='soccer'])[1]")).click();
//	   driver.findElement(By.xpath("(//input[@name='sports'][@value='football'])[1]")).click();
//	   driver.findElement(By.xpath("(//input[@name='sports'][@value='baseball'])[1]")).click();
//	   driver.findElement(By.xpath("(//input[@name='sports'][@value='basketball'])[1]")).click();
	   
	   ///Case 2:-
	   
//	   for (int i = 1; i <=4; i++) 
//	   {
////		   driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//		   driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//		
//	}
//	   int i=1;
//	   while (true) 
//	   {
//		   driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
//		i++;
//	}
      
	WebElement block= driver.findElement(By.xpath("//div[@class='display'][1]"));
	List<WebElement> checkboxes=block.findElements(By.name("sports"));
	
	System.out.println(checkboxes.size());
	
	for (WebElement webElement : checkboxes) 
	{
		webElement.click();
		
	}
	   

	}

}
