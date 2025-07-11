package Practice_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	public static void main(String[] args) throws InterruptedException 
	{
		//open the Weteams.io
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://weteams.ai");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on sign in button
		driver.findElement(By.xpath("//a[@class='theme-transparent-btn d-inline-block for-desktop']")).click();
		
		//move the cursor to second tab
		 Set<String> winids= driver.getWindowHandles();
		 Iterator<String> iterate= winids.iterator();
		String firstwindow= iterate.next();
		String secondwindow= iterate.next();
		
		System.out.println(" Second win is : " + secondwindow);
		
		driver.switchTo().window(secondwindow);
		
		String orgemail="sujeetsingh194@gmail.com";
		
		 WebElement orginalval=  driver.findElement(By.name("email"));
		 orginalval.sendKeys(orgemail);
	
		
		
		//Reverse the email value
		
		StringBuffer bf=new StringBuffer(orgemail);
	    String rev=	bf.reverse().toString();
		
		System.out.println(rev);
		
		orginalval.sendKeys(rev);
		
		
		
		
		
		
	}

}
