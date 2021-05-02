import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groupexecutiontest {
//  @Test  (groups = {"Smoke"})
//  public void login() 
//  {
//	  System.out.println("login script");
//  }
//  @Test  (groups = {"regression"})
//  public void buyproduct() 
//  {
//	  System.out.println("buy product script");
//  }
//  @Test  (groups = {"regression"})
//  public void payment() 
//  {
//	  System.out.println("payment script");
//  }
//  @Test  (groups = {"regression"})
//  public void buywishlist() 
//  {
//	  System.out.println("buy wish script");
//  }
	
	  // Executing before script
//  @BeforeMethod (groups = {"Smoke","Regression"})
//  public void configbm ()
//  {
//	  System.out.println("before method");
//  }
//@Test  (groups = {"Smoke"})
//public void login() 
//{
//	  System.out.println("login script");
//}
//@Test  (groups = {"regression"})
//public void buyproduct() 
//{
//	  System.out.println("buy product script");
//}
//@Test  (groups = {"regression"})
//public void payment() 
//{
//	  System.out.println("payment script");
//}
	
	// class group execution
	@BeforeMethod (groups = {"Smoke"})
  public void configbm ()
  {
	  System.out.println("before method");
  }
	@BeforeClass (groups = {"Regression"})
	  public void configbc ()
	  {
		  System.out.println("before class");
	  }
	@Test  (groups = {"Smoke"})
	public void login() 
	{
		  System.out.println("login script");
	}
	@Test  (groups = {"regression"})
	public void buyproduct() 
	{
		  System.out.println("buy product script");
	}
	@Test  (groups = {"regression"})
	public void payment() 
	{
		  System.out.println("payment script");
	}
  
  
  }

