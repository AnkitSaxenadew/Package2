import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListnerTest {
  @Test (priority = 1)
  public void login() 
  {
	  Reporter.log("login script", true);
  }
  @Test (priority = 2)
  public void creatcustomer() 
  {
	  Reporter.log("create customer script test", true);
  }
  @Test (dependsOnMethods = ("create customer"))
  public void createproject() 
  {
	  Reporter.log("project create script", true);
  }
  
}

