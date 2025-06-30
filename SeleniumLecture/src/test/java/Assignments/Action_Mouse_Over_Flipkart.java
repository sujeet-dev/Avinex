package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Mouse_Over_Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		// Go to flipkart,com, click mobile case using mouse over action,&check the particular title is correct and take screenshot :
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement electronics=driver.findElement(By.xpath(".//*[text()='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(electronics).perform();
		
		Thread.sleep(5000);
		
//	WebElement MobileAcces= driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/div/object/a[@class='_1BJVlg _11MZbx']"));
	WebElement MobileAcces= driver.findElement(By.xpath("/html/body/div[4]/div[1]/object/a[9]"));
                 new Actions(driver).moveToElement(MobileAcces).perform();
                 System.out.println("Mobile Accessories");
                 
                 
                 Thread.sleep(3000);
                 driver.findElement(By.xpath("//div[@class='_1UgUYI _2eN8ye']/div[2]/object/a[3]")).click();
                 
               String url=  driver.getCurrentUrl();
               System.out.println(url);
               
               if (url.equals("https://www.flipkart.com/mobile-accessories/cases-and-covers/designer-cases-covers/pr?sid=tyy,4mr,q2u,qgl&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_6d8ea12f-7625-42ac-9656-a73f00026d23_1_372UD5BXDFYS_MC.Y7DAA3WHIX67&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Electronics~MobileAccessory~Designer%2BCases_Y7DAA3WHIX67&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L2_view-all&cid=Y7DAA3WHIX67")) {
				
            	   System.out.println("You are in mobile case page");
			} else {
				System.out.println("You are not in case page");

			}
	}

}
