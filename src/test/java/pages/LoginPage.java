package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="user-name")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	@FindBy(css="[data-test='error']")
	WebElement errorMsg;

	public void login(String username ,String pass)
	{
		uname.sendKeys(username);
		password.sendKeys(pass);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public String getError()
	{
		return errorMsg.getText();
	}
}
