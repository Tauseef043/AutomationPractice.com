package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class HomePageTest extends base {
	private HomePageOB hp;
	private JavascriptExecutor je = (JavascriptExecutor) driver;
	private String product_name;
	private String product_price;
	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("baseURL"));
	

	}

	@BeforeMethod
	public void waitMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp = new HomePageOB(driver);

	}

	@Test(priority = 1)
	public void leftBannerImageVisibility() {

		int i = 1, j = 0;
		while (j <= 1) {
			while (i <= 3) {

				if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -779px;")) {
					Assert.assertTrue(hp.getleftBannerIMG1().isDisplayed(), "left banner1 img is displayed");

				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -1558px;")) {

					Assert.assertTrue(hp.getleftBannerIMG2().isDisplayed(), "left banner2 img is displayed");

				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -2337px;")) {

					Assert.assertTrue(hp.getleftBannerIMG3().isDisplayed(), "left banner3 img is displayed");

				}

				switch (j) {
				case 0:
					Assert.assertTrue(hp.getleftBannerPrevBtn().isEnabled(), "left banner3 previous button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				case 1:
					Assert.assertTrue(hp.getleftBannerNextBtn().isEnabled(), "left banner3 Next button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				}

				i++;
			}
			j++;
		}

	}

	@Test(priority = 2)
	public void leftBannerTitleVisibility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int i = 1, j = 0;
		while (j <= 1) {
			while (i <= 3) {

				if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -779px;")) {
					Assert.assertTrue(hp.getleftBannerTitle1().isDisplayed(), "Left banner1 title is visible");

				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -1558px;")) {

					Assert.assertTrue(hp.getleftBannerTitle2().isDisplayed(), "Left banner2 title is visible");

				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -2337px;")) {

					Assert.assertTrue(hp.getleftBannerTitle3().isDisplayed(), "Left banner3 title is visible");

				}

				switch (j) {
				case 0:
					Assert.assertTrue(hp.getleftBannerPrevBtn().isEnabled(), "left banner3 previous button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				case 1:
					Assert.assertTrue(hp.getleftBannerNextBtn().isEnabled(), "left banner3 Next button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				}

				i++;
			}
			j++;
		}

	}

	@Test(priority = 3)
	public void leftBannerDescriptionVisibility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int i = 1, j = 0;
		while (j <= 1) {
			while (i <= 3) {
				if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -779px;")) {

					Assert.assertTrue(hp.getleftBannerDesc1().isDisplayed(), "left banner1 Description is displayed");
				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -1558px;")) {
					Assert.assertTrue(hp.getleftBannerDesc2().isDisplayed(), "left banner2 Description is displayed");
				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -2337px;")) {
					Assert.assertTrue(hp.getleftBannerDesc3().isDisplayed(), "left banner3 Description is displayed");
				}
				switch (j) {
				case 0:
					Assert.assertTrue(hp.getleftBannerPrevBtn().isEnabled(), "left banner3 previous button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				case 1:
					Assert.assertTrue(hp.getleftBannerNextBtn().isEnabled(), "left banner3 Next button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				}

				i++;
			}
			j++;
		}

	}

	@Test(priority = 4)
	public void leftBannerShopBTNVisibility() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		int i = 1, j = 0;
		while (j <= 1) {
			while (i <= 3) {
				if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -779px;")) {

					Assert.assertTrue(hp.getleftBannerShopBtn1().isDisplayed(),
							"left banner1 shop button is displayed");
				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -1558px;")) {
					Assert.assertTrue(hp.getleftBannerShopBtn2().isDisplayed(),
							"left banner2 shop button is displayed");
				} else if (hp.getLeftBanner().getAttribute("style")
						.equals("max-height: 448px; width: 515%; position: relative; left: -2337px;")) {
					Assert.assertTrue(hp.getleftBannerShopBtn3().isDisplayed(),
							"left banner3 shop button is displayed");
				}
				switch (j) {
				case 0:
					Assert.assertTrue(hp.getleftBannerPrevBtn().isEnabled(), "left banner3 previous button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				case 1:
					Assert.assertTrue(hp.getleftBannerNextBtn().isEnabled(), "left banner3 Next button is enabled");
					hp.getleftBannerPrevBtn().click();
					break;
				}

				i++;
			}
			j++;
		}

	}

	@Test(priority = 5)
	public void rightUpBannerVisiblity() {
		Assert.assertTrue(hp.getrightUpBanner().isDisplayed(), "Right up banner is visible ");

	}

	@Test(priority = 6)
	public void rightDownBannerVisiblity() {
		Assert.assertTrue(hp.getrightDownBanner().isDisplayed(), "Right down banner is visible ");

	}

	@Test(priority = 7)
	public void productTabsVerification() throws InterruptedException {

		hp.getScrollDonw(hp.getPopularProdTab());

		Assert.assertTrue(hp.getBestSellerProdTab().isEnabled(), "Best Seller Product Tab ");
		hp.getBestSellerProdTab().click();
		Thread.sleep(500);
		Assert.assertTrue(hp.getPopularProdTab().isEnabled(), "Popular Product Tab ");
		hp.getPopularProdTab().click();

	}
	@Test(priority=8)
	public void validateProductsTitle() {
		hp.getScrollDonw(hp.getProductCard());
		// Fetch All the Products Text
		List<WebElement> list_of_products = (List<WebElement>) hp.getProductList();
		List<WebElement> list_of_productsTitle = (List<WebElement>) hp.getProductTitleList();
		HashMap<Integer, String> map_final_products = new HashMap<Integer, String>();

		for (int i = 0; i < list_of_products.size(); i++) {
			product_name = list_of_productsTitle.get(i).getText().toString();

			if (!product_name.isEmpty()) {
				Assert.assertTrue(true, "Product Name: " + product_name);
				Reporter.log("Product Name  fetched as:" + product_name, true);
			} else if (product_name.isEmpty()) {
				Assert.assertTrue(true, product_name);
				Reporter.log("Product Name  fetched is Empty  as:" + product_name, true);
			}

		}

	}

	@Test(priority=10)
	public void validateProductsPrice() {

		hp.getScrollDonw(hp.getProductCard());
		// Fetch All the Products Text
		List<WebElement> list_of_products = (List<WebElement>) hp.getProductList();
		List<WebElement> list_of_productsPrice = (List<WebElement>) hp.getproductPriceList();
		for (int i = 0; i < list_of_products.size(); i++) {
			product_price = list_of_productsPrice.get(i).getText().toString();// Iterate and fetch
		//System.out.println(product_price);
			if (!product_price.equals(null)) {
				Assert.assertTrue(true, "Product Price: " + product_price);
				Reporter.log("Product price fetched from UI is :" + product_price, true);
			} else if (product_price.isEmpty()) {
				Assert.assertTrue(false, product_price);
				Reporter.log("Product price fetched from UI is Empty as:" + product_price, true);
			}

		}

	}
	
	
	@Test(priority=11)
	public void validateProductsImage() {
		hp.getScrollDonw(hp.getProductCard());
		// Fetch All the Products Text
		List<WebElement> list_of_products = (List<WebElement>) hp.getProductList();
		List<WebElement> list_of_productsImage = (List<WebElement>) hp.getproductImageList();
		for (int i = 0; i < list_of_products.size(); i++) {
			

			if (list_of_productsImage.get(i).isDisplayed()) {
				
				Assert.assertTrue(hp.getleftBannerIMG1().isDisplayed(), "Product Image visiblity");

			}
			else if (!list_of_productsImage.get(i).isDisplayed()) {
				
				Assert.assertTrue(hp.getleftBannerIMG1().isDisplayed(), "Product Image visiblity");


			}

		}

	}
	
	
	/*
	 * @Test (priority = 8) public void productHoverQuickViewVerification() {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Create
	 * instance of Javascript executor JavascriptExecutor je = (JavascriptExecutor)
	 * driver; // Identify the WebElement which will appear after scrolling down
	 * 
	 * WebElement element = hp.getproductPrice(); // now execute query which
	 * actually will scroll until that element is not // appeared on page.
	 * je.executeScript("arguments[0].scrollIntoView(true);", element);
	 * 
	 * hp.getScrollDonw(hp.getProductCard()); Actions act = new Actions(driver);
	 * act.moveToElement(hp.getproductHoverQuickView()).build().perform();
	 * 
	 * Assert.assertTrue(hp.getproductHoverQuickView().isEnabled(),
	 * "Product quick view button is visible");
	 * hp.getproductHoverQuickView().click();
	 * 
	 * }
	 */
}
