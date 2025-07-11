package Cat_check_App;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chart_View {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
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


		driver.findElement(By.xpath("//img[@class='marginleft10 showMenu']")).click();



		Thread.sleep(10);

		WebElement Feed= driver.findElement(By.xpath("//ul/li[7]/div/span[@class='ui-menu-icon ui-icon ui-icon-caret-1-e']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(Feed).perform();


		Thread.sleep(10);
		WebElement element= driver.findElement(By.xpath("/html/body/app-root/app-catcheck/app-um/div/app-submenu/div[1]/div[2]/span/ul/li[1]/span[1]/a/app-chartmenu/div[2]/ul/li[7]/ul/li[3]/div"));
		element.click();












	}

}
