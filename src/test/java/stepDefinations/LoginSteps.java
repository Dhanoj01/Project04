package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.ProductPage;

public class LoginSteps {

	WebDriver driver;
	
	LoginPage login;
	ProductPage product;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		this.driver = Hooks.driver;
		driver.get("https://www.saucedemo.com/");
		login = new LoginPage(driver);
		
	}

	@When("user logs in with username {string} and password {string}")
	public void user_logs_in_with_username_and_password(String string, String string2) {
	    
		login.login(string, string2);
		login.clickLogin();
	}

	@Then("user should be redirected to product page")
	public void user_should_be_redirected_to_product_page() {
	  
		product = new ProductPage(driver);
		
        Assert.assertTrue("User not logged in!", product.getCartCount() >= 0);
	}


	@Then("error message should appear")
	public void error_message_should_appear() {
	   
		Assert.assertTrue("Error message missing" , login.getError().contains("Epic sadface"));
	}

}
