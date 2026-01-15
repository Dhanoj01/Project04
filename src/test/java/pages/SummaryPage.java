package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	
	WebDriver driver;
	
	public SummaryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "summary_total_label")
	WebElement total;
	
	@FindBy(id = "finish")
	WebElement finishBtn;
	
	
	public String getTotalText()
	{
		return total.getText();
	}
	
	public void clickFinish()
	{
		finishBtn.click();
	}
	
	

}
