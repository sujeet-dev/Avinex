package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import extentlisteners.ExtentListeners;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DbManager;
import utilities.ExcelReader;
import utilities.MonitoringMail;

public class BaseTest {
	
	
	/*
	 * WebDriver
	 * TestNG
	 * Properties OR , Config
	 * Log4j
	 * Extent Reports
	 * Screenshots
	 * Implicit vs ExplicitWaits
	 * Keywords
	 * JavaMail
	 * JDBC
	 * Excel Reading
	 * 
	 */
	
	public static WebDriver driver;
	public static Properties or = new Properties();
	public static Properties config = new Properties();
	public static Logger log = Logger.getLogger(BaseTest.class);
	public static ExcelReader excel = new ExcelReader("./src/test/resources/excel/testdata.xlsx");
	public static MonitoringMail mail = new MonitoringMail();
	public static WebDriverWait wait;
	public static FileInputStream fis;
	
	
	
	
	public void click(String locator) {

		try {
		if (locator.endsWith("_ID")) {

			driver.findElement(By.id(or.getProperty(locator))).click();
		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(or.getProperty(locator))).click();

		} else if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(or.getProperty(locator))).click();
		}

		log.info("Clicking on an Element : " + locator);
		ExtentListeners.test.info("Clicking on an Element : " + locator);
		}catch(Throwable t) {
			
			ExtentListeners.test.fail("Error while clicking on the Element: "+locator+" ERROR MESSAGE: "+t.getMessage());
			Assert.fail();
			
		}
	}

	
	
	
	public boolean isElementPresent(String locator) {

		try {
		if (locator.endsWith("_ID")) {

			driver.findElement(By.id(or.getProperty(locator)));
		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(or.getProperty(locator)));

		} else if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(or.getProperty(locator)));
		}

		log.info("Locating an Element : " + locator);
		ExtentListeners.test.info("Locating an Element : " + locator);
		return true;
		}catch(Throwable t) {
			
			ExtentListeners.test.fail("Error while Locating the Element: "+locator+" ERROR MESSAGE: "+t.getMessage());
			return false;
			
		}
	}
	
	
	
	
	public void type(String locator, String value) {

		try {
		if (locator.endsWith("_ID")) {

			driver.findElement(By.id(or.getProperty(locator))).sendKeys(value);
		} else if (locator.endsWith("_XPATH")) {
			driver.findElement(By.xpath(or.getProperty(locator))).sendKeys(value);

		} else if (locator.endsWith("_CSS")) {

			driver.findElement(By.cssSelector(or.getProperty(locator))).sendKeys(value);
		}
		log.info("Typing in an Element : " + locator + "  entered the value as : " + value);
		ExtentListeners.test.info("Typing in an Element : " + locator + "  entered the value as : " + value);
		}catch(Throwable t) {
			
			ExtentListeners.test.fail("Error while Typing in an Element: "+locator+" ERROR MESSAGE: "+t.getMessage());
			Assert.fail();
			
		}
	}

	
	
	
	@BeforeSuite
	public void setUp() {
		
		
		if(driver == null) {
			
			PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");
			
			
			log.info("Test Suite started !!!");
			
			
			try {
				fis = new FileInputStream("./src/test/resources/properties/OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				or.load(fis);
				log.info("OR Properties file loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			try {
				fis = new FileInputStream("./src/test/resources/properties/Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
				log.info("Config Properties file loaded !!!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(config.getProperty("browser").equals("chrome")) {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				log.info("Chrome browser launched !!!");
				
			}else if(config.getProperty("browser").equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				log.info("Firefox browser launched !!!");
				
			}
			
			driver.get(config.getProperty("testsiteurl"));
			log.info("Navigated to : "+config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait"))));
			wait = new WebDriverWait(driver,Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));
			try {
				DbManager.setMysqlDbConnection();
				log.info("DB Connection establisted !!!");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
		log.info("Test suite ended !!!");
		
	}
	
	
	
	

}
