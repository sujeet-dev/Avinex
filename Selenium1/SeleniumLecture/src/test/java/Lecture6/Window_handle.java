package Lecture6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handle {
	
	

	public static void main(String[] args) throws IOException 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://weteams.io/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  WebElement demo=driver.findElement(By.xpath("//div[@class='mt-10']/a[1]"));
	  demo.click();
	  
	 Set<String> winids= driver.getWindowHandles();
	  Iterator<String> iterate=  winids.iterator();
	String firstwindow=  iterate.next();
	String secondwindow = iterate.next();
	
	
	System.out.println("the first window is : "  + firstwindow);
	System.out.println("the second window is  : " + secondwindow);
	
	driver.switchTo().window(secondwindow);
	
	driver.findElement(By.xpath("//button[@jsname='KRFiD']/span[4]")).click();
	
	driver.switchTo().window(firstwindow);
	
	driver.findElement(By.xpath("//div[@class='container-fluid']/div/ul/li[2]/a")).click();
	
	//Taking Screenshot
	
//	File screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	
//	FileUtils.copyFile(screenshot, new File("./screenshot.error.jpg"));
	  

	}

}
