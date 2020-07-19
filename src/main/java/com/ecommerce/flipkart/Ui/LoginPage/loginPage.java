package com.ecommerce.flipkart.Ui.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']") WebElement username_txtbox;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']") WebElement password_textbox;
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']") WebElement login_Btn;
	
	public loginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getUsername_txtbox() {
		return username_txtbox;
	}
	public void setUsername_txtbox(WebElement username_txtbox) {
		this.username_txtbox = username_txtbox;
	}
	public WebElement getPassword_textbox() {
		return password_textbox;
	}
	public void setPassword_textbox(WebElement password_textbox) {
		this.password_textbox = password_textbox;
	}
	public WebElement getLogin_Btn() {
		return login_Btn;
	}
	public void setLogin_Btn(WebElement login_Btn) {
		this.login_Btn = login_Btn;
	}
	
	
	
}
