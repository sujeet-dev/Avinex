package Lecture7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Relative_Locators {

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://way2automation.com/way2auto_jquery/index.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	WebElement above=  driver.findElement(RelativeLocator.with(By.name("email")).above(By.name("country")));
	above.sendKeys("Sujeet");
	  
	WebElement below=  driver.findElement(RelativeLocator.with(By.name("city")).below(By.name("country")));
	below.sendKeys("Indore");
	
	WebElement Rightof = driver.findElement(RelativeLocator.with(By.name("username")).toRightOf(By.tagName("label")));
	Rightof.sendKeys("jhasdj");
	
	WebElement nearby = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
	nearby.click();
	
	}

}
