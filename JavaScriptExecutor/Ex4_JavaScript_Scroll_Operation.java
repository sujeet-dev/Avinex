package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_JavaScript_Scroll_Operation {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/");
		 Thread.sleep(2000);
		 
		 WebElement element=driver.findElement(By.xpath("//a[text()='Last']"));
		 
		 JavascriptExecutor js= (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollTo(0, 1000)");
//		 js.executeScript("window.scrollBy(0, 1000)");
		 
//		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 
		 //Scroll Into view
		 
		 js.executeScript("arguments[0].scrollIntoView()", element);
		 js.executeScript("arguments[0].click()", element);
		 

	}

}
