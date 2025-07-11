package Practice_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_Dropdown_List {

	public static void main(String[] args) 
	{
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.wikipedia.org/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   // Select the list from dropdown
	   WebElement dd=driver.findElement(By.id("searchLanguage"));
	   Select sc=new Select(dd);
	   sc.selectByVisibleText("Deutsch");
	   
	   // I want need all the links in web
	   
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println(links.size());
	    for (WebElement link : links) 
	    {
	    	System.out.println(link.getText() + " URL is : " + link.getAttribute("href"));
			
		}
	    
	    // How many list in the dropdown
	    List<WebElement> li= driver.findElements(By.tagName("option"));
	    System.out.println(li.size());
	    System.out.println(li.get(0).getText());
	    System.out.println(li.get(0).getAttribute("lang"));
	    
	    
        for (WebElement list : li) 
        {
        	System.out.println(list.getText());
			
		}
	   
	   

	}

}
