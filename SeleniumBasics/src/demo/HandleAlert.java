package demo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HandleAlert {
	    public static void main(String[] args) throws InterruptedException {
	     ChromeDriver driver = new ChromeDriver();//open browser
	     driver.manage().window().maximize();//maximize
	     driver.get("https://retail.onlinesbi.sbi/retail/login.htm");//get website
	     driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();//get element/values
	     driver.findElement(By.id("Button2")).click();
	     Thread.sleep(3000);
	     driver.switchTo().alert().accept(); //alert handled
	    }
	}