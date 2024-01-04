package mousekeyboardhandlink_robotclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/tooltip/");
		
		
		//frame
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//input[@id=\"age\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		//Utility.mouseover(driver, ele);
		
		//tool tip=pause in debug mode= ctrl+\
		String tooltip=driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
		System.out.println(tooltip);

	}

}
