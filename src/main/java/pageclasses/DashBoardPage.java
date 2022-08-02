package pageclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DashBoardPage {
	
	WebDriver driver;
	@FindBy(xpath="//*[text()='Leave']")
	private WebElement leave;
	@FindBy(xpath="//*[@id='calFromDate']")
	private WebElement fromdate;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    private	WebElement month;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    private	WebElement year;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a")
	private WebElement date;
	
	@FindBy(id="calToDate")
	private WebElement todate;
	@FindBy(xpath="//*[text()='Rejected']")
	private WebElement reject;
	@FindBy(xpath="//*[@id=\"leaveList_cmbSubunit\"]")
	private WebElement subunit;
	@FindBy(xpath="//*[@id=\"frmFilterLeave\"]/fieldset/ol/li[6]/label")
	private WebElement past;
	@FindBy(xpath="//*[@id=\"leaveList_txtEmployee_empName\"]")
	private WebElement employee;
	 public DashBoardPage(WebDriver driver)
	 {
		  
		 PageFactory.initElements(driver, this);
	 }
	
		 
	 public void searchShare() throws Exception
	 {
		leave.click();
		
		reject.click();
		
		todate.clear();
		
		todate.sendKeys("2022-07-12");
		
		fromdate.click();
		
		Select ss=new Select(month);
		
		ss.selectByVisibleText("Feb");
		
		Select s=new Select(year);
		
		s.selectByVisibleText("2022");
		
		date.click();
		
		Select ss1=new Select(subunit);
		
		ss1.selectByVisibleText("Engineering");
		
		past.click();
		Thread.sleep(3000);
		
		employee.sendKeys("Tushar Kshirsagar");
	 }
	 
	 

}
