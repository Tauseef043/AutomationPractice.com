package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class CheckoutPage extends base {

	public WebDriver driver;
	private By proceedChekOut = By.xpath("//div[@id='center_column']/p[2]/a[1]");
	private By EmailLogin = By.id("email");
	private By PassLogin = By.id("passwd");
	private By sigInBtn = By.id("SubmitLogin");
	private By EmailReg = By.id("email_create");
	private By CreateAccBtn = By.id("SubmitCreate");

	private By AddressElement = By.xpath("//label[contains(text(),'Choose a delivery address:')]");
	private By AddressProceedBtn = By.xpath("//button[@name='processAddress']");

	private By ShippingDetails_address_Element = By
			.xpath("//p[contains(text(),'Choose a shipping option for this address')]");
	private By TosChekBox = By.xpath("//input[@id='cgv']");
	private By TosTxt = By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to')]");
	private By shippingProceedBtn = By.xpath("//button[@name='processCarrier']");

	private By PaymentChoseTxt = By.xpath("//h1[contains(text(),'Please choose your payment method')]");
	private By PaymentPageTab = By.xpath("//span[contains(text(),'Your payment method')]");

	private By paymentMethods = By.xpath("//div[@id='HOOK_PAYMENT']/div/div/p/a");

	private By PayByBank = By.xpath("//div[@id='HOOK_PAYMENT']/div[1]/div/p/a");
	private By PayByCheque = By.xpath("//div[@id='HOOK_PAYMENT']/div[2]/div/p/a");

	private By paymentPageCard = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/div[1]");
	private By otherPayment_MethodBtn = By.xpath("//p[@id='cart_navigation']/a");
	private By ConfrirmOrder = By.xpath("//p[@id='cart_navigation']/button");

	private By continiueShoppingBtn = By.xpath("//div[@class='paiement_block']/p/a");

	private By orderConfrimationMSG=By.xpath("//p[contains(text(),'Your order on My Store is complete.')]");
	private By BackOrderBtn=By.xpath("//div[@id='center_column']/p[2]/a");
	

	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProceedChekOut() {

		return driver.findElement(proceedChekOut);
	}

	public WebElement getEmailLogin() {

		return driver.findElement(EmailLogin);
	}

	public WebElement getPassLogin() {

		return driver.findElement(PassLogin);
	}

	public WebElement getsigInBtn() {

		return driver.findElement(sigInBtn);
	}

	public WebElement getEmailReg() {

		return driver.findElement(EmailReg);
	}

	public WebElement getCreateAccBtn() {

		return driver.findElement(CreateAccBtn);
	}

	public WebElement getAddressElement() {

		return driver.findElement(AddressElement);
	}

	public WebElement getAddressProceedBtn() {

		return driver.findElement(AddressProceedBtn);
	}

	public WebElement getShippingDetails_address_Element() {

		return driver.findElement(ShippingDetails_address_Element);
	}

	public WebElement getTosChekBox() {

		return driver.findElement(TosChekBox);
	}

	public WebElement getTosTxt() {

		return driver.findElement(TosTxt);
	}

	public WebElement getShippingProceedBtn() {

		return driver.findElement(shippingProceedBtn);
	}

	public WebElement getPaymentChoseTxt() {

		return driver.findElement(PaymentChoseTxt);
	}

	public WebElement getPaymentPageTab() {

		return driver.findElement(PaymentPageTab);
	}

	public List<WebElement> getPaymentMethods() {
		return driver.findElements(paymentMethods);
	}

	public WebElement getPaymentPageCard() {

		return driver.findElement(paymentPageCard);
	}

	public WebElement getOtherPayment_MethodBtn() {

		return driver.findElement(otherPayment_MethodBtn);
	}

	public WebElement getConfrirmOrder() {

		return driver.findElement(ConfrirmOrder);
	}

	public WebElement getContiniueShoppingBtn() {

		return driver.findElement(continiueShoppingBtn);
	}

	public WebElement getPayByBank() {

		return driver.findElement(PayByBank);
	}

	public WebElement getPayByCheque() {

		return driver.findElement(PayByCheque);
	}
	public WebElement getOrderConfrimationMSG() {

		return driver.findElement(orderConfrimationMSG);
	}
	public WebElement getBackOrderBtn() {

		return driver.findElement(BackOrderBtn);
	}
}
