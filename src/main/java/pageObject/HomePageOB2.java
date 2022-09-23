package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageOB2 {

	private By leftBanner= By.xpath("//ul[@id='homeslider']");
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

	private WebDriver driver;

	public HomePageOB2(WebDriver driver) {
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
	
}
