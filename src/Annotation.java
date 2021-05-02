import org.testng.annotations.*;

public class Annotation{
  @BeforeSuite
  public void bs() 
  {
	  System.out.println("before suite");
  }
  
  @AfterSuite
  public void as() 
  {
	  System.out.println("After suite1");
  }
  
  @BeforeTest
  public void bt() 
  {
	  System.out.println("before test");
  }
  
  @AfterTest
  public void at() 
  {
	  System.out.println("After test");
  }
  
  @BeforeClass
  public void bc() 
  {
	  System.out.println("before class");
  }
  
  @AfterClass
  public void ac() 
  {
	  System.out.println("After class");
  }
  
  @BeforeMethod
  public void bm() 
  {
	  System.out.println("before method");
  }
  
  @AfterMethod
  public void am() 
  {
	  System.out.println("After Method");
  }
  
//  @Test
//  public void demo() 
//  {
//	  System.out.println("demo script");
//  }
  
  @Test
  public void first() 
  {
	  System.out.println("first script");
  }
  
  @Test
  public void second() 
  {
	  System.out.println("second script");
  }
}

