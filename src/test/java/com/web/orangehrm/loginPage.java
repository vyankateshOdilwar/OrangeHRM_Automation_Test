package com.web.orangehrm;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.web.orangehrm.ListenerClass.class)
public class loginPage extends setupClass {
	
	com.web.pom_orangehrm.loginPage ref;
	
	@Test(priority = 1)
	void initElements() {
		setup("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ref = new com.web.pom_orangehrm.loginPage(driver);
	}

	@Test(priority = 2)S
	void loginTest() throws InterruptedException {
		ref.username.sendKeys("Admin");
		ref.password.sendKeys("admin123");
		ref.button.click();
	}

}
