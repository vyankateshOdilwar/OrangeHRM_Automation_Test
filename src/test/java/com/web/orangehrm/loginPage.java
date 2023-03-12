package com.web.orangehrm;


import java.util.ResourceBundle;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.web.orangehrm.ListenerClass.class)
public class loginPage extends setupClass {
	
	com.web.pom_orangehrm.loginPage loginPageRef;
	com.web.pom_orangehrm.homePage HomePageRef;
	ResourceBundle resource ;
	
	
	@Test(priority = 1)
	void initElements() {
		resource = ResourceBundle.getBundle("config");
		setup("chrome", resource.getString("URL"));
	}
	
	@Test (priority = 2, dataProvider = "testData")
	void loginTest(String username, String password) throws InterruptedException {
		loginPageRef = new com.web.pom_orangehrm.loginPage(driver);
		myWait(10);
		loginPageRef.username.sendKeys(username);
		loginPageRef.password.sendKeys(password);
		loginPageRef.button.click();
		HomePageRef = new com.web.pom_orangehrm.homePage(driver);
		myWait(10);
		if(HomePageRef.homepageLogo.isDisplayed()) {
			System.out.println("Identity matched...");
			System.out.println(username +" || "+password+ " credentials are valid.");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			
		}else {
			System.out.println("Identity mismatched...");
			System.out.println(username +" || "+password+ " credentials are invalid ");
			driver.navigate().refresh();
		}
		  driver.manage().deleteAllCookies();
	}
	
	@DataProvider(name="testData")
	Object[][] testData() {
		resource = ResourceBundle.getBundle("config");
		Object[][] data = {
				{resource.getString("USERNAME"), resource.getString("PASSWORD")},//valid username & valid password
				{resource.getString("USERNAME"),"password123"}, //valid username & invalid password
				{"username3",resource.getString("PASSWORD")}, //invalid username & valid password
				{"username4","password4"}//invalid username & invalid password
		};
		return data;
	}

}
