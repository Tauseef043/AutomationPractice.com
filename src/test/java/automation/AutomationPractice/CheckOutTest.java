package automation.AutomationPractice;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.CheckoutPage;
import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class CheckOutTest extends base {

	private CheckoutPage checkoutP;
	HeaderPageOB headerP;
	HomePageOB homeP;

	public String abc;

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("baseURL"));

	}

	@BeforeMethod
	public void waitMethod() {

		checkoutP = new CheckoutPage(driver);
		homeP = new HomePageOB(driver);
		headerP = new HeaderPageOB(driver);
		getImplictWait();

	}

	@Test(priority = 1)
	public void addToCart() {

		getScrollDonw(homeP.getProductCard());

		getHoverOnElement(homeP.getProductCard());
		homeP.getproductHoveraddToCart().click();

		getExplictWait(homeP.getProduct_QuickView_AddToCartSuccessMSG());

		if (homeP.getProduct_QuickView_AddToCartSuccessMSG().isDisplayed()) {
			homeP.getProductQuickView_AddToCartProceedBtn().click();
		} else {
			Assert.assertTrue(false, "Product add to cart");
		}

	}

	/*
	 * @Test(priority = 2) public void Validate_Title() {
	 * headerP.getCartBtn().click();
	 * 
	 * Assert.assertEquals(driver.getTitle().contains("Order - My Store"),prop.
	 * getProperty("checkout"));
	 * 
	 * }
	 * 
	 */
	@Test(priority = 3)
	public void Validate_ProceedToCheckOutBtn() {
		getScrollDonw(checkoutP.getProceedChekOut());

		if (checkoutP.getProceedChekOut().isEnabled()) {
			checkoutP.getProceedChekOut().click();
		} else {
			Assert.assertTrue(false, "Check Out button Clickable");
		}
	}

	@Test(priority = 4)
	public void validate_User_authentication() {
		getExplictWait(checkoutP.getsigInBtn());
		getScrollDonw(checkoutP.getsigInBtn());

		if (driver.getTitle().toString().equals(prop.getProperty("Login"))) {
			checkoutP.getEmailLogin().sendKeys(prop.getProperty("emailLogin"));
			checkoutP.getPassLogin().sendKeys(prop.getProperty("passLogin"));
			checkoutP.getsigInBtn().click();
		}

	}

	@Test(priority = 5)

	public void validate_AddrPage_proceedBtn() {
		getExplictWait(checkoutP.getAddressElement());
		getScrollDonw(checkoutP.getAddressProceedBtn());

		if (checkoutP.getAddressProceedBtn().isEnabled()) {
			checkoutP.getAddressProceedBtn().click();
		} else {
			Assert.assertTrue(false, "Address proceed to checkout button");
		}

	}

	@Test(priority = 6)
	public void validate_ShippingPage_TOsCheckBOx() {
		getExplictWait(checkoutP.getShippingDetails_address_Element());
		getScrollDonw(checkoutP.getTosTxt());

		if (checkoutP.getTosChekBox().isEnabled()) {
			checkoutP.getTosChekBox().click();
		} else {
			Assert.assertTrue(false, "Shhipping TOS CheckBox button");
		}

	}

	@Test(priority = 7)
	public void validate_ShppingProceedBtn() {
		getExplictWait(checkoutP.getShippingProceedBtn());
		getScrollDonw(checkoutP.getShippingProceedBtn());
		if (checkoutP.getShippingProceedBtn().isEnabled()) {
			checkoutP.getShippingProceedBtn().click();
		} else {
			Assert.assertTrue(false, "Shhipping proceed button");
		}
		
	}

	@Test(priority = 8)
	public void validate_PaymentPageTab() {
		getExplictWait(checkoutP.getPaymentPageTab());
	
		if (checkoutP.getPaymentPageTab().isDisplayed()) {
			//
		} else {
			Assert.assertTrue(false, "Payment page tab");
		}

	}

	@Test(priority = 9)
	public void validate_PaymentPageTXT() {
		getExplictWait(checkoutP.getPaymentChoseTxt());
		if (checkoutP.getPaymentChoseTxt().isDisplayed()) {
			//
		} else {
			Assert.assertTrue(false, "Payment page choose payment text");
		}

	}

/* 


	@Test(priority = 10)
	public void validate_PaymentMethods() {

		getExplictWait(checkoutP.getPaymentChoseTxt());
	//	getScrollDonw(checkoutP.getShippingProceedBtn());

		
		List<WebElement> paymentMethods = (List<WebElement>) checkoutP.getPaymentMethods();
		for (int i = 0; i < paymentMethods.size(); i++) {
			
		//	System.out.println(" Size of payment methods: " +paymentMethods.size());
	
			
			
			paymentMethods.get(i).click();
			getExplictWait(checkoutP.getPaymentPageCard());
			if (i < paymentMethods.size()-1) {

				checkoutP.getOtherPayment_MethodBtn().click();
			} 
			else if (i == paymentMethods.size()-1) {

				checkoutP.getConfrirmOrder().click();
			}
				
		}
	

	}





*/
	@Test(priority = 10)
	public void validate_PaymentMethods() {

		getExplictWait(checkoutP.getPaymentChoseTxt());
		getScrollDonw(checkoutP.getPayByBank());
		
		
		if(checkoutP.getPayByBank().isDisplayed())
		{
			checkoutP.getPayByBank().click();
			getExplictWait(checkoutP.getPaymentPageCard());
			
			
			Assert.assertTrue(	checkoutP.getOtherPayment_MethodBtn().isEnabled(),"get another payment method button");
			checkoutP.getOtherPayment_MethodBtn().click();
			
		}
		
		if(checkoutP.getPayByCheque().isDisplayed())
		{
			checkoutP.getPayByBank().click();
			getExplictWait(checkoutP.getPaymentPageCard());
			Assert.assertTrue(	checkoutP.getConfrirmOrder().isEnabled(),"confirm button");

			checkoutP.getConfrirmOrder().click();
			
		}
		
	

	}
	@Test(priority = 11)
	public void validate_OrderConfirmation()
	{
		getExplictWait(checkoutP.getOrderConfrimationMSG());
		
		Assert.assertEquals(checkoutP.getOrderConfrimationMSG().getText().toString(), "Your order on My Store is complete.");
	}
	@Test(priority = 12)
	public void validate_backToOrderBtbn()
	{
		getScrollDonw(checkoutP.getBackOrderBtn());
		
		if(checkoutP.getBackOrderBtn().isEnabled())
		{
			checkoutP.getBackOrderBtn().click();
		}
		else {
			Assert.assertTrue(false,"Back to order Button");
		}
	}
	

}
