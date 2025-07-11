package Cat_Demo;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase_1 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver=new ChromeDriver();

		driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");

		Thread.sleep(1000);

		driver.findElement(By.id("dvUMNonEOText")).click();
		driver.findElement(By.id("txtSearch")).sendKeys("fcc, shell 1-aug");
		driver.findElement(By.xpath("//*[@id=\'divAdvanceSearch\']/table/tbody/tr[1]/td/div[2]/span/a/img")).click();

		//		  Select s=new Select(driver.findElement(By.id("txtCLUName")));

		driver.findElement(By.id("txtCLUName")).sendKeys("Shell, Deer Park Refinery, GOHT");
		//		 driver.findElement(By.className("fontFamily FieldLabel")).sendKeys("Shell");
		//		  driver.findElement(By.xpath("//font[normalize-space()='Deer Park Refinery,']")).click();

		driver.findElement(By.id("txtSOR")).click();

		Select s=new Select(driver.findElement(By.className("ui-datepicker-year")));
		s.selectByValue("2021");

		Select s1=new Select(driver.findElement(By.className("ui-datepicker-month")));
		s1.selectByVisibleText("Sep");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/table/tbody/tr[1]/td[2]")).click();

		driver.findElement(By.id("txtTechFocalPoint")).sendKeys("Balram K");
		driver.findElement(By.id("txtReportFocalPoint")).sendKeys("CatCheck Support");
		driver.findElement(By.id("txtSalesFocalPoint")).sendKeys("CatCheck Support");

		driver.findElement(By.xpath("//*[@id=\"spnCSISMode\"]/label")).click();

		Select app=new Select(driver.findElement(By.id("ddlApplication")));
		app.selectByValue("4");

		Select Region=new Select(driver.findElement(By.id("ddlSIS")));
		Region.selectByValue("222");

	}

}
