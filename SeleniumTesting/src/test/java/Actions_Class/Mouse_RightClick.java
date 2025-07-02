package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_RightClick {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    WebElement img= driver.findElement(By.xpath("//p[2]/img"));
	    
	   Actions a= new Actions(driver);
	   a.contextClick(img).perform();
	   
	   WebElement productInfo= driver.findElement(By.id("dm2m1i1tdT"));
       Actions a1=new Actions(driver);
	   a1.moveToElement(productInfo).perform();
	   
	   WebElement installations= driver.findElement(By.id("dm2m2i1tdT"));
	   Actions a2=new Actions(driver);
	   a2.moveToElement(installations).perform();
	   driver.findElement(By.id("dm2m3i0tdT")).click();
	   
//	   WebElement productInfo= driver.findElement(By.id("dm2m1i1tdT"));
//	   new Actions(driver).moveToElement(productInfo).perform();
//	   
//	   WebElement installations= driver.findElement(By.id("dm2m2i1tdT"));
//	   new Actions(driver).moveToElement(installations).perform();
	   
	   driver.findElement(By.id("dm2m3i0tdT")).click();
	    

	}

}
