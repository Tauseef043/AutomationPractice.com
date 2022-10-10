package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.base.Function;

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
	
	
	
	private By productPriceList = By.xpath("//ul[@id='homefeatured']/li/div/div[2]/div[1]");
	private By productList = By.xpath("//ul[@id='homefeatured']/li");
	private By productTitleList=By.xpath("//ul[@id='homefeatured']/li/div/div[2]/h5/a");
	private By productImageList=By.xpath("//ul[@id='homefeatured']/li/div/div[1]/div[1]/a/img");
	private By productCartBtnListHover=By.xpath("//ul[@id='homefeatured']/li/div/div[2]/div[2]/a[1]");
	private By productMoreBtnListHover=By.xpath("//ul[@id='homefeatured']/li/div/div[2]/div[2]/a[2]");	
	private By productQuickBtnListHover=By.xpath("//ul[@id='homefeatured']/li/div/div[1]/div/a[2]");
	
	private By productHoveraddToCart = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]");
	private By productHoverMoreBtn = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]");
	private By productHoverPrice = By.xpath("//ul[@id='homefeatured']/li[1]/div/div[1]/div/div[2]/span");
	
	private By productCard=By.xpath("//ul[@id='homefeatured']/li[1]");
	
	
	
	private By productQuickViewIFrameId=By.xpath("//iframe[contains(@id,'fancybox-frame')]");

	
	private By productQuickViewIMG=By.id("bigpic");
	private By productQuickViewIMGList=By.xpath("//ul[@id='thumbs_list_frame']/li");
	private By productQuickViewProductTitle=By.xpath("//body[@id='product']/div/div/div[2]/h1");
	
	private By productQuickViewSKU=By.xpath("//p[@id='product_reference']");
	private By productQuickViewModel=By.xpath("//p[@id='product_reference']/label");
	private By productQuickViewCondition=By.xpath("//p[@id='product_condition']/span");
	private By productQuickViewConditionType=By.xpath("//p[@id='product_condition']/label");

	private By productQuickViewDESC=By.xpath("//div[@id='short_description_content']/p");

	private WebElement expectedElement;
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
	
	public void getScrollDonw(WebElement element)
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		
	}
	
	
	public List<WebElement> getproductMoreBtnListHover()
	{

		return driver.findElements(productMoreBtnListHover);
	}
	
	
	public List<WebElement> getProductCartBtnListHover()
	{

		return driver.findElements(productCartBtnListHover);
	}
	
	
	public List<WebElement> getProductTitleList()
	{

		return driver.findElements(productTitleList);
	}
	
	public List<WebElement> getProductList()
	{

		return driver.findElements(productList);
	}
	
	
	
	public List<WebElement> getproductQuickBtnListHover()
	{

		return driver.findElements(productQuickBtnListHover);
	}
	public List<WebElement> getproductImageList()
	{

		return driver.findElements(productImageList);
	}
	
	
	public List<WebElement> getproductPriceList()
	{
		return  driver.findElements(productPriceList);
	}
	
	public WebElement getProductCard()
	{
		return driver.findElement(productCard);
	}
	public Actions getHoverOnElement(WebElement element)
	{
		Actions act= new Actions(driver);
		
		act.moveToElement(element).build().perform();
		
		getImplictWait();
		return act;
	}
	
	public WebElement getProductQuickViewIFrameId()
	{
		return driver.findElement(productQuickViewIFrameId);
		
	}
	
	public WebElement getProductQuickViewIMG()
	{
		return driver.findElement(productQuickViewIMG);
		
	}

	public List<WebElement> getProductQuickViewIMGList()
	{
		
		return driver.findElements(productQuickViewIMGList);
	}
	public WebElement getProduct_QuickView_Product_Title()
	{
		
		return driver.findElement(productQuickViewProductTitle);
	}
	
	public void switchToiFrame()
	{
		driver.switchTo().frame(1);
			
		
	}	
	public void switchToNormalFromFrame()
	{
		driver.switchTo().defaultContent();
			
		
	}
	public WebElement getProduct_QuickView_SKU()
	{
		
		return driver.findElement(productQuickViewSKU);
	}
	public WebElement getProduct_QuickView_Model()
	{
		
		return driver.findElement(productQuickViewModel);
	}
	public WebElement getProduct_QuickView_Condition()
	{
		
		return driver.findElement(productQuickViewCondition);
	}
	public WebElement getProduct_QuickView_Condition_Type()
	{
		
		return driver.findElement(productQuickViewConditionType);
	}
	public WebElement getProduct_QuickView_DESC()
	{
		
		return driver.findElement(productQuickViewDESC);
	}
	
	public void getImplictWait()
	{
		try{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	
			 
		catch(Exception e){
				    System.out.println(e.toString());
				}
		
	}
	
	public WebElement getExplictWait(WebElement element)
	{
		
		 expectedElement = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOfElementLocated(productQuickViewIMG));
		 
		 return  expectedElement;
		
	}

	
}
