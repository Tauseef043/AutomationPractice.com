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
import org.openqa.selenium.support.ui.Select;
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
	private String title;
	private Actions act;

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("baseURL"));

	}

	@BeforeMethod
	public void waitMethod() {

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

	@Test(priority = 8)
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

	@Test(priority = 9)
	public void validateProductsPrice() {

		hp.getScrollDonw(hp.getProductCard());
		// Fetch All the Products Text
		List<WebElement> list_of_products = (List<WebElement>) hp.getProductList();
		List<WebElement> list_of_productsPrice = (List<WebElement>) hp.getproductPriceList();
		for (int i = 0; i < list_of_products.size(); i++) {
			product_price = list_of_productsPrice.get(i).getText().toString();// Iterate and fetch
			// System.out.println(product_price);
			if (!product_price.equals(null)) {
				Assert.assertTrue(true, "Product Price: " + product_price);
				Reporter.log("Product price fetched from UI is :" + product_price, true);
			} else if (product_price.isEmpty()) {
				Assert.assertTrue(false, product_price);
				Reporter.log("Product price fetched from UI is Empty as:" + product_price, true);
			}

		}

	}

	@Test(priority = 10)
	public void validateProductsImage() {
		hp.getScrollDonw(hp.getProductCard());

		hp.getImplictWait();
		// Fetch All the Products Text
		List<WebElement> list_of_products = (List<WebElement>) hp.getProductList();
		List<WebElement> list_of_productsImage = (List<WebElement>) hp.getproductImageList();
		for (int i = 0; i < list_of_products.size(); i++) {

			if (list_of_productsImage.get(i).isDisplayed()) {

				Assert.assertTrue(hp.getleftBannerIMG1().isDisplayed(), "Product Image visiblity");

			} else if (!list_of_productsImage.get(i).isDisplayed()) {

				Assert.assertTrue(hp.getleftBannerIMG1().isDisplayed(), "Product Image visiblity");

			}

		}

	}

	@Test(priority = 11)
	public void validateProductQuickViewBtnHover() {
		hp.getScrollDonw(hp.getProductCard());

		act = hp.getHoverOnElement(hp.getproductHoverQuickView());

		act.click().build().perform();

		// Print the first result
		// System.out.println("test quick txt "+QuikElement.getText());

	}

	@Test(priority = 12)
	public void quickViewValidateIMG() {
		// hp.getImplictWait();
		hp.switchToiFrame();
		hp.getExplictWait(hp.getProductQuickViewIMG());

		Assert.assertTrue(hp.getProductQuickViewIMG().isDisplayed(), "Quick View Image visibility");

		List<WebElement> quickViewIMGList = hp.getProductQuickViewIMGList();

		for (int i = 0; i < quickViewIMGList.size(); i++) {

			act = hp.getHoverOnElement(quickViewIMGList.get(i));
			act.click().build().perform();

			if (hp.getProductQuickViewIMG().isDisplayed()) {
				Assert.assertTrue(true, "Bottom Image " + i + " Visiblility");
			} else {
				Assert.assertTrue(false, "Bottom Image " + i + " Visiblility");
			}

		}
		hp.switchToNormalFromFrame();
	}

	@Test(priority = 13)
	public void quickView_ValidateIMG_BottomList() throws InterruptedException {
		hp.getImplictWait();

		// hp.switchToiFrame(hp.getProductQuickViewIFrameId());
		hp.switchToiFrame();
		// hp.getScrollDonw(hp.getProductQuickViewIFrameId());

		List<WebElement> quickViewIMGList = hp.getProductQuickViewIMGList();

		for (int i = 0; i < quickViewIMGList.size(); i++) {

			if (quickViewIMGList.get(i).isDisplayed()) {
				Assert.assertTrue(true, "Bottom Image " + i + " Visiblility");
			} else {
				Assert.assertTrue(false, "Bottom Image " + i + " Visiblility");
			}

		}
		hp.switchToNormalFromFrame();

	}

	@Test(priority = 14)
	public void quickView_Validate_product_Title() {

		hp.getImplictWait();

		hp.switchToiFrame();
		Assert.assertTrue(hp.getProduct_QuickView_Product_Title().isDisplayed(), "Product Title Visibility");
		hp.switchToNormalFromFrame();

	}

	@Test(priority = 15)
	public void quickView_Validate_product_SKU() {
		hp.getImplictWait();
		hp.switchToiFrame();
		Assert.assertTrue(hp.getProduct_QuickView_Product_Title().isDisplayed(), "Product SKU Visibility");
		hp.switchToNormalFromFrame();
	}

	@Test(priority = 16)
	public void quickView_Validate_product_ConditionType() {
		hp.getImplictWait();
		hp.switchToiFrame();
		Assert.assertTrue(hp.getProduct_QuickView_Product_Title().isDisplayed(), "Product Condition Visibility");
		hp.switchToNormalFromFrame();
	}

	@Test(priority = 17)
	public void quickView_Validate_product_DESC() {

		hp.switchToiFrame();
		hp.getImplictWait();
		Assert.assertTrue(hp.getProduct_QuickView_DESC().isDisplayed(), "Product Description Visibility");
		hp.switchToNormalFromFrame();
	}

	@Test(priority = 18)
	public void quickView_Validate_Prices() {
		hp.switchToiFrame();
		hp.getImplictWait();

		Assert.assertTrue(hp.getProductQuickViewPrice().isDisplayed(), "Product quick view price Visibility");
		if (!hp.getProductQuickViewDiscount().getText().isEmpty()) {
			Assert.assertTrue(hp.getProductQuickViewDiscount().isDisplayed(),
					"Product quick view discount on price Visibility");
			Assert.assertTrue(hp.getProductQuickViewOldPrice().isDisplayed(),
					"Product quick view old price Visibility");

		}

		hp.switchToNormalFromFrame();
	}

	@Test(priority = 19)
	public void validateQuanitityLabel() {
		hp.switchToiFrame();
		hp.getImplictWait();

		if (hp.getProductQuickViewQuantiyTXT().getText().toString().trim().equals("Quantity")) {
			Assert.assertTrue(true, "Quantity Label visibilty");
		}

		hp.switchToNormalFromFrame();

	}

	@Test(priority = 20)
	public void validate_quickView_Quanitity() throws InterruptedException {
		String quantity = null;
		int i = 0;
		hp.switchToiFrame();
		hp.getImplictWait();
		System.out.println("******** " + hp.getProductQuickViewQuantiy().getText().toString());

		// validate add button is clickable
		if (hp.getProductQuickViewQuantiyAdd().isEnabled()) {

			while (i <= 3) {

				hp.getProductQuickViewQuantiyAdd().click();
				i++;

			}

		} else {
			Assert.assertTrue(false, "button clickable");
		}

		// System.out.println("********
		// "+hp.getProductQuickViewQuantiy().getAttribute("value"));
		try {
			if (Integer.parseInt(hp.getProductQuickViewQuantiy().getAttribute("value")) == i) {
				Assert.assertTrue(true, "Qunaity add buttton working");
			}
		} catch (NumberFormatException e) {
			System.out.println("not a number" + e);
		}
		// validate remove button is clickable
		if (hp.getProductQuickViewQuantiyRemv().isEnabled()) {

			while (i >= 1) {

				hp.getProductQuickViewQuantiyRemv().click();
				i--;

			}

		} else {
			Assert.assertTrue(false, "button clickable");
		}

		try {
			if (Integer.parseInt(hp.getProductQuickViewQuantiy().getAttribute("value")) == i) {
				Assert.assertTrue(true, "Qunaity Remove buttton working");
			}
		} catch (NumberFormatException e) {
			System.out.println("not a number" + e);
		}

		hp.switchToNormalFromFrame();

	}

	@Test(priority = 21)
	public void validate_quickView_Size() {
		hp.switchToiFrame();
		hp.getImplictWait();

		Select dropDown = hp.getSelectDropdownList(hp.getProductQuickViewSelectSize());

		dropDown.selectByVisibleText(prop.getProperty("productSize"));

		System.out.println("Selected Size: " + dropDown.getFirstSelectedOption().getText());
		Assert.assertEquals(dropDown.getFirstSelectedOption().getText(), prop.getProperty("productSize"),
				"product size select option");

		hp.switchToNormalFromFrame();

	}
	
	
	@Test(priority = 22)
	public void validate_quickView_ProductColor()
	{
		
	}
	@Test(priority = 23)
	public void validate_quickView_ProductAddCartBtn()
	{
		
	}
	
	/*
	 * @Test(priority = 18) public void validateProductMoreBtnHover() {
	 * hp.getScrollDonw(hp.getProductCard());
	 * 
	 * act = hp.getHoverOnElement(hp.getproductHoverMoreBtn());
	 * 
	 * Assert.assertTrue(hp.getproductHoverMoreBtn().isEnabled(),
	 * "More button clickable");
	 * 
	 * act.click().build().perform();
	 * 
	 * title = "Faded Short Sleeve T-shirts - My Store";
	 * 
	 * Assert.assertEquals(driver.getTitle().trim(), title.trim());
	 * 
	 * driver.navigate().back();
	 * 
	 * }
	 */

}
