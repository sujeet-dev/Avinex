package CatCheck;

import java.io.File;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DHT_WorkFlow_Extentreport 
{
	
	public ExtentSparkReporter htmlReporter; //Creating HTML File
	public ExtentReports extent; //Add Configuration, System Config, Creating Test Cases
	public ExtentTest test; // Maintain the test cases, Add log, Pass, Fail, Skip
	
	
	@BeforeTest
	public void SetUpReport() {
		htmlReporter=new ExtentSparkReporter("./reports/extent.html");

		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("DHT Cycle Config");
		htmlReporter.config().setReportName("Cycle Test Result");
		htmlReporter.config().setTheme(Theme.STANDARD);



		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Sujeet Singh");
		extent.setSystemInfo("build No", "DHT-01");
		extent.setSystemInfo("Organisation", "Avinex Software");
	}
	
	@BeforeMethod
	public void beforeTest(ITestResult result) 
	{
	  String testcaseName=	result.getMethod().getMethodName();
		test=extent.createTest(testcaseName);
		
	}
	
	@Test
	public void Workflow() 
	{
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Increased wait time

	        try {
	            driver.manage().window().maximize();
	            driver.get("http://10.2.10.7/CC30/Cat-Check/Home.aspx");

	            // Wait for body to ensure page load
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

	            // Run AutoIT login script (ensure this is truly synchronous)
	            Runtime.getRuntime().exec("E:\\AutoIT\\Login.exe");
	            Thread.sleep(3000); // Give AutoIT time to finish, adjust as needed

	            // Click on Unit monitoring module from CC30
	            waitAndClickById(driver, wait, "dvUMNonEOText");

	            // Switch to newly opened window
	            switchToSecondWindow(driver);

	            
	           
	            // Wait for the search input to be interactable
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtSearch']", "14762");
	            waitAndClickByXpath(driver, wait, "//div[@class='searchtablecell']");

	            // Click on cycle info
	            waitAndClickByXpath(driver, wait, "//a[.='CYCLEINFO']");

	            // Create new cycle
	            Thread.sleep(3000);
	            waitAndClickByXpath(driver, wait, "//img[@title='Create New Cycle']");
	            waitAndClickByXpath(driver, wait, "//input[@name='txtSOR']");

	            // Select year in date picker
	            Select yearSelect = new Select(wait.until(
	                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='ui-datepicker-year']"))));
	            yearSelect.selectByValue("2024");
	            waitAndClickByXpath(driver, wait, "(//td[@data-handler='selectDay'])[25]");

	            // Select UOM
	            waitAndClickByXpath(driver, wait, "//label[normalize-space()='Metric']");

	            // Wait for 'New' label to be visible and clickable (fix for your error)
//	            waitForLoaderToDisappear(driver, wait);
	            
	           Thread.sleep(3000);
//	           driver.findElement(By.xpath("//label[normalize-space()='New']")).click();
	            waitAndClickByXpath(driver, wait, "//label[.='New']");

	            // Expected Cycle Length
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtExpectedCycleLength']", "24");
	            waitAndClickById(driver, wait, "btnSaveCycleInfo");

	            // Cycle config page - select AsLoaded
	            waitAndClickByXpath(driver, wait, "//select[@id='ddlAsLoaded']");
	            waitAndClickByXpath(driver, wait, "//option[contains(text(), 'Citgo, Corpus Christi')]");

	            // Catalyst type
	            selectByVisibleText(wait, "//select[@id='ddl_164']", " Centinel ");
	            selectByVisibleText(wait, "//select[@id='ddl_165']", " 10-50 ppm ");
	            selectByVisibleText(wait, "//select[@id='ddl_254']", " < 25 bar (< 360 psi) ");
	            selectByVisibleText(wait, "//select[@id='ddl_188']", " D1160 ");

	            // SOR of run data
	            waitAndSendKeysByXpath(driver, wait, "//input[@title='SOR Day can not be greater than 100.']", "90");
	            waitAndSendKeysByXpath(driver, wait, "//tr/td[4]/input[contains(@style,'width: 62px;')]", "350");

	            // Deactivation Rate
	            waitAndSendKeysByXpath(driver, wait, "//*[@id='cc40body_786']//table/tr[1]/td[4]/input", "24");

	            // H2 Consumption
	            waitAndSendKeysByXpath(driver, wait, "//*[@id='cc40body_786']//table/tr[1]/td[6]/input", "1.456");

	            // D86 Feed T90
	            waitAndSendKeysByXpath(driver, wait, "//*[@id='cc40body_786']//table/tr[1]/td[10]/input", "345");

	            // Mode data input
	            waitAndSendKeysByXpath(driver, wait, "//textarea[@id='txtModeDescription_1']", "Feed Case- 1 (Guarantee Case)");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeFeedDensity_1']", "563.4");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeFeedSulphur_1']", "1.556");
	            waitAndSendKeysByXpath(driver, wait, "//input[contains(@id,'txtModeProductSulphur_1')]", "0.263");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeWABT_1']", "256");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeHDSReactionOrder_1']", "2.3");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeTreatGasH2Purity_1']", "88");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeTotalTreatGasRatio_1']", "200");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeRxOutletPressure_1']", "56.32");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeFeedNitrogen_1']", "1056");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeProductNitrogen_1']", "23");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeMakeUpGasRate_1']", "23");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeFeedRate_1']", "56");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeOtherFeedT90_1']", "356");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeOtherFeedT95_1']", "235");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeD86FeedT10_1']", "175");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeD86FeedT30_1']", "256");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeD86FeedT50_1']", "255");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeD86FeedT70_1']", "310");
	            waitAndSendKeysByXpath(driver, wait, "//input[@id='txtModeFeedMetals_1']", "106");
	            
	            
//	            Thread.sleep(3000);
//	            driver.findElement(By.xpath("//img[@class='img btnPosSave']")).click();

	        } catch (Exception e) {
	            e.printStackTrace();
	            takeScreenshot(driver, "selenium_error.png");
	        } 
//	        finally {
//	            driver.quit();
//	        }
	        
	       
	    }
	
	 @AfterMethod
	    public void UpdateResult(ITestResult result) {
	    	
	    	 String testcaseName= result.getMethod().getMethodName();
	    	
	    	
			if (result.getStatus()==ITestResult.FAILURE) {
				
				test.fail("fail the test case : " + testcaseName);
			}else if (result.getStatus()==ITestResult.SUCCESS) {
				
				test.pass("Pass the test case : " + testcaseName);
			}else if (result.getStatus()==ITestResult.SKIP) {
				test.skip("Skip the test case : " + testcaseName);
				
			}
		}
	
	@AfterTest
	public void EndSetup() 
	{
		extent.flush();
		
	}

	    private static void waitAndClickById(WebDriver driver, WebDriverWait wait, String id) {
	        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	        scrollIntoView(driver, el);
	        el.click();
	    }

	    private static void waitAndClickByXpath(WebDriver driver, WebDriverWait wait, String xpath) {
	        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	        wait.until(ExpectedConditions.elementToBeClickable(el));
	        scrollIntoView(driver, el);
	        el.click();
	    }

	    private static void waitAndSendKeysByXpath(WebDriver driver, WebDriverWait wait, String xpath, String value) {
	        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	        wait.until(ExpectedConditions.elementToBeClickable(el));
	        scrollIntoView(driver, el);
	        try {
	            el.clear();
	        } catch (InvalidElementStateException ignored) { }
	        el.sendKeys(value);
	    }

	    private static void selectByVisibleText(WebDriverWait wait, String selectXpath, String text) {
	        WebElement selectEl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectXpath)));
	        Select select = new Select(selectEl);
	        select.selectByVisibleText(text);
	    }

	    private static void switchToSecondWindow(WebDriver driver) {
	        Set<String> winIds = driver.getWindowHandles();
	        Iterator<String> it = winIds.iterator();
	        String firstWin = it.next();
	        String secondWin = it.next();
	        driver.switchTo().window(secondWin);
	    }

	    private static void scrollIntoView(WebDriver driver, WebElement el) {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", el);
	    }

	    // Wait for a loader overlay to disappear, if one is present. Adjust selector as needed for your app.
	    private static void waitForLoaderToDisappear(WebDriver driver, WebDriverWait wait) {
	        try {
	            // Common loader selectors, adjust as necessary!
	            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader, .spinner, .loading")));
	        } catch (Exception ignored) {}
	    }

	    private static void takeScreenshot(WebDriver driver, String filename) {
	        try {
	            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	            java.nio.file.Files.copy(scrFile.toPath(), new File(filename).toPath(), StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("Screenshot saved: " + filename);
	        } catch (Exception e) {
	            System.out.println("Failed to take screenshot: " + e);
	        }
 
		
	}

}
