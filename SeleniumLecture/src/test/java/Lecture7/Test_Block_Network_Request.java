package Lecture7;

import java.io.OptionalDataException;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v132.network.Network;

import com.google.common.collect.ImmutableList;


import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.description.annotation.AnnotationList.Empty;

public class Test_Block_Network_Request {

	public static void main(String[] args) 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  DevTools devtool=((ChromeDriver) driver).getDevTools();
	  devtool.createSession();
	  
//	  devtool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
	  devtool.send(Network.setBlockedURLs(ImmutableList.of("*.jpg", "*.jpeg", "*.png")));
	  driver.manage().window().maximize();
	  driver.get("https://makemytrip.com");

	}

}
