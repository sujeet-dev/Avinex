package Practice_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing_Iframe {

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  List<WebElement> frame= driver.findElements(By.xpath(""));
	  System.out.println(frame.size());
	  
	  
	  for (WebElement frames : frame) 
	  {
		  System.out.println(frames.getAttribute("id"));
		
	}
	  
	  driver.switchTo().frame("iframeResult");
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  
	  

	}

}
