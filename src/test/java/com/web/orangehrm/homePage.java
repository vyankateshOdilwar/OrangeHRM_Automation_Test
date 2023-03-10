package com.web.orangehrm;

import java.lang.reflect.Array;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class homePage extends setupClass{

	com.web.pom_orangehrm.homePage ref;
	@Test
	void profilecheck() {
		ref = new com.web.pom_orangehrm.homePage(driver);
		ref.profileMenu.click();
		ref.about.click();
		for (Object details:ref.companyDetails) {
			System.out.println(((WebElement) details).getText());
		}
				
	}
	
}
