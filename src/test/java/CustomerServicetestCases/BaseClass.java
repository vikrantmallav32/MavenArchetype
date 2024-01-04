package CustomerServicetestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;


import CustomerService.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/index.html");
		lp=PageFactory.initElements(driver, LoginPage.class);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	

}
