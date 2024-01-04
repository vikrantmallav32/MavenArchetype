package webscenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class FacebookRegistrationpage extends Utility
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//url opened
		driver.get("https://www.facebook.com/");;
		
		//find the element of create account button and clicked
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		//input to all text box
		
	//first name
		WebElement firstname=driver.findElement(By.name("firstname"));
		Utility.textbox(firstname, "firstname", "Vikrant");    //First name
		
		//last name
		WebElement lastname=driver.findElement(By.name("lastname"));
		Utility.textbox(lastname, "lastname", "Mallav");   //Last name
		
		//email
		WebElement email=driver.findElement(By.name("reg_email__"));
		Utility.textbox(email, "Email", "vmallav591@gmail.com");  //Email
		
		//email confirmation
		WebElement emailcnfr=driver.findElement(By.name("reg_email_confirmation__"));
		Utility.textbox(emailcnfr,"Email Confirmation","vmallav591@gmail.com");//re-confirm email
		
		//password
		WebElement password=driver.findElement(By.name("password"));
		Utility.textbox(password, "Password", "Vikrant@123");   //password
		
		//selecting day	
		WebElement dayele=driver.findElement(By.id("day"));
		Utility.selecttypedropdown(dayele, "15");
		
		//selecting month
		WebElement monele=driver.findElement(By.id("month"));
		Utility.selecttypedropdown(monele, "May");
		
		//selecting year
		WebElement yrele=driver.findElement(By.id("year"));
		Utility.selecttypedropdown(yrele, "1990");
		
		//Gender Selection
		driver.findElement(By.xpath("//div[@class='mt m _5wa2 _5dbb']//span[@class='_5k_3']//span[@class='_5k_2 _5dba']//input[@class='_8esa' and @value='2']")).click();
		
		//sign up button
		driver.findElement(By.name("websubmit")).click();
		
		driver.quit();
	}

}
