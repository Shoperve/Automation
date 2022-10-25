package GMC.Amazon;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Amazon {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  Ahome Amazon_Home=new Ahome(driver);
	  Amazon_Home.searchfield();
	  screenshots();
	  Amazon_Home.searchicon();
	  Amazon_Home.Customerservice();
	  screenshots();
  }
  
 
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoperve\\workspace\\SeleniumPractice02\\Amazon\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  public void screenshots() throws IOException{
	  Date dt=new Date();
	  System.out.println(dt);
	  String si=dt.toString().replace("-", "_").replace(":", "_");
	  System.out.println(si);
	  File shotsofscreen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(shotsofscreen, new File("C:\\Users\\shoperve\\workspace\\SeleniumPractice02\\Amazon\\Screenshots\\"+si+"shots.png"));
  }

}
