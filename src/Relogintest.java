 import java.util.concurrent.TimeUnit;

 
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Relogintest {
	WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		driver=BrowserFactory.launchBrowser("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
	}

  @Test
  public void login() {
	  Loginpage lp = new Loginpage(driver);
	  lp.getUntxtbx().sendKeys("admin");
	  lp.getpwdbx().sendKeys("1234@");
	  lp.getloginbtn().click();
  }
  
  @Test
  public void rememberlogin()
  {
	  Loginpage lp = new Loginpage(driver);lp.getUntxtbx().sendKeys("admin");
	  lp.getpwdbx().sendKeys("1234@");
	  lp.getchkbx().click();
	  lp.getloginbtn().click();

  }
}
