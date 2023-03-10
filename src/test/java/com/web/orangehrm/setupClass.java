package com.web.orangehrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setupClass {
	
public static WebDriver driver;

	  public void setup(String browser, String URL) {
		  
		  if(browser.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			  driver.get(URL);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		  } else if(browser.equalsIgnoreCase("edge")) {
			  WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
			  driver.get(URL);
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		  }
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	  }
	  
	  @AfterSuite
	  void tearDown() {
		  driver.quit();
	  }
	  	
}
