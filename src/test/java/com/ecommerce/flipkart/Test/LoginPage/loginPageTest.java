package com.ecommerce.flipkart.Test.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ecommerce.flipkart.Util.GenericCommonMethods;

public class loginPageTest extends  GenericCommonMethods{
	
	WebDriver driver;
	
	@Parameters({"portalurl","username","password"})
	@BeforeTest
	public void beforeConfig(String portalurl,String username,String password){
		driver = launchChromeBrowser(portalurl);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	}
	

}
