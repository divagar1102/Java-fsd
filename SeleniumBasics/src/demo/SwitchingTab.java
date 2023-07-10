package demo;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTab {
	public static void main(String[] args) throws InterruptedException {
	     ChromeDriver driver = new ChromeDriver();//open browser
	     driver.manage().window().maximize();//maximise
	     driver.get("https://www.facebook.com/");//calling website
	     driver.findElement(By.linkText("Instagram")).click();//sub element
	     ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());//new window opening
	     driver.switchTo().window(tabs.get(1));
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));//explicit wait
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	     driver.findElement(By.name("username")).sendKeys("Spiderman@gmail.com");
}
}
