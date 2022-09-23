package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUser {
	private WebDriver driver;
	private By CreateEmail=By.id("email_create");
	private By SubmitCreate=By.id("SubmitCreate");
	private By firstName=By.id("customer_firstname");
	private By lastName=By.id("customer_lastname");
	private By email=By.id("email");
	private By passwd=By.id("passwd");
	
	
	public RegisterUser(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement createEmail()
	{
		return driver.findElement(CreateEmail);
	}
	public WebElement SubmitCreate()
	{
		return driver.findElement(SubmitCreate);
	}
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}
}
