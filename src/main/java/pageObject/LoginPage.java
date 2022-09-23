package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebDriver driver;
	By email=By.id("email");
	By passwd=By.id("passwd");
	By SubmitLogin=By.id("SubmitLogin");
	By errorMSG=By.xpath("//div[@id='center_column']/div[1]");

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getPassword()
	{
		return driver.findElement(passwd);
	}
	public WebElement subLogin()
	{
		return driver.findElement(SubmitLogin);
	}
	public WebElement failedLoginMSG()
	{
		return driver.findElement(errorMSG);
	}
	
}
