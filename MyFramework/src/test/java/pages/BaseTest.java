package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTest {
	public static WebDriver driver = null;
	public static void getBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divag\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
}
    
