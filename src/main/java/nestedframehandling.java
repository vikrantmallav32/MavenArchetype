import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframehandling {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		//top frame
		//driver.switchTo().frame("frame-top");
		driver.switchTo().frame(0);
		
		//left
		driver.switchTo().frame("frame-left");
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		System.out.println("Text of Left Frame: -"+text1);
		System.out.println("************left Frame source**********");
		System.out.println(driver.getPageSource());
		
		
		
		//come back on main frame
		driver.switchTo().defaultContent();
		
		//middle
		driver.switchTo().frame(0).switchTo().frame("frame-middle");
		String text2=driver.findElement(By.id("content")).getText();
		System.out.println("Text on Middle: "+text2);
		System.out.println("********Middle Frame Source******");
		System.out.println(driver.getPageSource());
		
		//come back on main frame
				driver.switchTo().defaultContent();
				
		//right
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		String text3=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
		System.out.println("Text on Middle: "+text3);
		System.out.println("********Middle Frame Source******");
		System.out.println(driver.getPageSource());
		
		
		
		//bottom
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println("Text on Bottom Frame :-"+driver.findElement(By.xpath("//body[normalize-space()='BOTTOM']")).getText());
		System.out.println("*************Bottom Frame Source***********");
		System.out.println(driver.getPageSource());
		
		driver.quit();
	}

}
