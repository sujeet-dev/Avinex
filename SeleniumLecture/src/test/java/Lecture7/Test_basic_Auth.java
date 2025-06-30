package Lecture7;

import java.time.Duration;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_basic_Auth {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		   
		   ((HasAuthentication) driver).register(UsernameAndPassword.of("vpc", "vpc"));
		   
		   driver.manage().window().maximize();
		   driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		   Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");

	}

}
