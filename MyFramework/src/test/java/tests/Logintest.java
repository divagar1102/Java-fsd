package tests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BaseTest;
import pages.BuyProduct;
import pages.HomePage;
import pages.LoginPage;
import utilities.MyListener;

@Listeners(value=MyListener.class)
public class Logintest extends BaseTest{
	WebDriver d;
	HomePage h;
	LoginPage l;
	BuyProduct p;
@Test(priority=1)
public void testLogin() {
h.clickLoginLink();
System.out.println("Login Clicked");
l.enterLoginDetails("Itest@test.com", "Itest@test");
p.clickOrder();
}
@BeforeTest()
public void setup() {
	getBrowser();
	h= new HomePage();
	l= new LoginPage();
	p= new BuyProduct();
}
}
