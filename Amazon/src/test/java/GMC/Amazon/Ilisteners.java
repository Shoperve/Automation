package GMC.Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Ilisteners implements ITestListener {
	WebDriver driver;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult arg0) {
		Date dt = new Date();
		System.out.println(dt);
		String si = dt.toString().replace("-", "_").replace(":", "_");
		System.out.println(si);
		/*File shotsofscreen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(shotsofscreen,new File("C:\\Users\\shoperve\\workspace\\SeleniumPractice02\\Amazon\\Screenshots\\Test failed\\"
							+ si + "shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test has been started");

	}

	public void onTestSuccess(ITestResult arg0) {
		Date dt = new Date();
		System.out.println(dt);
		String si = dt.toString().replace("-", "_").replace(":", "_");
		System.out.println(si);
		File shotsofscreen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(shotsofscreen,
					new File("C:\\Users\\shoperve\\workspace\\SeleniumPractice02\\Amazon\\Screenshots\\Test passed\\"
							+ si + "shots.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
