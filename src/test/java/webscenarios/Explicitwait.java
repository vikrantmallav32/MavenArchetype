package webscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Explicitwait extends Utility
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//locator
		
		By usrnm=By.name("username");
		By pass=By.name("password");
		By btn=By.xpath("//button[@type=\"submit\"]");
		
		WebElement usr=Utility.waitForPresenceOfElement(driver, usrnm);
		usr.sendKeys("Vikrant@gmail.com");
		
		WebElement psw=Utility.waitForPresenceOfElement(driver, pass);
		psw.sendKeys("Vikrant123");
		
		WebElement btns=Utility.waitForElementClickable(driver, btn);
		btns.click();
		
			
		driver.quit();

	}

}
