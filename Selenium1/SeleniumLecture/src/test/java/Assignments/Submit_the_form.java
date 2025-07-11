package Assignments;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submit_the_form {

	public static void main(String[] args) throws InterruptedException 
	{
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 
	 WebElement name=driver.findElement(By.name("name"));
	 name.sendKeys("Sujeet");
	 
	 WebElement phnNumber=driver.findElement(By.name("phone"));
	 phnNumber.sendKeys("9644440535");
	 
	 WebElement email=driver.findElement(By.name("email"));
	 email.sendKeys("sujeet@avinex.in");
	 
	 WebElement dropdown= driver.findElement(By.name("country"));
	 Select sc=new Select(dropdown);
	 sc.selectByVisibleText("Hong Kong");
	 
	 WebElement city=driver.findElement(By.name("city"));
	 city.sendKeys("indore");
	 
	 Thread.sleep(2000);
//	 WebElement user=driver.findElement(By.name("username"));
//	 user.sendKeys("sujeet");
//		JavascriptExecutor js= (JavascriptExecutor) driver;
		
//		js.executeScript("arguments[0].value='SujeetSingh'", user);
	 
//	 JavascriptExecutor js= (JavascriptExecutor)driver;
//	 js.executeScript("document.getElementsByName(\"username\").value='SujeetSingh'");
//		System.out.println("User Name");
	 
//	 WebElement user=driver.findElement(By.name("username"));
//	 Actions a=new Actions(driver);
//	 a.moveToElement(user).click().perform();
//	 a.sendKeys("Sujeet");
	 
	 WebElement Rightof = driver.findElement(RelativeLocator.with(By.name("username")).toRightOf(By.tagName("label")));
		Rightof.sendKeys("jhasdj");
		
		 WebElement password = driver.findElement(RelativeLocator.with(By.name("password")).toRightOf(By.tagName("label")));
			password.sendKeys("Singh@1994");
	 
//	 WebElement pass=driver.findElement(By.name("password"));
//		JavascriptExecutor js1= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='Singh@1994'", pass);
//		System.out.println("Password");
		
		
//		driver.findElement(By.className("button"));
	 
	 
	java.util.List<WebElement> links= driver.findElements(By.tagName("option"));
	
	System.out.println(links.size());
	
	for (WebElement lin : links) {
		
		System.out.println(lin.getText());
		
	}
	 
	}

}
