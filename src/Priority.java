import org.testng.annotations.Test;

public class Priority 
{
  @Test (priority = 3)
  public void demo() 
  {
	  System.out.println("demo");
  }
  
  @Test (priority = 1)
  public void dummy() 
  {
	  System.out.println("dummy");
  }
  @Test (priority = 2)
  public void sample() 
  {
	  System.out.println("sample");
  }
  
}




