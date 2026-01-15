package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishPage {

	WebDriver driver;
	
	public FinishPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "complete-header")
	WebElement successMsg;
	
	public String getSuccessMsg()
	{
		
		return successMsg.getText();
	
	}
	
}
