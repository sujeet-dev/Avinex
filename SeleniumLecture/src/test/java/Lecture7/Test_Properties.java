package Lecture7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Properties {

	public static FileInputStream fis;
	public static Properties or=new Properties();
	public static Properties config=new Properties();
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		// OR Properties

		fis=new FileInputStream("./src/test/resources/Properties/OR");
		or.load(fis);

		System.out.println(or.getProperty("Username_name"));
		System.out.println(or.getProperty("Password_name"));

		// Config Properties

		fis=new FileInputStream("./src/test/resources/Properties/Config");
		config.load(fis);

		System.out.println(config.getProperty("testsiteurl"));

		// Execute Chrome

		if (config.getProperty("browser").equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		} else if (config.getProperty("browser").equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
		driver.get(config.getProperty("testsiteurl"));


		//SignUp

		driver.findElement(By.name(or.getProperty("Name_name"))).sendKeys("Sujeet");
		driver.findElement(By.name(or.getProperty("phn_name"))).sendKeys("9644440535");
		driver.findElement(By.name(or.getProperty("email_name"))).sendKeys("sujeetsingh194@gmail.com");

		WebElement dropdown= driver.findElement(By.name(or.getProperty("contry_name")));
		Select sc=new Select(dropdown);
		sc.selectByVisibleText("Hong Kong");

		WebElement city=driver.findElement(By.name(or.getProperty("city_name")));
		city.sendKeys("indore");


		Thread.sleep(2000);
		driver.findElement(RelativeLocator.with(By.name(or.getProperty("username_name"))).toRightOf(By.xpath(or.getProperty("rightof_xpath")))).sendKeys("jsdfhjkde");

		driver.findElement(RelativeLocator.with(By.name(or.getProperty("password_name"))).toRightOf(By.xpath(or.getProperty("rightof_xpath1")))).sendKeys("Sujeet@1994");

		//Sign In 

		//	  driver.findElement(By.linkText(or.getProperty("linktext"))).click();
		//	  
		//	  driver.switchTo().frame(0);
		//	  driver.findElement(By.name(or.getProperty("Username_xpath"))).sendKeys("sujeet@avinex.com");
		//	  driver.findElement(By.name(or.getProperty("Password_name"))).sendKeys("Singh@1994");

	}

}
