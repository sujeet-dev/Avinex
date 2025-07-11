package CatCheck_Demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Planned_reports {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		  
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");
		  
		  Thread.sleep(1000);
		  
		  driver.findElement(By.id("dvUMNonEOText")).click();
		  
		  driver.findElement(By.cssSelector(".TopButtonLink.selectedtoptab")).click();
		  driver.findElement(By.cssSelector("div[class='rightnoclass']>div>app-reports>span>ul>li>a>div\r\n")).click();

	}

}
