package Lecture5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_Right_Click {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    
	    WebElement img=driver.findElement(By.xpath("//p[2]/img"));
	    
	    new Actions(driver).contextClick(img).perform();
	    
	    // mouser hover of productinfo
	    
	    WebElement productinfo=driver.findElement(By.id("dm2m1i1tdT"));
	    new Actions(driver).moveToElement(productinfo).perform();
	    
	    // mouse hover of installations
	    
	    WebElement insta=driver.findElement(By.id("dm2m2i1tdT"));
	    new Actions(driver).moveToElement(insta).perform();
	    
	    //how to setup
	    
	    driver.findElement(By.id("dm2m3i1tdT")).click();

	}

}
