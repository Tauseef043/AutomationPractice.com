package automation.AutomationPractice;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HeaderPageOB;
import pageObject.HomePageOB;
import resources.base;

public class HomePageTest2 extends base{
	private HomePageOB hp;

	@BeforeTest
	public void initialization() throws IOException {

		driver = initializeDriver();
		
		driver.get(prop.getProperty("baseURL"));
		hp = new HomePageOB(driver);
	
	}
	
	@Test
	public void leftBannerImageVisibility()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		int i=1,j=0;
		while(j<=1)
		{
			while(i<=3)
			{
				if(hp.getleftBannerIMG1().getAttribute("alt").contains("sample-1"))
				{

					System.out.println("Banner is visible"+ hp.getleftBannerIMG1().isDisplayed());
					Assert.assertTrue(hp.getleftBannerIMG1().isDisplayed(), "left banner1 img is displayed");
					Assert.assertTrue(hp.getleftBannerTitle1().isDisplayed(), "left banner1 title is displayed");
					Assert.assertTrue(hp.getleftBannerDesc1().isDisplayed(), "left banner1 Description is displayed");
					Assert.assertTrue(hp.getleftBannerShopBtn1().isDisplayed(), "left banner1 shop button is displayed");
				}
				else if(hp.getleftBannerIMG2().getAttribute("alt").contains("sample-2"))
				{

					System.out.println("Banner is visible"+ hp.getleftBannerIMG1().isDisplayed());
					Assert.assertTrue(hp.getleftBannerIMG2().isDisplayed(), "left banner2 img is displayed");
					Assert.assertTrue(hp.getleftBannerTitle2().isDisplayed(), "left banner2 title is displayed");
					Assert.assertTrue(hp.getleftBannerDesc2().isDisplayed(), "left banner2 Description is displayed");
					Assert.assertTrue(hp.getleftBannerShopBtn2().isDisplayed(), "left banner2 shop button is displayed");
				}
				else if(hp.getleftBannerIMG3().getAttribute("alt").contains("sample-3"))
				{

					System.out.println("Banner is visible"+ hp.getleftBannerIMG1().isDisplayed());
					Assert.assertTrue(hp.getleftBannerIMG3().isDisplayed(), "left banner3 img is displayed");
					Assert.assertTrue(hp.getleftBannerTitle3().isDisplayed(), "left banner3 title is displayed");
					Assert.assertTrue(hp.getleftBannerDesc3().isDisplayed(), "left banner3 Description is displayed");
					Assert.assertTrue(hp.getleftBannerShopBtn3().isDisplayed(), "left banner3 shop button is displayed");
				}
				switch(j)
				{
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
	
	public void leftBannerTitleVisibility()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		int i=1,j=0;
		while(j<=1)
		{
			while(i<=3)
			{
				if(hp.getleftBannerIMG1().getAttribute("alt").contains("sample-1"))
				{

					Assert.assertEquals(hp.getleftBannerDesc1().getText(),"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin tristique in tortor et dignissim. Quisque non tempor leo. Maecenas egestas sem elit");

							}
				else if(hp.getleftBannerIMG2().getAttribute("alt").contains("sample-2"))
				{

					Assert.assertEquals(hp.getleftBannerDesc2().getText(),"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin tristique in tortor et dignissim. Quisque non tempor leo. Maecenas egestas sem elit");

			
				}
				else if(hp.getleftBannerIMG3().getAttribute("alt").contains("sample-3"))
				{
					Assert.assertEquals(hp.getleftBannerDesc3().getText(),"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin tristique in tortor et dignissim. Quisque non tempor leo. Maecenas egestas sem elit");


				}
				switch(j)
				{
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
	public void leftBannerDescriptionVisibility()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		int i=1,j=0;
		while(j<=1)
		{
			while(i<=3)
			{
				if(hp.getleftBannerIMG1().getAttribute("alt").contains("sample-1"))
				{

					Assert.assertTrue(hp.getleftBannerDesc1().isDisplayed(), "left banner1 Description is displayed");
				}
				else if(hp.getleftBannerIMG2().getAttribute("alt").contains("sample-2"))
				{
					Assert.assertTrue(hp.getleftBannerDesc2().isDisplayed(), "left banner2 Description is displayed");
				}
				else if(hp.getleftBannerIMG3().getAttribute("alt").contains("sample-3"))
				{
					Assert.assertTrue(hp.getleftBannerDesc3().isDisplayed(), "left banner3 Description is displayed");
				}
				switch(j)
				{
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
	
	
	

}
