package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.RegisterUser;
import resources.base;

public class LoginTest extends base {

	public LoginTest(WebDriver driver) {
		this.driver = driver;

	}

	@Test
	public void submitLogin() throws IOException {

		LoginPage lpg = new LoginPage(driver);
		driver = initializeDriver();
		lpg.getEmail().sendKeys(prop.getProperty("email"));
		lpg.getPassword().sendKeys(prop.getProperty("password"));
		lpg.subLogin().click();

		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(lpg.failedLoginMSG()));
		if (lpg.failedLoginMSG().isDisplayed()) {
			System.out.println(lpg.failedLoginMSG().getText());

		}

	}
	@Test
	public void RegisteringUser()
	{
		RegisterUser RU=new RegisterUser(driver); 
		
		RU.createEmail().sendKeys(prop.getProperty("email"));
		RU.SubmitCreate().click();
		
		RU.firstName().sendKeys("Touseef");
		RU.lastName().sendKeys("Tousif");
		
	}

}
