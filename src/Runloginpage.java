import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runloginpage {
	private WebElement untxtbx;
	private WebElement pwdtxtbx;
	private WebElement chkbx;
	private WebElement loginbtn;
	public Runloginpage(WebDriver driver) 
	{
		untxtbx=driver.findElement(By.name("username"));
		pwdtxtbx=driver.findElement(By.name("pwd"));
		chkbx=driver.findElement(By.id("keepLoggedInCheckBox"));
		untxtbx=driver.findElement(By.name("username"));
		loginbtn=driver.findElement(By.id("loginButton"));
	}

	public WebElement getUntxtbx() {
		return untxtbx;
	}

	public WebElement getPwdtxtbx() {
		return pwdtxtbx;
	}
	
	public WebElement getChkbx() {
		return chkbx;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
