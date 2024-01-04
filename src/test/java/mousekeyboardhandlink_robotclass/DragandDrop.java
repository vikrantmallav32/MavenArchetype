package mousekeyboardhandlink_robotclass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class DragandDrop {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/#default");
		
		
		//frame
		driver.switchTo().frame(0);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Utility.DragNDrop(driver, src, dest);
		
		System.out.println("Action is Completed!");
		
		
		//slider mechanism 
		
		
		//
		
	}

}
