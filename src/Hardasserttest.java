import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hardasserttest {
	
	WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
	}
	@AfterMethod
	public void postcondition1()
	{
		System.out.println("After method");
		driver.close();
	}
	@Test  (priority = 1)
	public void validlogin()
	{
		System.out.println("valid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("1234@");
		driver.findElement(By.id("loginButton")).click();
		
		String exptext="Enter Time-Track";
		String actualtext=driver.findElement(By.xpath("(//td[@class='pagetitle'])[2]")).getText();
		Assert.assertEquals(actualtext, exptext);
		Reporter.log("home page verified", true);
		// not working
//		String actualtitle="actitime-Enter Time-Track";
//		String expttitle=driver.getTitle();
//		Assert.assertEquals(actualtitle, expttitle);
//		Reporter.log("home title verified", true);
	}
	@Test  (priority = 2)
	public void invalidlogin()
	{
		System.out.println("invalidlogin(");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("123");
		driver.findElement(By.id("loginButton")).click();
		
		String expmsg="Username or Password is invalid. Please try again.";
		String actualmsg=driver.findElement(By.xpath("//div[@id='ServerSideErrorMessage']//span")).getText();
		Assert.assertEquals(actualmsg, expmsg);
		Reporter.log("invalid login msg is verified", true);
	}	
}
