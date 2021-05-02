import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	//execute from test ng suite file only
	@BeforeMethod
	@Parameters({"browser","baseurl"})
	public void precondition(String browser name,String URL)
	{
		System.out.println("Before Method");
		System.out.println("browser name+","+url");
	}
  @Test
  public void Sample()
  {
	  System.out.println("sample script");
  }
}
