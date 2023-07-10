package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		  ChromeDriver driver = new ChromeDriver(); //Open browser
		  driver.manage().window().maximize();//Maximize it
		  driver.get("https://letcode.in/table");
		  WebElement firstTable = driver.findElement(By.id("shopping")); //Sum all prices in table and verify it
		  List<WebElement> rows = firstTable.findElements(By.tagName("tr"));//Capture all the rows in table
		  int sum = 0;
		  for (int i=0; i<rows.size(); i++) {
			  WebElement row = rows.get(i);
			  List<WebElement> columns = row.findElements(By.tagName("td"));
			  int price = Integer.parseInt(columns.get(1).getText());
			  sum = sum + price;
		  }
		  int expectedSum = 858;
		  if(expectedSum == sum) {
			  System.out.println("Test Case Passed");
		  }
		  else {
			  System.out.println("Test Case Failed");
		  }
}
}