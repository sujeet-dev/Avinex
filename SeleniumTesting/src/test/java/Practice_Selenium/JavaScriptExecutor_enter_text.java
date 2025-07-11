package Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor_enter_text {

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://weteams.wedighq.com/#/signin");
	  
	  WebElement email= driver.findElement(By.name("email"));
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value='sujeet.singh@wedigtech.com'", email);
	  
	  WebElement password = driver.findElement(By.name("password"));
	  
	  JavascriptExecutor js1=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].value='Singh@1994'", password);

	}

}
