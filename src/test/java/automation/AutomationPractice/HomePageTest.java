package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class HomePageTest extends base {
	private HomePageOB hp;

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();

		driver.get(prop.getProperty("baseURL"));
		hp = new HomePageOB(driver);

	}

	@BeforeMethod
	public void waitMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test
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

	@Test
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

	@Test
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

	@Test
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

	@Test
	public void rightUpBannerVisiblity() {
		Assert.assertTrue(hp.getrightUpBanner().isDisplayed(), "Right up banner is visible ");

	}

	@Test
	public void rightDownBannerVisiblity() {
		Assert.assertTrue(hp.getrightDownBanner().isDisplayed(), "Right down banner is visible ");

	}

	@Test
	public void productTabsVerification() {
		Assert.assertTrue(hp.getPopularProdTab().isEnabled(), "Popular Product Tab ");
		hp.getBestSellerProdTab().click();

		Assert.assertTrue(hp.getBestSellerProdTab().isEnabled(), "Popular Product Tab ");
		hp.getBestSellerProdTab().click();
	}

	@Test
	public void productVerification() {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		// Identify the WebElement which will appear after scrolling down

		WebElement element = hp.getproductIMG();
		// now execute query which actually will scroll until that element is not
		// appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);", element);

		Assert.assertTrue(hp.getproductIMG().isDisplayed(), "Product Image visiblity");
		Assert.assertTrue(hp.getproductTitle().isDisplayed(), "Product Title visiblity");
		Assert.assertTrue(hp.getproductPrice().isDisplayed(), "Product price visiblity");
	}


	@Test
	public void productHoverQuickViewVerification() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
/*		// Create instance of Javascript executor
		JavascriptExecutor je = (JavascriptExecutor) driver;
		// Identify the WebElement which will appear after scrolling down

		WebElement element = hp.getproductPrice();
		// now execute query which actually will scroll until that element is not
		// appeared on page.
		je.executeScript("arguments[0].scrollIntoView(true);", element);
*/
		Actions act = new Actions(driver);
		act.moveToElement(hp.getproductHoverQuickView()).build().perform();

		Assert.assertTrue(hp.getproductHoverQuickView().isEnabled(), "Product quick view button is visible");
		hp.getproductHoverQuickView().click();

	}

}
