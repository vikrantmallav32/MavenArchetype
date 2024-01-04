package OrangeHRMTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseClass 
{
  @Test(priority=1)
  public void Url() 
  {
	  Assert.assertTrue(lp.Url().contains("index"),"URL Mismatched");
	  System.out.println("URL Validated Succefully!!!!!!");	  
	  
  }
  @Test(priority=2)
  public void title()
  {
	  Assert.assertTrue(lp.title().contains("OrangeHRM"),"Title Mis-Matched");
	  System.out.println("Title Macthe and is :- " +lp.title());
  }
  
  @Test(priority=3)
  public void login()
  {
	  lp.login("Admin","admin123");
	  boolean url=lp.Url().contains("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  Assert.assertTrue(url, "Login Failed");
	  System.out.println("Login succefully!!!!!!!!");
  }
}
