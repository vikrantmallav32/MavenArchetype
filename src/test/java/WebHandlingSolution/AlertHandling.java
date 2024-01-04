package WebHandlingSolution;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class AlertHandling {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//locators
		By alert=By.xpath("//button[@onclick=\"jsAlert()\"]");
		By confrm=By.xpath("//button[@onclick=\"jsConfirm()\"]");
		By prmpt=By.xpath("//button[@onclick=\"jsPrompt()\"]");
		By result=By.id("result");
		
		
		driver.findElement(alert).click();
		Utility.Alertaccept(driver);
		System.out.println("Result:-"+driver.findElement(result).getText());
		
		driver.findElement(confrm).click();
		Utility.AlertOKConfirm(driver, "cancel");
		System.out.println("Result:-"+driver.findElement(result).getText());
		
		
		driver.findElement(prmpt).click();
		Utility.Alertprompted(driver, "cancel", null);
		System.out.println("Result:-"+driver.findElement(result).getText());

	}
}
