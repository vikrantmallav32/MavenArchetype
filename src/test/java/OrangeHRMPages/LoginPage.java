package OrangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	private WebDriver driver;
	//Initialization
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private @FindBy(name="username")WebElement un;
	private @FindBy(name="password")WebElement password;
	private @FindBy(xpath="//button[@type='submit']")WebElement btn;
	
	
	//Actions
	public String Url()
	{
		return driver.getCurrentUrl();
	}
	
	public String title()
	{
		return driver.getTitle();
	}
	
	
	public void login(String Username, String Password)
	{
		un.sendKeys(Username);
		password.sendKeys(Password);
		btn.click();
	}
}
