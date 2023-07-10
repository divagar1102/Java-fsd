package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
		public static void main(String[] args) {
			  ChromeDriver driver = new ChromeDriver(); //Open browser
			  driver.manage().window().maximize();//Maximize it
			  driver.get("https://letcode.in/dropdowns");
			  WebElement languages =driver.findElement(By.id("lang"));
			  Select select = new Select(languages);
			  select.selectByVisibleText("Java");
}
}
