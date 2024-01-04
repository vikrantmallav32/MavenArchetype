package WebHandlingSolution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Utility;

public class swaglabspagetest {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		By username=By.id("user-name");
		
		By password=By.id("password");
		
		By button=By.id("login-button");
		
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(button).click();
		
		By menudropdown=By.id("react-burger-menu-btn");
		
		By selectfilterdrpdwn=By.className("product_sort_container");
		
		By inventoryname=By.xpath("//a//div[@class=\"inventory_item_name \"]");
		
		By addtocart=By.xpath("//button[text()='Add to cart']");
		
		By cartlink=By.className("shopping_cart_link");
		
		By listmenu=By.xpath("//a[@class=\"bm-item menu-item\"]");
		
		List<WebElement> item=driver.findElements(inventoryname);
		System.out.println("Total Inventory Items :-"+item.size());
		System.out.println("***List of Item on Inventory Page***");
		for(WebElement i:item)
		{
			System.out.println(i.getText());
		}
		System.out.println("***Specific Item Selected***");
		int count=0;
		for (WebElement i:item)
		{
			count++;
			if(i.getText().contains("Sauce Labs Fleece Jacket"))
			{
				System.out.println(i.getText());
				i.findElement(By.xpath("(//button[text()='Add to cart'])["+count+"]")).click();
				break;
			}
			
		}
		System.out.println("***Automation Completed***");
		
		
//		Utility.bootstrapdropdown(item, "Sauce Labs Backpack");
//		driver.findElement(addtocart).click();
//		driver.navigate().back();
//		driver.findElement(cartlink).click();
//		
//		driver.findElement(menudropdown).click();
//		List<WebElement> list=driver.findElements(listmenu);
//		Utility.bootstrapdropdown(list, "Logout");
//		
//		driver.findElement(username).sendKeys("standard_user");
//		driver.findElement(password).sendKeys("secret_sauce");
//		driver.findElement(button).click();
//		
//		WebElement ele=driver.findElement(selectfilterdrpdwn);
//		Utility.selecttypedropdown(ele, "Price (low to high)");
		
		
		}
				

	}


