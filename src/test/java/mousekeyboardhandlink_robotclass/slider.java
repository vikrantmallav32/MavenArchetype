package mousekeyboardhandlink_robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class slider {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.className("ui-slider-handle"));
		Utility.slider(driver, ele);
	}

}
