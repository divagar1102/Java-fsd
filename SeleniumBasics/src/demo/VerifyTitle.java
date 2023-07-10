package demo;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyTitle {
 
	  public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver(); //Browser opening
		  driver.get("http://facebook.com"); //application navigation
		  String expectedTitle = "Facebook – log in or sign up";//verifying website
		  String actualTitle = driver.getTitle();
		  System.out.println(expectedTitle);
		  System.out.println(actualTitle);
		  if(expectedTitle.equals(actualTitle)) {
			  System.out.println("Test Case Passed");
		  }
		  else {
			  System.out.println("Test Case Failed");
		  }
		  driver.quit(); //exit browser
	  }
}
