package Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_OK {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Information Alert
		
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(5000);
//		Alert a=driver.switchTo().alert();
//		a.accept();
		
		
		//Confirmation Alert
		
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(5000);
//	Alert a=driver.switchTo().alert();
//	a.dismiss();
		
		
		// PrompBox Alert
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.sendKeys("Sujeet");
		a.accept();
	

	}

}
