package Cat_check_App;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chart_View1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");

		//Click on Unit Monitering CC30
		driver.findElement(By.id("dvUMNonEOText")).click();

		//Move to the new Tab
		Set<String> winids= driver.getWindowHandles();
		Iterator<String> iterate=  winids.iterator();
		String firstwin= iterate.next();
		String secwin=iterate.next();

		System.out.println(firstwin);
		System.out.println(secwin);

		driver.switchTo().window(secwin);

		// Search the CycleID
		driver.findElement(By.xpath("//input[@id=\"txtSearch\"]")).sendKeys("14762");

		driver.findElement(By.xpath("//div[@class='searchtablecell']")).click();


		//Click on Cycle Config
		driver.findElement(By.xpath("//li/span/a[@class='anchor'][@routerlinkactive='selectedsubmenutab']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

         Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='marginleft10 showMenu']")).click();
		//Click on keychart
//		WebElement obj = driver.findElement(By.xpath("/html/body/app-root/app-catcheck/app-um/div/app-submenu/div[1]/div[2]/span/ul/li[1]/span[1]/a/app-chartmenu/div[2]/ul/li[4]/div"));
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-catcheck/app-um/div/app-submenu/div[1]/div[2]/span/ul/li[1]/span[1]/a/app-chartmenu/div[2]/ul/li[4]/div")).click();
		
		try {
		    // Switch to the alert and dismiss it
		    Alert alert = driver.switchTo().alert();
		    // Check if the alert is present and dismiss it
		    alert.dismiss();
		} catch (NoAlertPresentException e) {
		    // If no alert is present, handle accordingly
		    System.out.println("No alert present.");
		}
		
		// Search Product Quality
		Thread.sleep(2000);
		driver.findElement(By.id("txtSearchChart")).sendKeys("Product Quality");
		driver.findElement(By.xpath("/html/body/app-root/app-catcheck/app-um/div/div/div/div[2]/div/app-charts/div[1]/table/tr/td/div/div/div[1]/div/span[2]/img[1]")).click();
		System.out.println("Product Quality");


        // Search Cycle Progression
		Thread.sleep(2000);
		driver.findElement(By.id("txtSearchChart")).sendKeys("Cycle Progression");
		driver.findElement(By.xpath("/html/body/app-root/app-catcheck/app-um/div/div/div/div[2]/div/app-charts/div[1]/table/tr/td/div/div/div[1]/div/span[2]/img[1]")).click();
	     System.out.println("Cycle Progression");


	}

}
