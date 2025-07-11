package Practice_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@rel='noopener noreferrer']")));
		a.click().perform();

		Set<String> winids= driver.getWindowHandles();
		Iterator<String>iterate= winids.iterator();
		String firstwin= iterate.next();
		String secwin=iterate.next();
		
		

		System.out.println(firstwin);
		System.out.println(secwin);
		

		driver.switchTo().window(secwin);

		driver.findElement(By.linkText("Sign In")).click();
		
		System.out.println("2nd win click");

		driver.switchTo().window(firstwin);
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span")).click();
		
		System.out.println("First window click");
		
		driver.switchTo().window(secwin);
//		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div/div[2]/div/div[2]/div[2]/div[1]/div/button/span")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='sc-b5fbabe8-0 fcSvwq']")).click();
		System.out.println("Contaxt link is clickable");
		
//		driver.findElement(By.xpath("//a[@class='sc-b5fbabe8-0 cYgynw']")).click();
		
		
		
		
	}

}
