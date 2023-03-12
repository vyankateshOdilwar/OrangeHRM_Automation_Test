package com.web.pom_orangehrm;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	public WebElement profileMenu;

	@FindBy(linkText = "About")
	public WebElement about;

	@FindBy(xpath = "//div[@class='oxd-grid-item oxd-grid-item--gutters']")
	public List <WebElement> companyDetails;
	
	@FindBy(xpath = "//img[@alt='client brand banner']")
	public WebElement homepageLogo;
	
	@FindBy (linkText = "My Info")
	public WebElement myInfoSection;
	
	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		System.out.println("homePage elements loaded...");
	}

}
