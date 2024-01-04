package CustomerServicetestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass

{
  @Test(priority=1)
  public void Verifyurl() 
  {
	  Assert.assertTrue(lp.geturl().contains("crm"),"URL Mismatched");
	  System.out.println("URL Matched");
	
  }
  
  @Test(priority=2)
  public void Title() 
  {
	  Assert.assertTrue(lp.getAppTitle().contains("Customer Service"),"Title Mismatched");
	  System.out.println("Title Matched and is :-"+lp.getAppTitle());
	
  }
  
  @Test(priority=3)
  public void Login() 
  {
	 lp.login("test@gmail.com","test@123");
	 Assert.assertTrue(lp.geturl().contains("customers.html"),"URL Mismatched");
	 System.out.println("Login Succefully!");
	
  }
  
  
  
  
  
  
  
}
