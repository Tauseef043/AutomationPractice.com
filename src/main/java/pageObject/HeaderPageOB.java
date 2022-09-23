package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderPageOB {
	public WebDriver driver;

	By topBanner = By.cssSelector("div[class='banner']");
	By ContactUS = By.id("contact-link");
	By loginBtn = By.xpath("//a[contains(text(),'Sign in')]");
	By phoneTxt = By.xpath("//span[@class='shop-phone']");
	By womanNav = By.xpath("//div[@id='block_top_menu']/ul/li[1]");
	By dressNav = By.xpath("//div[@id='block_top_menu']/ul/li[2]");
	By tShirtsNav = By.xpath("//div[@id='block_top_menu']/ul/li[3]");
	By homeLogo = By.xpath("//div[@id='header_logo']/a");
	By searchField = By.xpath("//input[@id='search_query_top']");
	By searchBtn = By.xpath("//form[@id='searchbox']/button[1]");

	By w_EveDressNav = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]/a");
	By w_blouseNav = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
	By w_casualDressNav = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a");
	By w_summerDressNav = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a");
	By w_tShirtsNav=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a");
	By w_topsNav=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/a");
	By w_dressNav=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
	By w_designerNavBanner=By.xpath("//li[@id='category-thumbnail']/div[1]/img");
	By w_shoesNavBanner=By.xpath("//li[@id='category-thumbnail']/div[2]/img");
	
	By d_casualDressNav=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a");
	By d_eveDressNav=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a");
	By d_sumDressNav=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a");

	public HeaderPageOB(WebDriver driver) {
		this.driver = driver;

		System.out.println(driver.getTitle());
	}

	public WebElement getPhone() {
		return driver.findElement(phoneTxt);
	}

	public WebElement bannerIMG() {
		return driver.findElement(topBanner);
	}

	public WebElement getContactUs() {
		return driver.findElement(ContactUS);
	}

	public WebElement getLoginBTn() {
		return driver.findElement(loginBtn);
	}

	public WebElement getwomanNav() {
		return driver.findElement(womanNav);
	}

	public WebElement getdressNav() {
		return driver.findElement(dressNav);
	}

	public WebElement gettShirtsNav() {
		return driver.findElement(tShirtsNav);
	}

	public WebElement getHomeLogo() {
		return driver.findElement(homeLogo);
	}

	public WebElement getSearchField() {
		return driver.findElement(searchField);
	}

	public WebElement getSearchBtn() {
		return driver.findElement(searchBtn);
	}

	public WebElement getEveDressNav()
	{
		return driver.findElement(w_EveDressNav);
	}

	public WebElement getBlouseNav()
	{
		return driver.findElement(w_blouseNav);
	}
	public WebElement getCasualDressNav()
	{
		return driver.findElement(w_casualDressNav);
	}
	public WebElement getsummerDressNav()
	{
		return driver.findElement(w_summerDressNav);
	}
	public WebElement getW_tShirtsNav()
	{
		return driver.findElement(w_tShirtsNav);
	}

	public WebElement getw_topsNav()
	{
		return driver.findElement(w_topsNav);
	}
	public WebElement getw_dressNav()
	{
		return driver.findElement(w_dressNav);
	}
	public WebElement getw_designerNavBanner()
	{
		return driver.findElement(w_designerNavBanner);
	}
	
	public WebElement getW_shoesNavBanner()
	{
		return driver.findElement(w_shoesNavBanner);
	}
	
	public WebElement getd_casualDressNav()
	{
		return driver.findElement(d_casualDressNav);
	}
	
	public WebElement getd_eveDressNav()
	{
		return driver.findElement(d_eveDressNav);
	}
	public WebElement getd_sumDressNav()
	{
		return driver.findElement(d_sumDressNav);
	}
}
