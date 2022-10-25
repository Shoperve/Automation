package GMC.Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shoperve\\Driver\\chromedriver_win32 (9)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.amazon.com");
			driver.manage().window().maximize();

	}

}
