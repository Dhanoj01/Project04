package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement product1;
	
	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	WebElement product2;
	
	@FindBy(className = "shopping_cart_link")
	WebElement cart;
	
	@FindBy(className = "shopping_cart_badge")
	WebElement cartCount;
	
	public void addTwo()
	{
		product1.click();
		product2.click();
	}
	
	public void removeOne()
	{
		product2.click();
	}
	
	public int getCartCount()
	{
		return Integer.parseInt(cartCount.getText());
	}
	
	public void goToCart()
	{
		cart.click();
	}
	
}
