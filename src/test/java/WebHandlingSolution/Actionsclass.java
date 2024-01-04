package WebHandlingSolution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Actionsclass {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Rbtn=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		Utility.rightclick(driver, Rbtn);
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul//li//span"));
		Utility.bootstrapdropdown(list1, "Paste");
		
		Utility.Alertaccept(driver);
		
		WebElement dbtn=driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		Utility.doubleclick(driver, dbtn);
		
		Utility.Alertaccept(driver);
		
		

	}

}
