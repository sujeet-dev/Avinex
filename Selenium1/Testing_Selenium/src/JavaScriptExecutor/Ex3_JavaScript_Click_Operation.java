package JavaScriptExecutor;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_JavaScript_Click_Operation {

	public static void main(String[] args) throws InterruptedException
	{
		// Perform "Click" operation Using JavaScript Executor in Selenium Webdriver
		
				// In selenium we have to perform "Click"operation like:- driver.findelemt(By.id("")).click();
				
				// Here is the two ways
				// 1. FindElement(JavaScript) + Click (JavaScript) 
				// 2. FindElement(Webdriver) + Click (JavaScript)
				
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
				
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("document.getElementById('femalerb').click()");
				
				js.executeScript("window.scrollTo(0, 1000)");
				
				List checkboxes=  (List) js.executeScript("return document.getElementsByName('language')");
				
				for (Object object : checkboxes) 
				{
					js.executeScript("arguments[0].click()", object);
					
				}
				
				
				js.executeScript("document.getElementById('registerbtn').click()");
				
				Thread.sleep(5000);
				
				WebElement element=  driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']"));
				js.executeScript("arguments[0].click()", element);


	}

}
