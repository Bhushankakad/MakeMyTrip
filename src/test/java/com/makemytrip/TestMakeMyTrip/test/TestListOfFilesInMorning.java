package com.makemytrip.TestMakeMyTrip.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.makemytrip.TestMakeMyTrip.Utilities.Utilities;
import com.makemytrip.TestMakeMyTrip.base.Base;
import com.makemytrip.TestMakeMyTrip.pages.HomePage;

public class TestListOfFilesInMorning extends Base {
	Utilities util = new Utilities();
	HomePage home = null;

	@BeforeClass
	public void setup() {
		init();
		home = new HomePage(driver);
	}

	@Test
	public void testListOfFlitesFromDelhi() throws InterruptedException {

		
		util.waitTillPageLoad(driver);

	// cllick on flite button
		home.loginButton.click();
		

		// Click on placeholder from
		home.fromPlaceHolder1.click();

		home.fromPlaceHolder.click();
		//Send DEL in Search box
		home.fromPlaceHolder.sendKeys("DEL");

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

		// Click DEL in the dropdown list
		home.clickDelhiInDropDown.click();

		home.fromPlaceholderOfTo.sendKeys("BOM");
		;
		//SELECT Mumbai in To list
		home.clickOnMumbaiInDropDown.click();

		// Select Date by selected
		home.selectTommDate.click();
		
		//Click on Search Button
		home.searchButton.click();

		//Scroll down page
		util.scrollDownPage(driver);

		// Click On Morning sort
		home.clickOnBeforeButtonToSort.click();

		//List the Flites
		List<String> listOfFlites = new ArrayList<String>();
		List<WebElement> listOfWebElements = driver.findElements(By.xpath("//div[@class='fli-list one-way']"));

		Iterator<WebElement> ite = listOfWebElements.listIterator();
		while (ite.hasNext()) {

			String fliteType = ite.next().getText();
			listOfFlites.add(fliteType);

		}

		Iterator<String> iterateListOfFliteInfo = listOfFlites.listIterator();
		while (iterateListOfFliteInfo.hasNext()) {
			System.out.println(iterateListOfFliteInfo.next());
		}

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}

}
