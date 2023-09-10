package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
	@FindBy(id="Email")
	private WebElement Username;
	
	@FindBy(id="Password")
	private WebElement Pass;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginBtn;
	
public void enterLoginDetails(String u, String p) {
	Username.sendKeys(u);
	Pass.sendKeys(p);
	loginBtn.click();
}
public LoginPage(){
	PageFactory.initElements(driver, this);
	
}

}
