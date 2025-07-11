package CatCheck;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Workflow_Info 
{
    @Test
	public void InfoPage() throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");

		// Click on Unit monitering module from CC30


		driver.findElement(By.id("dvUMNonEOText")).click();
		
		Set<String> winids= driver.getWindowHandles();
		Iterator<String> iterate=  winids.iterator();
		String firstwin= iterate.next();
		String secondwin= iterate.next();
		
		System.out.println(secondwin);
		
		driver.switchTo().window(secondwin);
		
		//Search cycle for DHT & click on it
		
		driver.findElement(By.xpath("//input[@id=\"txtSearch\"]")).sendKeys("14762");
		driver.findElement(By.xpath("//div[@class='searchtablecell']")).click();
		
		//Click on cycle info
		driver.findElement(By.xpath("//a[.='CYCLEINFO']")).click();
		
		Thread.sleep(3000);
		
		
		//create new cycle
		driver.findElement(By.xpath("//img[@title='Create New Cycle']")).click();
		System.out.println("button clickable");
		
		driver.findElement(By.xpath("//input[@name='txtSOR']")).click();
		Select s=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		s.selectByValue("2023");

		driver.findElement(By.xpath("(//td[@data-handler='selectDay'])[22]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
		//Select UOM
		driver.findElement(By.xpath("//label[normalize-space()='Metric']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='New']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtExpectedCycleLength']")).sendKeys("24");
		
		//Click on save button
				driver.findElement(By.id("btnSaveCycleInfo")).click();
				
				
				//Cycle config page
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				Select s1=new Select(driver.findElement(By.xpath("//select[@id='ddlAsLoaded']")));
//				s1.selectByValue("26435");
				
				driver.findElement(By.xpath("//select[@id='ddlAsLoaded']")).click();
				driver.findElement(By.xpath("//option[.=' Citgo, Corpus Christi, MDHT, 02-Jul-12 (Copy of Copy102 of MDH proposal May 2011 used \"As Loaded\") ']")).click();
		
				//Catayst type
				Select s2=new Select(driver.findElement(By.xpath("//select[@id='ddl_164']")));
				s2.selectByVisibleText(" Centinel ");
				
				//product sulpher
				Select s3=new Select(driver.findElement(By.xpath("//select[@id='ddl_165']")));
				s3.selectByVisibleText(" 10-50 ppm ");
				
				//Reactor outlet pressure
				Select s4=new Select(driver.findElement(By.xpath("//select[@id='ddl_254']")));
				s4.selectByVisibleText(" < 25 bar (< 360 psi) ");
				
				//feed distilation method
				Select s5=new Select(driver.findElement(By.xpath("//select[@id='ddl_188']")));
				s5.selectByVisibleText(" D1160 ");
				
				//Sor of run data
                 driver.findElement(By.xpath("//input[@title='SOR Day can not be greater than 100.']")).sendKeys("90");
                 
                 //stablized SOR WABT
                 driver.findElement(By.xpath("//tr/td[4]/input[contains(@style,'width: 62px;')]")).sendKeys("350");
                 
                 Thread.sleep(3000);
                 //Deatctivation Rate
                 driver.findElement(By.xpath("//*[@id=\"cc40body_786\"]/app-root/app-catcheck/app-um/div/div/div/div[2]/div/app-dhtcycleconfig/div[3]/div/div[10]/div/div/div[4]/div[2]/table/tr[1]/td[4]/input")).sendKeys("24");
                 
                 //H2 Consumption
                 driver.findElement(By.xpath("//*[@id=\"cc40body_786\"]/app-root/app-catcheck/app-um/div/div/div/div[2]/div/app-dhtcycleconfig/div[3]/div/div[10]/div/div/div[4]/div[2]/table/tr[1]/td[6]/input")).sendKeys("1.456");
                 
             
                 
                 //D86 Feed T90
                 driver.findElement(By.xpath("//*[@id=\"cc40body_786\"]/app-root/app-catcheck/app-um/div/div/div/div[2]/div/app-dhtcycleconfig/div[3]/div/div[10]/div/div/div[4]/div[2]/table/tr[1]/td[10]/input")).sendKeys("345");
                 
              
                 //Mode | Description
                 driver.findElement(By.xpath("//textarea[@id='txtModeDescription_1']")).sendKeys("Feed Case- 1 (Guarantee Case)");
                 
                 //Mode | feed density
                 driver.findElement(By.xpath("//input[@id='txtModeFeedDensity_1']")).sendKeys("563.4");
                 
                 //Mode | feed sulpher
                 driver.findElement(By.xpath("//input[@id='txtModeFeedSulphur_1']")).sendKeys("1.556");
                 
                 //Product Sulpher
                 driver.findElement(By.xpath("//input[contains(@id,'txtModeProductSulphur_1')]")).sendKeys("0.263");
                 
                 //WaBT
                 driver.findElement(By.xpath("//input[@id='txtModeWABT_1']")).sendKeys("256");
                 
                 //HDS Reaction order
                 driver.findElement(By.xpath("//input[@id='txtModeHDSReactionOrder_1']")).sendKeys("2.3");
                 
                 //Treat Gas H2 purity
                 driver.findElement(By.xpath("//input[@id='txtModeTreatGasH2Purity_1']")).sendKeys("88");
                 
                 //Total Treat gas Ratio
                 driver.findElement(By.xpath("//input[@id='txtModeTotalTreatGasRatio_1']")).sendKeys("200");
                 
                 //Reactor Outlet Pressure
                 driver.findElement(By.xpath("//input[@id='txtModeRxOutletPressure_1']")).sendKeys("56.32");
                 
                 //Feed Nitrogen
                 driver.findElement(By.xpath("//input[@id='txtModeFeedNitrogen_1']")).sendKeys("1056");
                 
                 //Product Nitrogen
                 driver.findElement(By.xpath("//input[@id='txtModeProductNitrogen_1']")).sendKeys("23");
                 
                 //Makeup gas rate
                 driver.findElement(By.xpath("//input[@id='txtModeMakeUpGasRate_1']")).sendKeys("23");
                 
                 //Feed rate
                 driver.findElement(By.xpath("//input[@id='txtModeFeedRate_1']")).sendKeys("56");
                 
                 //D86 Feed T90
                 driver.findElement(By.xpath("//input[@id='txtModeOtherFeedT90_1']")).sendKeys("356");
                 
                 //D86 Feed T95
                 driver.findElement(By.xpath("//input[@id='txtModeOtherFeedT95_1']")).sendKeys("235");
                 
                 //D86 Feed TT10
                 driver.findElement(By.xpath("//input[@id='txtModeD86FeedT10_1']")).sendKeys("175");
                 
                 //D86 Feed T30
                 driver.findElement(By.xpath("//input[@id='txtModeD86FeedT30_1']")).sendKeys("256");
                 
                 //D86 Feed T50
                 driver.findElement(By.xpath("//input[@id='txtModeD86FeedT50_1']")).sendKeys("255");
                 
                 //D86 Feed T70
                 driver.findElement(By.xpath("//input[@id='txtModeD86FeedT70_1']")).sendKeys("310");
                 
                 //Feed Metals
                 driver.findElement(By.xpath("//input[@id='txtModeFeedMetals_1']")).sendKeys("106");
                 
                 
				

	}
    

}
