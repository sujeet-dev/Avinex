package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_MouseOver {

	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.way2automation.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	WebElement menu=  driver.findElement(By.xpath("//*[@id=\"menu-item-27580\"]/a/span[2]"));
	
	Actions a=new Actions(driver);
	a.moveToElement(menu).perform();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id=\"menu-item-27592\"]/a/span[2]")).click();
	  

	}

}
