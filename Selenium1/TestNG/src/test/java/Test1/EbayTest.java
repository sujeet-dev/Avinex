package Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayTest {

	@Test
	public void search() {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://ebay.com");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  driver.findElement(By.id("gh-ac")).sendKeys("iphone");
		  driver.findElement(By.xpath("//span[text()='Search']")).click();
	  
		
	}
	
	
		

	

}
