package CustomerService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	private WebDriver driver;
	
	//initialize
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private @FindBy(id="SignIn")
			WebElement signbtn;
	private @FindBy(id="email-id")
			WebElement un;
	private @FindBy(id="password")
			WebElement psw;
	private @FindBy(id="remember")
			WebElement rmbr;
	private @FindBy(id="submit-id")
			WebElement loginbtn;
	
	
	//Actions
	public String geturl()
	{
		return driver.getCurrentUrl();
	}
	
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public void login(String username, String password)
	{
		signbtn.click();
		un.sendKeys(username);
		psw.sendKeys(password);
		rmbr.click();
		loginbtn.click();
	}

}
