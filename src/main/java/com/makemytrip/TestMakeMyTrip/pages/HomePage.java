package com.makemytrip.TestMakeMyTrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.makemytrip.TestMakeMyTrip.base.Base;

public class HomePage extends Base{
	WebDriver driver;
	
	
	@FindBy(xpath = "//li[@class='makeFlex hrtlCenter font10 makeRelative lhUser']")
	public WebElement loginButton;
	
	@FindBy(xpath = "//a[@href='https://www.makemytrip.com/flights/']/span[@class='chNavIcon appendBottom2 chSprite chFlights active']")
	public WebElement flitesButton;
	
	
	@FindBy(xpath = "//input[@placeholder='From']")
	public WebElement fromPlaceHolder;
	
	@FindBy(xpath = "//input[@id='fromCity']")
	public WebElement fromPlaceHolder1;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	public WebElement toPlaceHolder;
	
	
	@FindBy(xpath = "//div[contains(text(),'DEL')]")
	public WebElement clickDelhiInDropDown;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	public WebElement fromPlaceholderOfTo;
	
	@FindBy(xpath = "//li[@id='react-autowhatever-1-section-0-item-0']")
	public WebElement clickOnMumbaiInDropDown;
	
	@FindBy(xpath = "//div[@class='DayPicker-Day DayPicker-Day--selected']//following-sibling::div[1]")
	public WebElement selectTommDate;
	
	
	
	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	public WebElement searchButton;
	

	@FindBy(xpath = "//div[@class='timeSlotsOuter']/div//p[contains(text(),'Before')]")
	public WebElement clickOnBeforeButtonToSort;
	
	
	
	
	
		
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

}
