package com.ecommerce.flipkart.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericCommonMethods {

	public static WebDriver launchFirefoxBrowser(String url){
		System.setProperty("webdriver.gecko.driver","G:\\Kiran\\Java\\gitWorkSpace\\JavaProjectFlipkart\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static WebDriver launchChromeBrowser(String url){
		System.setProperty("webdriver.chrome.driver","G:\\Kiran\\Java\\gitWorkSpace\\JavaProjectFlipkart\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	public static void wait_for_element_to_be_clickable(WebDriver driver,WebElement element){
		WebDriverWait wait = new WebDriverWait(driver,60);
		try{
			wait.until(ExpectedConditions.elementToBeClickable(element));	
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
	
	public static void wait_for_element_to_be_visible(WebDriver driver,WebElement element){
		WebDriverWait wait = new WebDriverWait(driver,60);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
	
}
