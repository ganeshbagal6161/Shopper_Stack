package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement emailTF;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPassword() {
		return password;
	}

	
	public WebElement getLoginBtn() {
		return loginBtn;
	}


}
