package com.web.orangehrm;


import org.testng.annotations.Test;

public class loginPage extends setupClass {
	
	com.web.pom_orangehrm.loginPage ref;
	
	@Test(priority = 1)
	void initElements() {
		setup("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref = new com.web.pom_orangehrm.loginPage(driver);

	}

	@Test(priority = 2)
	void loginTest() throws InterruptedException {
		ref.username.sendKeys("Admin");
		Thread.sleep(2000);
		ref.password.sendKeys("admin123");
		Thread.sleep(2000);
		ref.button.click();
		System.out.println("logged in...");

	}



}
