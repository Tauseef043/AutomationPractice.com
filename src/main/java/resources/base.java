package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {

	public WebDriver driver;
	public Properties prop;

	private WebElement expectedElement;
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\chromedriver.exe");

			ChromeOptions options = new ChromeOptions(); // for headless runing browser open nai hoga

			options.addArguments("window-size=1366,768");

			if (browserName.contains("headless")) {
				options.addArguments("headless");
			}
			// execute browser

			driver = new ChromeDriver(options);
		} else if (browserName.contains("firefox")) {

		} else if (browserName.contains("IE")) {

			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;

	}

	public void swithTo_AnotherTab() {
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		// switch to open tab
		driver.switchTo().window(w.get(1));

	}

	public void getImplictWait() {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		catch (Exception e) {
			System.out.println(e.toString());
		}

	}
	public void getScrollDonw(WebElement element) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);

	}
	public Actions getHoverOnElement(WebElement element) {
		Actions act = new Actions(driver);

		act.moveToElement(element).build().perform();

		getImplictWait();
		return act;
	}

	public WebElement getExplictWait(WebElement element) {

		expectedElement = new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(element));

		return expectedElement;

	}

}
