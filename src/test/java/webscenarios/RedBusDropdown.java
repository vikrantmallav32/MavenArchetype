package webscenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Helper.Utility;

public class RedBusDropdown extends Utility
{

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.redbus.in/");
		
		//search for the from tab and get all options
		driver.findElement(By.id("src")).sendKeys("pune");
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li//div//text[@class=\"placeHolderMainText\"]"));
		Utility.bootstrapdropdown(list1, "Wakad");
		
		//search from the to tab
		driver.findElement(By.id("dest")).sendKeys("Mumbai");
		List<WebElement> list2=driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq eFEVtU\"]//li//div//text[@class=\"placeHolderMainText\"]"));
		Utility.bootstrapdropdown(list2, "Kurla");
		
		//date to be fixed
		//Expectation
		String month="Apr";
		String date="6";
		String year="2024";
				
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		while(true)
		{
			String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
			String cmonth=text.split(" ")[0];
			String cyear=text.split(" ")[1];
			//System.out.println(cmonth+ "   "+cyear);
			//System.out.println("**********");
			if(cmonth.contains(month) && cyear.contains(year))
			{
				break;
			}
			else
			{
				//click the arrow
				driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
			}
		}
		List<WebElement> alldates=driver.findElements(By.xpath("//div//span[contains(@class,'CalendarDaysSpan')]"));
		System.out.println(alldates.size());
		
		for(WebElement i:alldates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		driver.findElement(By.id("search_button")).click();			
	}
}


