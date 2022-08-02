package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageclasses.DashBoardPage;
import pageclasses.LoginPage;

public class BaseTest {

	static WebDriver driver;
	LoginPage lip;
	DashBoardPage dsh;
	@BeforeSuite
	public void launchURL()
	{
		//System.setProperty("", )
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	@BeforeClass
	public void creationObject()
	{
		lip=new LoginPage(driver);
		dsh=new DashBoardPage(driver);
		
	}

	
}
