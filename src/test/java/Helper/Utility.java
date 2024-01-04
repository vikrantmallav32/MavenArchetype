package Helper;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

		//WebDriverWait()=Explicit Wait
	
		public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
		{
			WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
			return obj.until(ExpectedConditions.presenceOfElementLocated(loc));
		}
		
		public static WebElement waitForElementClickable(WebDriver driver,By loc)
		{
			WebDriverWait btnobj=new WebDriverWait(driver,Duration.ofSeconds(5));
			return btnobj.until(ExpectedConditions.elementToBeClickable(loc));
		}
		
		public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
		{
			WebDriverWait obj=new WebDriverWait(driver,Duration.ofSeconds(5));
			return obj.until(ExpectedConditions.visibilityOfElementLocated(loc));
		}

		
		public static boolean waitForUrlContains(WebDriver driver,String url)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.urlContains(url));
					
		}
		
		public static boolean waitForTitleContains(WebDriver driver,String title)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			return wait.until(ExpectedConditions.titleContains(title));
					
		}
		
		
		
	//Text box validation
	public static void textbox(WebElement ele, String field, String data) 
	{
		System.out.println("********Text Box " + field + "*********");
		System.out.println("Displayed :-" + ele.isDisplayed());
		System.out.println("Enabeled :- " + ele.isEnabled());
		System.out.println("Data Entered :- " + data);
		ele.sendKeys(data);
	}

	// Select tag drop down
	public static void selecttypedropdown(WebElement ele, String date) {
		Select sc = new Select(ele);
		System.out.println("Is Multiple Selection? :- " + sc.isMultiple());
		List<WebElement> List1 = sc.getOptions();
		System.out.println("Total Option :" + List1.size());
		for (WebElement i : List1) {
			System.out.println(i.getText());

		}
		sc.selectByVisibleText(date);
	}
	
	
	
	
	// bootstrap drop down / dynamic drop down
	public static void bootstrapdropdown(List<WebElement> list, String data) 
	{
		System.out.println("***Automation of Element Started***");
		System.out.println("Total Options: -" + list.size());

		System.out.println("*****List of Otions********");
		for (WebElement i : list) {
			System.out.println(i.getText());
		}

		System.out.println("*******Specific Option Selected********");
		for (WebElement i : list) {
			i.getText();
			if (i.getText().contains(data)) {
				System.out.println(i.getText());
				i.click();
				break;
			}
		}
		System.out.println("***Automation Succefully completed***");
	}
	
	
	//Simple alert
	public static void Alertaccept(WebDriver driver) throws Throwable
	{
		Alert alt=driver.switchTo().alert();
		System.out.println("Text on Alert window is:- "+alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}
	
	
	
	//Confirmation alert
	public static void AlertOKConfirm(WebDriver driver,String action) throws Throwable
	{
		Alert alt=driver.switchTo().alert();
		System.out.println("Text on Alert window is:- "+alt.getText());
		Thread.sleep(2000);
		String i=action;
		if(i.equalsIgnoreCase("confirm"))
		{
			alt.accept();
		}else
		{
			alt.dismiss();
		}
		
		}
	
	
	//Prompted alert
	public static void Alertprompted(WebDriver driver,String action,String data) throws Throwable
	{
		Alert alt=driver.switchTo().alert();
		System.out.println("Text on Alert window is:- "+alt.getText());
		Thread.sleep(2000);
		String i=action;
		if(i.equalsIgnoreCase("confirm"))
		{
			alt.sendKeys(data);
			alt.accept();
		}else
		{
			alt.dismiss();
		}
		
		}
		
//windows handling code
public static void windowhandling(WebDriver driver, Set<String> allid,String parentid) throws Throwable
{
	for(String childid:allid)
	{
		if(!parentid.equals(childid))
		{
			driver.switchTo().window(childid);
			System.out.println("Title by Driver:"+driver.getTitle());
						
		}
	}
}

//Javascript methods
//to scroll down the page
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}
//to scroll up the page
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");

	}

	
	//to scroll till web element
	public static void scrollToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);

	}
	
	//to add alert to web application
	public static void AddingAlert(WebDriver driver, String alert)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript(alert);
	}
	
	
	//Action class
	//right click on the webelement
	public static void rightclick(WebDriver driver, WebElement ele)
	{
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	//Double click Action
	public static void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions act= new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	//Mouse over action
	public static void mouseover(WebDriver driver, WebElement ele)
	{
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	//Drag and Drop
	public static void DragNDrop(WebDriver driver, WebElement src, WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}
	
	//Slider actions
	public static void slider(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele,200,0).build().perform();
	}
	
	
	
}

