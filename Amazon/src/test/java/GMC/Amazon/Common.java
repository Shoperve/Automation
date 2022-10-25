package GMC.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Common  {
	WebDriver driver;
  @Parameters({"browser"})
  @BeforeClass  
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("Chrome")){
		  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoperve\\Driver\\chromedriver_win32 (9)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
	}

  
  

  }
}
