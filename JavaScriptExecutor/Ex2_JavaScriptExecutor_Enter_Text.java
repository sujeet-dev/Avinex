package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_JavaScriptExecutor_Enter_Text {

	public static void main(String[] args) 
	{
		// Enter Text into Textbox by using Javascript executor
		
				// enter the text in textbox in selenium webdriver using SendKeys method
				// driver.findelement(By.id("Username")).sendkeys("");
				
				// But through JavaScript we have 2 option for enter the text into TextBox
				// 1. Findelelment(JavaScript) + Text (JavaScript)
				// 2. FindElelment(Webdriver) + Text (JavaScript)
				
				// 1. Finding the element through JavaScript
				// a. Go to the Console (Click on F12)
				// b. And write :- document.getElementById("email");  ==> You can use Name, className any other locators
				// after that hit the enter button
				// Then we will get the element
				// <input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" 
		        // placeholder="Email address or phone number" value="" autofocus="1" autocomplete="username" aria-label="Email address or phone number">
				
				// If you finding the element through javascript then showing the "Node" then we will mention the the Index
				// document.getElementById("email")[0];
				
				// If you finding the element through "Xpath" then we will use the Syntax;
				// document.evaluate(xpathExpression, contextNode, namespaceResolver, resultType, result)
				// document.evaluate("//input[@id="email"]", document, null, 
				
				
				// to mention tvalue into the textbox
				// document.getElementById("email").value="abcdef@gmail.com";
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/login/");
				
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("document.getElementById('email').value='abcdef@gmail.com'");
				
				
				// 2nd ways
				// :- FindElement(Webdriver) + Text (JavaScript)
				
//				WebDriver driver=new ChromeDriver();
//				driver.manage().window().maximize();
//				driver.get("https://www.facebook.com/login/");
//				
//				WebElement element= driver.findElement(By.id("email"));
//				
//				JavascriptExecutor js= (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].value='abcdef@gmail.com'", element);

	}

}
