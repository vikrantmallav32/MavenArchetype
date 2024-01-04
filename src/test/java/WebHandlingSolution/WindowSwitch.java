package WebHandlingSolution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class WindowSwitch {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		String parentid=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allid=driver.getWindowHandles();
		Utility.windowhandling(driver, allid, parentid);
		
		System.out.println("Title by second Command "+driver.getTitle());

		
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
			
	
	}
		
		
		
		
		

	}


