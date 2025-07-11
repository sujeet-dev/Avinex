package Cat_check_App;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DHT_CycleInfo {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		options.addArguments("--window-size=1400,600");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");

		// Click on Unit monitering module


		driver.findElement(By.id("dvUMNonEOText")).click();
		driver.findElement(By.xpath("//input[@id='txtSearch']")).sendKeys("1316");
		driver.findElement(By.xpath("//tbody/tr[contains(@class,\"Searchlisttr ng-scope\")]/td/div[contains(@ng-keydown,\"key($event,this)\")]/div[@id=\"dvS1316\"]/div[1]/span[2]")).click();

		//Click config page
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='CYCLE CONFIG']")));
		System.out.println("Config is clickable");

		driver.findElement(By.xpath("//*[@id='img7']")).click();
		driver.findElement(By.xpath("//li[@id='ui-id-7']")).click();

		// generate window id

		Set<String> winids= driver.getWindowHandles();
		Iterator<String> iterate=  winids.iterator();
		String firstwin= iterate.next();

		//Move to 54
		driver.findElement(By.id("spChart")).click();

		winids=driver.getWindowHandles();
		iterate=  winids.iterator();

		System.out.println(iterate.next());
		String Secondwin= iterate.next();

		driver.switchTo().window(Secondwin);


		Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@title=\"Create New Cycle\"]")).click();
	

		//Create New Cycle | Cycle Infp\o

		driver.findElement(By.xpath("//input[@class='searchtextbox FieldLabel fontFamily ui-autocomplete-input'][@placeholder='Customer, Location, Unit']")).sendKeys("Valero, Port Arthur, GFU-243");
		driver.findElement(By.xpath("//*[@id=\"cc40body_786\"]/app-root/app-catcheck/app-um/div/div/div/div[2]/div/app-cycleinfo/div/form/table/tr[1]/td/div[2]/div/div/div[2]/div/div[2]/div/div[1]/input")).sendKeys("Valero");

		driver.findElement(By.id("txtSOR")).click();
                           
		Select s=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		s.selectByValue("2021");

		driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[2]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Select UOM
		driver.findElement(By.xpath("//label[normalize-space()='Metric']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='New']")).click();
		
		//Click on save button
		driver.findElement(By.id("btnSaveCycleInfo")).click();
	}

}
