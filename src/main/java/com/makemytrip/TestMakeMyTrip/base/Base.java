package com.makemytrip.TestMakeMyTrip.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	Properties properties;
	public WebDriver driver;
	String url=null;
	static String currentDir=System.getProperty("user.dir");
	String configFilePath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\makemytrip\\TestMakeMyTrip\\config\\config.properties";
	String driverPath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\makemytrip\\TestMakeMyTrip\\driver\\chromedriver.exe";
	
	public Base(){
		  properties=new Properties();
		  
		try {
			
			String path=configFilePath;
			properties.load(new FileReader(path));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		}
	
	



public void init() {
	System.setProperty("webdriver.chrome.driver",driverPath);
	driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/flights/");
	driver.manage().window().maximize();
}
	
}
