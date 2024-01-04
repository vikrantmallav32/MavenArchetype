package WebHandlingSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleFrame {
	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//handle frame using index
		//driver.switchTo().frame(0);
		
		//handle frame using id/name
		//driver.switchTo().frame("mce_0_ifr");
		
		//Handle frame using webElement
		WebElement frameId=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameId);
		
		//ele inside frame
		WebElement ele=driver.findElement(By.id("tinymce"));
		ele.clear();
		ele.sendKeys("Hello All!");
		
	}
}
