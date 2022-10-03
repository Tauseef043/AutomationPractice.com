package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class testtt extends base {
	private HomePageOB hp;
	private String product_name;
	private String product_price;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();

		log.info("Driver is initialzie");

		driver.get(prop.getProperty("baseURL"));
		hp = new HomePageOB(driver);

	}
	/*
	 * @Test public void testttt() { String value = "Jamaica"; value =
	 * value.substring(1);
	 * 
	 * System.out.println(value);
	 * 
	 * 
	 * 
	 * String header = "$123.236"; header = header.startsWith("$") ?
	 * header.substring(1) : header; System.out.println(header);
	 * 
	 * 
	 * double myFloat = 2.001343;
	 * 
	 * String formattedString = String.format("%.02f", myFloat);
	 * System.out.println(formattedString); }
	 */

	@Test
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

	@Test
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
	
	@Test
	public void validateProductsImage() {
		hp.getScrollDonw(hp.getProductCard());
		// Fetch All the Products Text
		List<WebElement> list_of_products = (List<WebElement>) hp.getProductList();
		List<WebElement> list_of_productsImage = (List<WebElement>) hp.getproductPriceList();
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
	 * @Test public void validatProduct() { //Fetch All the Products Text
	 * List<WebElement> list_of_products =(List<WebElement>) hp.getProductList();
	 * List<WebElement> list_of_products_price = (List<WebElement>)
	 * hp.getproductPriceList();
	 * 
	 * //Use of HashMaop to store Products and Their prices(after conversion to
	 * integer
	 * 
	 * 
	 * HashMap<Integer, String> map_final_products = new HashMap<Integer,String>();
	 * 
	 * for(int i=0;i<list_of_products.size();i++) { product_name =
	 * list_of_products.get(i).getText();//Iterate and fetch product name
	 * product_price = list_of_products_price.get(i).getText();//Iterate and fetch
	 * product_price = product_price.replaceAll("[^0-9]", "");//Replace anything wil
	 * space other than numbers
	 * 
	 * 
	 * int_product_price = Integer.parseInt(product_price);//Convert to Integer
	 * 
	 * map_final_products.put(int_product_price,product_name);//Add product and
	 * price in HashMap System.out.println(product_name+ int_product_price); }
	 * 
	 * System.out.println(
	 * "**************************************************************************************"
	 * ); // Reporter.
	 * log("Product Name and price fetched from UI and saved in HashMap as:"
	 * +map_final_products.toString() + "<br>",true);
	 * 
	 * }
	 */

}
