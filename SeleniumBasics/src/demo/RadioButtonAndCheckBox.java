package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAndCheckBox {
	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver(); //Open browser
		  driver.manage().window().maximize();//Maximize it
		  driver.get("https://letcode.in/radio");//navigate to site
		  driver.findElement(By.id("yes")).click();//Select yes from radio button
		  driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();//Check last check box
}
}