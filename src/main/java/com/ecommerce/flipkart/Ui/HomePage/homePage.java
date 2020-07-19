package com.ecommerce.flipkart.Ui.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;
	
	public homePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@name='q']") WebElement search_txtbox;
	@FindBy(xpath="//button[@class='vh79eN']") WebElement search_Btn;
	@FindBy(xpath="(//a[text()='Mobiles & Accessories'])[2]") WebElement mobile_txt;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getSearch_txtbox() {
		return search_txtbox;
	}
	public void setSearch_txtbox(WebElement search_txtbox) {
		this.search_txtbox = search_txtbox;
	}
	public WebElement getSearch_Btn() {
		return search_Btn;
	}
	public void setSearch_Btn(WebElement search_Btn) {
		this.search_Btn = search_Btn;
	}
	public WebElement getMobile_txt() {
		return mobile_txt;
	}
	public void setMobile_txt(WebElement mobile_txt) {
		this.mobile_txt = mobile_txt;
	}
	
	
	
	
	
}
