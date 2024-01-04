package WebHandlingSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class JavascriptExecutor {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//to create alert on amazon web application
		Utility.AddingAlert(driver, "alert('I am a Added Java Script Alert')");
		Thread.sleep(2000);
		
		//alert Handling
		Utility.Alertaccept(driver);
		
		Thread.sleep(2000);
		
		//Scroll down the page
		Utility.scrollDown(driver);
		
		Thread.sleep(2000);
		
		//Scroll up the page
		Utility.scrollUp(driver);
		
		Thread.sleep(2000);
		
		//Scroll to element
		WebElement ele=driver.findElement(By.xpath("//ul//li//a[@class=\"a-link-normal\"]//img[@alt=\"Indiana Jones and the Dial of Destiny [4K UHD]\"]"));
		Utility.scrollToElement(driver, ele);
		
		
		
		
		

	}

}
