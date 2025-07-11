package Lecture7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_New_Window {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 WebDriver  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://weteams.io/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  
		  driver.switchTo().newWindow(WindowType.TAB);
		  driver.get("https://google.com");
		  driver.findElement(By.name("q")).sendKeys("Selenium");
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://gmail.com");
		  System.out.println(driver.getTitle());
		  
		System.out.println(driver.getWindowHandles().size());

	}

}
