import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ITestNGListners
implements ITestListener
{

	private ITestContext result;

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"script execution start", true);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"script is passed", true);	
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"script is failed", true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"script is skipped", true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log(result.getName()+"script FailedButWithinSuccessPercentage", true);
		
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(result.getName()+"script start", true);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(result.getName()+"script finish", true);
	
	}

}
