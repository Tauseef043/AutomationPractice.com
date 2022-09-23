package automation.AutomationPractice;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.LoginPage;
import resources.base;

public class HeaderTest extends base {
	private HeaderPageOB lp;

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();
		
		driver.get(prop.getProperty("baseURL"));
		lp = new HeaderPageOB(driver);
	}

	/*
	 * @Test public void HeaderExe() throws InterruptedException, IOException {
	 * LandingPage lp = new LandingPage(driver);
	 * 
	 * // check visiblity of banner img if (lp.bannerIMG().isDisplayed()) {
	 * Assert.assertTrue(lp.bannerIMG().isDisplayed()); } else if
	 * (!lp.bannerIMG().isDisplayed()) {
	 * Assert.assertFalse(lp.bannerIMG().isDisplayed());
	 * System.out.println("Image is not visible"); } String phone =
	 * lp.getPhone().getText(); System.out.println(phone);
	 * 
	 * lp.getContactUs().click(); ContactUs cs = new ContactUs(driver);
	 * 
	 * cs.submitMessage();
	 * 
	 * lp.getLoginBTn().click();
	 * 
	 * LoginTest LPT = new LoginTest(driver); LPT.submitLogin();
	 * 
	 * }
	 */

	@Test
	public void bannerVisibility() {

		// check visiblity of banner img

		Assert.assertTrue(lp.bannerIMG().isDisplayed(), "Image is visible");
		System.out.println(lp.bannerIMG().getText());

	}

	@Test
	public void phoneVisibility() {
		Assert.assertTrue(lp.getPhone().isDisplayed(), "Contact number is visible");
		System.out.println(lp.getPhone().getText());

	}

	@Test
	public void contactsUsVisiblity() {
		Assert.assertTrue(lp.getContactUs().isDisplayed(), "ContactUS button is visible");
		System.out.println(lp.getContactUs().getText());

	}

	@Test
	public void sigInVisiblity() {
		Assert.assertTrue(lp.getLoginBTn().isDisplayed(), "SigIn button is visible");
		System.out.println(lp.getLoginBTn().getText());
	}

	@Test
	public void ContactUSBtn() {
		String title = "Contact us - My Store";
		lp.getContactUs().click();
		Assert.assertEquals(title, driver.getTitle(), "ContactUS Page is Opened");
		lp.bannerIMG().click();
	}

	@Test
	public void SignINBtn() {
		String title = "Login - My Store";
		lp.getLoginBTn().click();
		Assert.assertEquals(title, driver.getTitle(), "Login Page is Opened");
		lp.bannerIMG().click();
	}

	@Test
	public void homeLogoVisibility() {
		Assert.assertTrue(lp.getHomeLogo().isDisplayed(), "Home Logo in header is visible");
		System.out.println(lp.getwomanNav().getText());

		String title = "My Store";
		lp.getHomeLogo().click();
		Assert.assertEquals(title, driver.getTitle(), "Home Page is Opened");

	}

	@Test
	public void searchFeildVisibility() {
		Assert.assertTrue(lp.getSearchField().isDisplayed(), "Search feild is visible");

		Assert.assertTrue(lp.getSearchBtn().isDisplayed(), "Search button is visible");
	}

	@Test
	public void searchFunctionality() {
		String title = "Search - My Store";
		lp.getSearchField().sendKeys(prop.getProperty("searchProduct"));
		lp.getSearchBtn().click();
		Assert.assertEquals(title, driver.getTitle(), "Product is searched, Page is Opened");
		lp.bannerIMG().click();
	}

	@Test
	public void navVisiblity() {
		Assert.assertTrue(lp.getwomanNav().isDisplayed(), "Woman navigation bar is visible");
		System.out.println(lp.getwomanNav().getText());
		Assert.assertTrue(lp.getdressNav().isDisplayed(), "Dress navigation bar is visible");
		System.out.println(lp.getdressNav().getText());
		Assert.assertTrue(lp.gettShirtsNav().isDisplayed(), "T-Shirts navigation bar is visible");
		System.out.println(lp.gettShirtsNav().getText());

	}

	@Test
	public void womanNavVerification() {
		String title = "Women - My Store";
		lp.getwomanNav().click();
		Assert.assertEquals(title, driver.getTitle(), "Woman Page is Opened");

		// hovering mouse on nav and than click

		Actions act = new Actions(driver);

		act.moveToElement(lp.getwomanNav()).build().perform();// mouse hover to woman nav
		act.moveToElement(lp.getw_topsNav()).click().build().perform();// mouse hover blouse nav
		title = "Tops - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Tops - My Store Page is Opened");

		act.moveToElement(lp.getwomanNav()).build().perform();// mouse hover to woman nav
		act.moveToElement(lp.getBlouseNav()).click().build().perform();// mouse hover blouse nav
		// act.keyDown(Keys.LEFT_CONTROL).click().build().perform();// opening blouse
		// nav in new tab
		title = "Blouses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Blouses - My Store Page is Opened");

		act.moveToElement(lp.getwomanNav()).build().perform();// mouse hover to woman nav
		act.moveToElement(lp.getW_tShirtsNav()).click().build().perform();
		// act.keyDown(Keys.LEFT_CONTROL).click().build().perform();
		title = "T-shirts - My Store";
		Assert.assertEquals(title, driver.getTitle(), "T-shirts - My Store Page is Opened");

		act.moveToElement(lp.getwomanNav()).build().perform();// mouse hover to woman nav
		act.moveToElement(lp.getdressNav()).click().build().perform();// mouse hover blouse nav
		title = "Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Dresses - My Store Page is Opened");

		act.moveToElement(lp.getwomanNav()).build().perform();
		act.moveToElement(lp.getCasualDressNav()).click().build().perform();
		// act.keyDown(Keys.LEFT_CONTROL).click().build().perform();
		title = "Casual Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Casual Dresses - My Store Page is Opened");

		act.moveToElement(lp.getwomanNav()).build().perform();
		act.moveToElement(lp.getEveDressNav()).click().build().perform();
		title = "Evening Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Evening Dresses - My Store Page is Opened");

		act.moveToElement(lp.getwomanNav()).build().perform();
		act.moveToElement(lp.getsummerDressNav()).click().build().perform();
		title = "Summer Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Summer Dresses - My Store Page is Opened");

		
		Assert.assertTrue(lp.getw_designerNavBanner().isDisplayed(), "Designer Collection banner in Woman Nav is visible");
		System.out.println(lp.getwomanNav().getText());


		Assert.assertTrue(lp.getW_shoesNavBanner().isDisplayed(), "Shoes Collection banner in Woman Nav is visible");
		System.out.println(lp.getwomanNav().getText());

	}

	@Test
	public void DressNavVerification() {
		String title = "Dresses - My Store";
		lp.getdressNav().click();
		Assert.assertEquals(title, driver.getTitle(), "Dresses Page is Opened");
		
		
		Actions act = new Actions(driver);

		act.moveToElement(lp.getdressNav()).build().perform();// mouse hover to dress nav
		act.moveToElement(lp.getd_casualDressNav()).click().build().perform();// mouse hover blouse nav
		title = "Casual Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Casual Dresses - My Store Page is Opened");


		act.moveToElement(lp.getdressNav()).build().perform();// mouse hover to dress nav
		act.moveToElement(lp.getd_eveDressNav()).click().build().perform();// mouse hover blouse nav
		title = "Evening Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Evening Dresses - My Store Page is Opened");


		act.moveToElement(lp.getdressNav()).build().perform();// mouse hover to dress nav
		act.moveToElement(lp.getd_sumDressNav()).click().build().perform();// mouse hover blouse nav
		title = "Summer Dresses - My Store";
		Assert.assertEquals(title, driver.getTitle(), "Summer Dresses - My Store Page is Opened");

	}

	@Test
	public void tShirtsNavClick() {
		String title = "T-shirts - My Store";
		lp.gettShirtsNav().click();
		Assert.assertEquals(title, driver.getTitle(), "T-Shirts Page is Opened");
		lp.bannerIMG().click();
	}

	@AfterTest
	public void tearDown() {

		driver.close();
		driver = null;
	}

}
