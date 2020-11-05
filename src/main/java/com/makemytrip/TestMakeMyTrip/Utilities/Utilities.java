package com.makemytrip.TestMakeMyTrip.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {
	JavascriptExecutor jse;
	
	public void waitTillPageLoad(WebDriver driver) {
		jse=(JavascriptExecutor)driver;
		jse.executeScript("return document.readyState").toString().equalsIgnoreCase("complete");
	}
	
	public void scrollDownPage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
	}

}
