package com.web.orangehrm;

import java.util.ResourceBundle;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class homePage extends setupClass{

	com.web.pom_orangehrm.homePage ref;
	ResourceBundle resource;
	com.web.pom_orangehrm.loginPage loginRef;
	
	@Test
	void profilecheck() throws InterruptedException {
		resource = ResourceBundle.getBundle("config");
		setup("chrome",resource.getString("URL"));
		loginRef = new com.web.pom_orangehrm.loginPage(driver);
		loginRef.username.sendKeys(resource.getString("USERNAME"));
		loginRef.password.sendKeys(resource.getString("PASSWORD"));
		loginRef.button.click();
		ref = new com.web.pom_orangehrm.homePage(driver);
		myWait(10);
		ref.myInfoSection.click();
		Thread.sleep(3000);
				
	}
	
}
