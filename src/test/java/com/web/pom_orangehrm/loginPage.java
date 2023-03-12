package com.web.pom_orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	@FindBy (xpath="//input[@name='username']")
	public WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	public WebElement button;
	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("loginPage elements loaded...");
	}


	
}
