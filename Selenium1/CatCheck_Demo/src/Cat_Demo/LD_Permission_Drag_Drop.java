package Cat_Demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LD_Permission_Drag_Drop 
{
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.2.10.7/CC30/Cat-Check/LDG/Search.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='txtSearch'][@type='text'][@ng-model='searchldg']")).sendKeys("SABIC, Sharq");
		
		driver.findElement(By.xpath("//li[@id='liUserPermissions']")).click();
		
		 WebElement drag=  driver.findElement(By.tagName("All User"));
		 WebElement drop=   driver.findElement(By.xpath("//div[@id=\"divuser2\"]//div[@ng-drop=\"true\"]"));
		 
		 Actions a=new Actions(driver);
		 a.dragAndDrop(drag, drop).perform();
	}

}
