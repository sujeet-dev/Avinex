package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Slider {

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://jqueryui.com/slider/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		  driver.switchTo().frame(0);
		  WebElement slider= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		  Actions act=new Actions(driver);
		  act.dragAndDropBy(slider, 200, 0).perform();
		  
		  Thread.sleep(3000);
//		  act.sendKeys(Keys.ARROW_RIGHT).build().perform();

	}

}
