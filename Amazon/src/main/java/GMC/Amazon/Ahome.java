package GMC.Amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ahome {

	WebDriver driver;
	@FindBy(id="twotabsearchtextbox") WebElement Search;
	@FindBy(id="nav-search-submit-button") WebElement Searchicon;
	@FindBy(linkText="Customer Service") WebElement Customerservice;
	
	//constructor for page factory
	
	public Ahome(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	// Methods for all functions 
	
	public void searchfield(){
		Search.sendKeys("computer");
	}
	public void searchicon(){
		Searchicon.click();
	}
	public void Customerservice(){
		Customerservice.click();
	}
}
