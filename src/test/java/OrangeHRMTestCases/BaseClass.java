package OrangeHRMTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import OrangeHRMPages.LoginPage;

public class BaseClass 
{
	WebDriver driver;
	LoginPage lp;
	
	@BeforeClass
	public void driversession()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=PageFactory.initElements(driver,LoginPage.class);
		
	}
	
	
	
	
	

}
