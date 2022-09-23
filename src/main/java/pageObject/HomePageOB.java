package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageOB {

	// banners locators
	private By leftBanner = By.xpath("//ul[@id='homeslider']");
	private By leftBannerIMG1 = By.xpath("//div[@id='homepage-slider']/div/div[1]/ul/li[2]/a/img");
	private By leftBannerIMG2 = By.xpath("//ul[@id='homeslider']/li[3]/a/img");
	private By leftBannerIMG3 = By.xpath("//ul[@id='homeslider']/li[4]/a/img");

	private By leftBannerTitle1 = By.xpath("//ul[@id='homeslider']/li[2]/div/h2");
	private By leftBannerTitle2 = By.xpath("//ul[@id='homeslider']/li[3]/div/h2");
	private By leftBannerTitle3 = By.xpath("//ul[@id='homeslider']/li[4]/div/h2");

	private By leftBannerDesc1 = By.xpath("//ul[@id='homeslider']/li[2]/div/p[1]");
	private By leftBannerDesc2 = By.xpath("//ul[@id='homeslider']/li[3]/div/p[1]");
	private By leftBannerDesc3 = By.xpath("//ul[@id='homeslider']/li[4]/div/p[1]");
	private By leftBannerShopBtn1 = By.xpath("//ul[@id='homeslider']/li[2]/div/p[1]");
	private By leftBannerShopBtn2 = By.xpath("//ul[@id='homeslider']/li[3]/div/p[1]");
	private By leftBannerShopBtn3 = By.xpath("//ul[@id='homeslider']/li[4]/div/p[1]");

	private By rightUpBanner = By.xpath("//div[@id='htmlcontent_top']/ul/li[1]/a/img");
	private By rightDownBanner = By.xpath("//div[@id='htmlcontent_top']/ul/li[2]/a/img");

	private By leftBannerPrevBtn = By.xpath("//div[@id='homepage-slider']/div/div[2]/div/a[1]");
	private By leftBannerNextBtn = By.xpath("//div[@id='homepage-slider']/div/div[2]/div/a[1]");

	// products tabs
	private By PopularProdTab = By.xpath("//ul[@id='home-page-tabs']/li[1]/a");
	private By bestSellerProdTab = By.xpath("//ul[@id='home-page-tabs']/li[2]/a");

	// product locators
	private By productIMG = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img");
	private By productHoverQuickView = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[1]/div/a[2]");
	private By productView = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[1]/div/div[1]/a");
	private By productTitle = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[2]/h5/a");
	private By productPrice = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[2]/div[1]/span");
	private By productHoveraddToCart = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]");
	private By productHoverMoreBtn = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]");
	private By productHoverPrice = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[1]/div/div[2]/span");
	private WebDriver driver;

	public HomePageOB(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getleftBannerIMG1() {
		return driver.findElement(leftBannerIMG1);
	}

	public WebElement getleftBannerIMG2() {
		return driver.findElement(leftBannerIMG2);
	}

	public WebElement getleftBannerIMG3() {
		return driver.findElement(leftBannerIMG3);
	}

	public WebElement getleftBannerTitle1() {

		return driver.findElement(leftBannerTitle1);
	}

	public WebElement getleftBannerDesc1() {
		return driver.findElement(leftBannerDesc1);
	}

	public WebElement getleftBannerTitle2() {

		return driver.findElement(leftBannerTitle2);
	}

	public WebElement getleftBannerDesc2() {
		return driver.findElement(leftBannerDesc2);
	}

	public WebElement getleftBannerTitle3() {

		return driver.findElement(leftBannerTitle3);
	}

	public WebElement getleftBannerDesc3() {
		return driver.findElement(leftBannerDesc3);
	}

	public WebElement getleftBannerShopBtn1() {
		return driver.findElement(leftBannerShopBtn1);
	}

	public WebElement getleftBannerShopBtn2() {
		return driver.findElement(leftBannerShopBtn2);
	}

	public WebElement getleftBannerShopBtn3() {
		return driver.findElement(leftBannerShopBtn3);
	}

	public WebElement getrightUpBanner() {
		return driver.findElement(rightUpBanner);
	}

	public WebElement getrightDownBanner() {
		return driver.findElement(rightDownBanner);
	}

	public WebElement getleftBannerPrevBtn() {
		return driver.findElement(leftBannerPrevBtn);
	}

	public WebElement getleftBannerNextBtn() {
		return driver.findElement(leftBannerNextBtn);
	}

	public WebElement getLeftBanner() {
		return driver.findElement(leftBanner);
	}

	public WebElement getPopularProdTab() {
		return driver.findElement(PopularProdTab);
	}

	public WebElement getBestSellerProdTab() {
		return driver.findElement(bestSellerProdTab);
	}

	public WebElement getproductIMG() {
		return driver.findElement(productIMG);
	}

	public WebElement getproductHoverQuickView() {
		return driver.findElement(productHoverQuickView);
	}

	public WebElement getproductView() {
		return driver.findElement(productView);
	}

	public WebElement getproductTitle() {
		return driver.findElement(productTitle);
	}

	public WebElement getproductPrice() {
		return driver.findElement(productPrice);
	}

	public WebElement getproductHoveraddToCart() {
		return driver.findElement(productHoveraddToCart);
	}

	public WebElement getproductHoverMoreBtn() {
		return driver.findElement(productHoverMoreBtn);
	}

	public WebElement getproductHoverPrice() {
		return driver.findElement(productHoverPrice);
	}
}
