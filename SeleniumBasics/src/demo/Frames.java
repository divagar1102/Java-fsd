package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver(); //Open browser
		  driver.manage().window().maximize();//Maximize it
		  driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");//get website
		  driver.switchTo().frame("classFrame");//getting into frames
		  driver.findElement(By.linkText("DEPRECATED")).click();//getting value
}
}
