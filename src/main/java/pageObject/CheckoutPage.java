package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class CheckoutPage extends base{

	public WebDriver driver;
	private By proceedChekOut= By.xpath("//div[@id='center_column']/p[2]/a[1]");
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getProceedChekOut() {
		
		return driver.findElement(proceedChekOut);
	}
	
	
}
