package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class testtt extends base {
	private HomePageOB hp;
	private String product_name;
	private String product_price;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();

		log.info("Driver is initialzie");

		driver.get(prop.getProperty("baseURL"));

		hp = new HomePageOB(driver);

	}

	@Test
	public void switchToiTabs() {

		
			 hp.getScrollDonw(hp.getProductCard());
			  
		Actions	  act = hp.getHoverOnElement(hp.getProductCard());
			  Assert.assertTrue(hp.getproductHoverMoreBtn().isEnabled(),
			  "More button clickable");
			  
			 hp.getproductHoverMoreBtn().click();
			  
		String	  title = "Faded Short Sleeve T-shirts - My Store";
			  
			  Assert.assertEquals(driver.getTitle().trim(), title.trim());
			  
			  driver.navigate().back();
		

	}

}
