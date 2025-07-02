package CatCheck_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElements {

	public static void main(String[] args) throws InterruptedException {
//	WebDriver driver=	WebDriverManager.chromedriver().create();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gh-ac")).sendKeys("Selenium");
		Select s=new Select(driver.findElement(By.id("gh-cat")));
		s.selectByValue("267");
//		driver.findElement(By.id("gh-ac")).sendKeys("Selenium");
		driver.findElement(By.id("gh-btn")).click();
		
		driver.close();

	}

}
