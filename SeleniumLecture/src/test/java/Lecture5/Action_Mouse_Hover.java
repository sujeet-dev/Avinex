package Lecture5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Mouse_Hover {

	public static void main(String[] args) throws IOException 
	{
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");
		  
		WebElement unitmonitering=  driver.findElement(By.xpath("//ul[@id='mainmenu']/li[3]/ul/li[2]/img"));
		
		Actions a=new Actions(driver);
		a.moveToElement(unitmonitering).perform();
		
		driver.findElement(By.linkText("Customer Data")).click();

	}

}
