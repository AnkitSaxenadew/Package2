import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Endtoendtest {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{ System.out.println("before class");
		System.out.println("before method");
		
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do");
	}
	@AfterClass
	public void teardown()
	{
		System.out.println("After class");
		driver.quit();
	}
	@AfterMethod
	public void postcondition()
	{
		driver.findElement(By.id("logoutLink")).click();
		}
	
	@Test  
	public void createnewcoustomer()
	{
		System.out.println("createnewcoustomer");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("1234@");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.cssSelector("input[value=\"Create New Customer\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Marshal");
		driver.findElement(By.name("createCustomerSubmit")).click();
	}
//	@Test  (dependsOnMethods = ("Create new coustpmer"))
//	public void creatnewproject()
//	{
//		System.out.println("create new project");
//		driver.findElement(By.name("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("123@");
//		driver.findElement(By.id("loginButton")).click();
//		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
//		driver.findElement(By.linkText("Projects & Customers")).click();
//		driver.findElement(By.cssSelector("input[value=\"Create New Customer\"]")).click();
//	}
//	
	
	}	
		
