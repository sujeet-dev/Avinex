package Cat_check_App;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NHT_Cycle {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");
		   
		  
		   

//      driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/div[6]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
//      driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/div[6]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
//		   WebElement menu= driver.findElement(By.id("menuid_imgLogo"));
//			  
//			  Actions a=new Actions(driver);
//			  a.moveToElement(menu).perform();
//			  
//			  driver.findElement(By.xpath("//img[@id='menuid_imgLogo2']")).click();
			  
		   // Click on Unit monitering module
		 
		 

		   driver.findElement(By.id("dvUMNonEOText")).click();
		   driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("2340");
		   driver.findElement(By.xpath("//div[@id='dvS2340']")).click();
		   
		   //Click config page
		   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CYCLE CONFIG']")));
		   
		   
	   driver.findElement(By.xpath("//*[@id='img7']")).click();
		   driver.findElement(By.xpath("//li[@id='ui-id-7']")).click();
//		   driver.findElement(By.id("spChart")).click();
		   
		 
		
	}

}
