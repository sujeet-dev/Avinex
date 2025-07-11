package Lecture7;

import java.security.Security;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Bad_SSL_Issue {

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		
		devTools.send(org.openqa.selenium.devtools.v132.security.Security.enable());
		devTools.send(org.openqa.selenium.devtools.v132.security.Security.setIgnoreCertificateErrors(true));

	  
	  
	  driver.manage().window().maximize();
	  driver.get("https://expired.badssl.com");

	}

}
