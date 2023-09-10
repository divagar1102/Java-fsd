package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyProduct extends BaseTest{
@FindBy(xpath = "(//input[@value='Add to cart'])[1]")
private WebElement Product1;

@FindBy(xpath= "(//input[@value='Add to cart'])[2]")
private WebElement Product2;

public void clickOrder() {
	Product1.click();
	Product2.click();
}
public BuyProduct() {
	PageFactory.initElements(driver, this);
}
}
