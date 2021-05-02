import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	private WebElement untxtbx;
	
	public Loginpage(WebDriver driver) 
	{
		untxtbx=driver.findElement(By.name("username"));
	
	}

	public WebElement getUntxtbx() {
		return untxtbx;
	}

	public WebElement getpwdbx() {
		
		return null;
	}

	public WebElement getloginbtn() {
		
		return null;
	}



	public WebElement getchkbx() {
		// TODO Auto-generated method stub
		return null;
	}

	}
	

