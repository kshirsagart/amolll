package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"txtUsername\"]")
	private WebElement userId;
	@FindBy(xpath="//*[@id=\"txtPassword\"]")
	private WebElement passWord;
	@FindBy(xpath="//*[@id=\"btnLogin\"]")//--> driver.findElement:partial initilization: with method execution: full initization of web element takes place
	private WebElement clickButton;
	
	public LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logIn() throws Exception
	{
		userId.sendKeys("Admin");
		passWord.sendKeys("admin123");
		clickButton.click();
		Thread.sleep(3000);
		
	}
}
