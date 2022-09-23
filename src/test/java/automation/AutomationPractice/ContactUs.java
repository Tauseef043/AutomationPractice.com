package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.ContactUsPage;
import resources.base;

public class ContactUs extends base{
	WebElement waits;
	//public WebDriver driver;
	

	/*
 	@BeforeTest
 public void initialization() throws IOException {

		driver = initializeDriver();
	//	driver.get("http://automationpractice.com/index.php?controller=contact");
	}
	*/
 	
	public ContactUs(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
		

	@AfterMethod
	public void tearDown() {

		driver.close();
		driver = null;

	}
	
	@Test
	public void submitMessage() throws InterruptedException, IOException
	{
		ContactUsPage csp=new ContactUsPage(driver);
		
		Select SubjectDropdown=new Select(csp.getSubject());
		Thread.sleep(100);
		SubjectDropdown.selectByVisibleText("Webmaster");
	Thread.sleep(100);
		SubjectDropdown.selectByVisibleText("Customer service");
		driver = initializeDriver();
		csp.getEmail().sendKeys(prop.getProperty("email"));
		csp.getMessage().sendKeys(prop.getProperty("message"));
		csp.submitMessageBtn().click();
		
		new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOf(csp.getSuccessMSG()));
		
		
		String successMSG=csp.getSuccessMSG().getText();
		System.out.println(successMSG);
		
		csp.backToHome().click();
		
	}

}
