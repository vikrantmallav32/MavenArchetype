package mousekeyboardhandlink_robotclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class redbuscalender {

	public static void main(String[] args) 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//Expectation
		String month="Apr";
		String date="6";
		String year="2024";
		
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		
		//month selection
		while(true)
		{
		String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
		//System.out.println(text);
		String cmonth=text.split(" ")[0];
		String cyear=text.split(" ")[1];
		
		//System.out.println(cmonth+" :  "+cyear);
		
		if(cmonth.contains(month) && cyear.contains(year))
		{
			break;
		}else
		{
			//click on arrow
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
		}
		
		}
		
		//date selection
		
		List<WebElement> allDates=driver.findElements(By.xpath("//div//div[contains(@class,'DayTiles__')]//span[contains(@class,'DayTiles')]"));
		
		for(WebElement i:allDates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		

	}

}
