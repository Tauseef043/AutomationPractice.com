package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {

	public WebDriver driver;
	By subject = By.id("id_contact");
	By email = By.id("email");
	By orderID = By.id("id_order");
	By fileUpload = By.id("fileUpload");
	By message = By.id("message");
	By subMsgBtn = By.id("submitMessage");;
	By successMsg = By.cssSelector("p[class*='success']");
	By backHome = By.xpath("//div[@id='center_column']/ul/li/a");

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSubject() {
		return driver.findElement(subject);
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getOrderRef_OPT() {
		return driver.findElement(orderID);
	}

	public WebElement getFileUplaod_OPT() {
		return driver.findElement(fileUpload);
	}

	public WebElement getMessage() {
		return driver.findElement(message);
	}

	public WebElement submitMessageBtn() {
		return driver.findElement(subMsgBtn);
	}

	public WebElement getSuccessMSG() {
		return driver.findElement(successMsg);
	}
	public WebElement backToHome() {
		return driver.findElement(backHome);
	}

}
