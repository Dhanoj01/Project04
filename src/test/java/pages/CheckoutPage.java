package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first-name")
	WebElement fname;
	
	@FindBy(id = "last-name")
	WebElement lname;
	
	@FindBy(id = "postal-code")
	WebElement pin;
	
	@FindBy(id = "continue")
	WebElement cont;
	
	public void enterDetails(String f , String l , String p)
	{
		fname.sendKeys(f);
		lname.sendKeys(l);
		pin.sendKeys(p);
		cont.click();
	}
}
