package com.ecommerce.flipkart.Test.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ecommerce.flipkart.Ui.HomePage.homePage;
import com.ecommerce.flipkart.Ui.LoginPage.loginPage;
import com.ecommerce.flipkart.Util.GenericCommonMethods;

public class homePageTest extends  GenericCommonMethods{
	
	WebDriver driver;
	loginPage lp;
	homePage hp;
	
	@BeforeTest
	public void beforeConfig(){
		 System.out.println("user directory :"+System.getProperty("user.dir"));
		driver = launchChromeBrowser(System.getProperty("portalurl"));
		lp = new loginPage(driver);
		hp = new homePage(driver);
		lp.getUsername_txtbox().sendKeys(System.getProperty("portalusername"));
		lp.getPassword_textbox().sendKeys(System.getProperty("portalpassword"));
		lp.getLogin_Btn().click();
	}
	
	@Parameters({"searchtxt"})
	@Test
	public void launchBrowser(String searchtxt){
		try {
			Thread.sleep(500);		
			wait_for_element_to_be_visible(driver, hp.getSearch_txtbox());
			hp.getSearch_txtbox().sendKeys(searchtxt);
			wait_for_element_to_be_clickable(driver, hp.getSearch_Btn());
			hp.getSearch_Btn().click();
			Thread.sleep(10000);	
			wait_for_element_to_be_visible(driver,hp.getMobile_txt());
			Assert.assertTrue(hp.getMobile_txt().isDisplayed(), "Mobile filter not available");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	@AfterMethod
	public void afterConfig(){
		driver.close();
	}
	
	
}
