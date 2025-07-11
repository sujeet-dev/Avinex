package Lecture5;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsElementPresent {
	
	public static WebDriver driver;
	
	public static Boolean isElementPresent(By by) 
	{
	  try {
		  driver.findElement(by);
		  return true;
	} catch (Throwable e) {
		return false;
	}
			
	}
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
		  
		  
		  System.out.println(isElementPresent(By.xpath("(//input[@name='sports'])[9]")));
		  
		  int i=1;
		  int count=0;
		  while (isElementPresent(By.xpath("(//input[@name='sports'])["+i+"]"))) 
		  {
			  driver.findElement(By.xpath("(//input[@name='sports'])[" + i + "]")).click();
			i++;
			count++;
		}
		  System.out.println("The count of checkbox is : " +count);
		  
		

		  
		  
	}}




