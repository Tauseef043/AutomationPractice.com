package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

		driver.get("https://jqueryui.com/droppable/");
		hp = new HomePageOB(driver);

	}

@Test
public void switchToiFrame()
{
	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

	System.out.println(driver.findElement(By.cssSelector("iframe.demo-frame")).getSize());
	//driver.switchTo().frame(0);
	Actions act=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement destination=driver.findElement(By.id("droppable"));
	
	act.dragAndDrop(source, destination).build().perform();
	
	//ab hum frame me hain frame se outside kisi web element ko access ni kr skty frame se out hona parta hai
	//driver.findElement(By.xpath("//div[@class='demo-list']/ul/li[2]")).click(); //i.e
	//directly access nai kr skty frame se bahar ana parta hai
	
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//div[@class='demo-list']/ul/li[2]")).click();
	
	
}
	

}
