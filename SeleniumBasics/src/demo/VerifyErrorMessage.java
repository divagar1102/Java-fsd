package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver(); //Browser opening
		  driver.get("https://facebook.com"); //application navigation
		  driver.findElement(By.id("email")).sendKeys("batman554466@gmail.com");//User-email
		  driver.findElement(By.id("pass")).sendKeys("qwerty123");//password
		  driver.findElement(By.name("login")).click();
		  String expectedErrMsg = "The email address you entered isn't connected to an account. Find your account and log in.";
		  String actualErrMsg = driver.findElement(By.xpath("(//div[contains(@class,'ay')])[3]")).getText();
		  System.out.println(expectedErrMsg);
		  System.out.println(actualErrMsg);
		  if(expectedErrMsg.equals(actualErrMsg)) {
			  System.out.println("Test Case Passed");
		  }
		  else {
			  System.out.println("Test Case Failed");
		  }
		  driver.quit();
		  
}
	
}