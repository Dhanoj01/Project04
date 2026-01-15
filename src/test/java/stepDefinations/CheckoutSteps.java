package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.CheckoutPage;
import pages.FinishPage;
import pages.LoginPage;
import pages.ProductPage;
import pages.SummaryPage;

public class CheckoutSteps {

	WebDriver driver = Hooks.driver;
	
	LoginPage login;
	ProductPage product;
	CheckoutPage checkout;
	FinishPage finish;
	SummaryPage summary;
	
	@Given("user is logged in")
	public void user_is_logged_in() {
		
		driver.get("https://www.saucedemo.com/");
		login = new LoginPage(driver);
		login.login("standard_user", "secret_sauce");
		login.clickLogin();
	  
	}

	@When("user add product and proceed to checkout")
	public void user_add_product_and_proceed_to_checkout() {
	  product = new ProductPage(driver);
	  product.addTwo();
	  product.goToCart();
	}

	@When("user enters details {string} {string} {string}")
	public void user_enters_details(String string, String string2, String string3) {
	    
		checkout = new CheckoutPage(driver);
		checkout.enterDetails(string, string2, string3);
	}

	@When("user reviews summary")
	public void user_reviews_summary() {
	    
		summary = new SummaryPage(driver);
		
		
	}

	@Then("total price should be correct")
	public void total_price_should_be_correct() {
	    String txt = summary.getTotalText();
		Assert.assertTrue("Total Price incorrect" , txt.contains("$"));
	}

	@Then("order compeletes successfully")
	public void order_compeletes_successfully() {
	   
		finish = new FinishPage(driver);
	
		
		Assert.assertEquals("Thank you for your order!", finish.getSuccessMsg());
	}

}
