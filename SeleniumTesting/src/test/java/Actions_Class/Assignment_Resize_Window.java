package Actions_Class;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Resize_Window {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
	WebElement resize=	(WebElement) driver.manage().window();
	Actions size=new Actions(driver);
	size.dragAndDropBy(resize, 300, 100).perform();;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

	}

}
