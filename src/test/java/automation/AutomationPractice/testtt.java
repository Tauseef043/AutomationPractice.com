package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class testtt extends base{
	private HomePageOB hp;

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();
		
		driver.get(prop.getProperty("baseURL"));
		hp = new HomePageOB(driver);
	
	}
	
	
	@Test
	public void atest() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Assert.assertTrue(hp.getproductIMG().isDisplayed(),"Product Image is visible");
		Assert.assertTrue(hp.getproductTitle().isDisplayed(),"Product Title is visible");
		Assert.assertTrue(hp.getproductPrice().isDisplayed(),"Product price is visible");


		
		
		// Create instance of Javascript executor

		JavascriptExecutor je = (JavascriptExecutor) driver;



		//Identify the WebElement which will appear after scrolling down

		WebElement element = hp.getproductHoverQuickView();



		// now execute query which actually will scroll until that element is not appeared on page.

		je.executeScript("arguments[0].scrollIntoView(true);",element);
		
		
		Actions act= new Actions(driver);
		act.moveToElement(hp.getproductPrice()).build().perform();
		
		
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(hp.getproductHoverQuickView()));
		// Print the first result
		System.out.println(firstResult.getText());
		
	
		hp.getproductHoverQuickView().click();
	}
	
	
	

}
