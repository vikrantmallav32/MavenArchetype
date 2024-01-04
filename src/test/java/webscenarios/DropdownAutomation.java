package webscenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropdownAutomation {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.amazon.in");
		System.out.println("Title is :- "+driver.getTitle());
		
		
		//Identify select based drop down
		WebElement ele=driver.findElement(By.name("url"));
		
		//Select base
		Select dd=new Select(ele);
		System.out.println("is Search box a Multiple Selectionis : "+dd.isMultiple());
		
		dd.selectByIndex(2);
		Thread.sleep(2000);
		dd.selectByVisibleText("Gift Cards");
		Thread.sleep(2000);
		dd.selectByValue("search-alias=electronics");
		
		List<WebElement> all=dd.getOptions();
		System.out.println("Total Options : - "+all.size());
		
		for(WebElement i:all)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Video Games"))
			{
				i.click();
				break;
				
			}
		}
		
		
		

	}

}
