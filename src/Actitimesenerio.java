import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Actitimesenerio {
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
	}
	@Test  (priority = 1)
	public void validlogin()
	{
		System.out.println("valid login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("123@");
		driver.findElement(By.id("loginButton")).click();
	}
	@Test  (priority = 2)
	public void invalidlogin()
	{
		System.out.println("invalidlogin(");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("123");
		driver.findElement(By.id("loginButton")).click();
	}	
		
	}