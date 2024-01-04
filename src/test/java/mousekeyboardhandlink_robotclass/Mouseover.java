package mousekeyboardhandlink_robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class Mouseover {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");
		
		driver.switchTo().frame("iframeResult");
		WebElement element=driver.findElement(By.xpath("//img[@alt='Smiley']"));
		Utility.mouseover(driver, element);

	}

}
