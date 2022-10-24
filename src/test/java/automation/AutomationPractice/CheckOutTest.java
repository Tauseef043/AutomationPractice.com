package automation.AutomationPractice;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.CheckoutPage;
import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class CheckOutTest extends base {

	private CheckoutPage checkoutP;HeaderPageOB headerP; HomePageOB homeP;
	
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

	@Test(priority = 1, groups = { "cart" })
	public void addToCart()
	{
		
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

	
	@Test(priority = 2)
	public void Validate_Title()
	{
		headerP.getCartBtn().click();
		
		Assert.assertEquals(driver.getTitle().contains("Order - My Store"),prop.getProperty("checkout"));
		
	}
	@Test(priority = 3)
	public void Validate_ProceedToCheckOutBtn()
	{
		
		if(checkoutP.getProceedChekOut().isEnabled())
		{
			checkoutP.getProceedChekOut().click();
		}
		else {
			Assert.assertTrue(false,"Check Out button Clickable");
		}
	}


}
