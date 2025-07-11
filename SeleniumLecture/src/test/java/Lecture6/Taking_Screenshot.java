package Lecture6;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Taking_Screenshot {
	
	public static WebDriver driver;
	
	java.util.Date d=new java.util.Date();
      String file = d.toString().replace(":", "_").replace(" ", "_");
	
	public static void capturescreenshot() {
		File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileUtils.copyFile(screenshot, new File("./screenshot.error1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://weteams.io/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
//		  Case 1
		  
//		  If the write like:- chromedriver driver=new chromedriver();
		  //  then No need to casting  ((Takescreenshot).driver)
		  
		  // this 2 line of code we can use for taking screenshot
		  
//	File screenshot=driver.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(screenshot, new File("./screenshot.error1.jpg"));
	
		  
		  
	      // Case 2
	      // If we write like:- webdriver driver=new chromedriver();
	      // thwn we need Casting like ((Takescreenshot).driver)
	
	
//		  File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
//		  FileUtils.copyFile(screenshot, new File("./screenshot.error1.jpg"));
		  
		  
		  
		  // Case 3
		  // If we write this 2 line of code everytime for taking the screenshot
		  // for to save the time then we make the utility.
		  // public static void capturescreenshot(){
//		  File screenshot=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
//		  FileUtils.copyFile(screenshot, new File("./screenshot.error1.jpg"));
//		  }
	
           capturescreenshot();
	}

}
