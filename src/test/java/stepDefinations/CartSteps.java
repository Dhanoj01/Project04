package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class CartSteps {

	WebDriver driver = Hooks.driver;
	
	CartPage cart;
	LoginPage login;
	ProductPage product;
	
	@Given("user is logged in")
	public void user_is_logged_in() {
		driver.get("https://www.saucedemo.com/");

		login = new LoginPage(driver);
		login.login("standard_user", "secret_sauce");
		login.clickLogin();
		
	}

	@When("user add two products")
	public void user_add_two_products() {
	   
		product = new ProductPage(driver);
		product.addTwo();
	}

	@When("remove one product")
	public void remove_one_product() {
	   
		product.removeOne();
	}

	@Then("cart count should be {int}")
	public void cart_count_should_be(Integer int1) {
	   
		Assert.assertEquals(int1.intValue() , product.getCartCount());
	}

}
