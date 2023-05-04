package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.factory.DriverFactory;

public class AccountsPage {

	
	private WebDriver driver;
	
	LoginPage lp= new LoginPage(driver);

	private By navigationBar = By.xpath("//ul[contains(@class, 'NavigationBar')]//li");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public int getAccountsSectionCount() {
		return driver.findElements(navigationBar).size();
	}

	public List<String> getAccountsSectionsList() {

		List<String> accountsList = new ArrayList<>();
		List<WebElement> navigationBarList = driver.findElements(navigationBar);

		for (WebElement e : navigationBarList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}

		return accountsList;

	}
	
	public AccountsPage doLogin(String un, String pwd) {
		DriverFactory.openBrowser();
		lp.doLogin(un, pwd);		
		return new AccountsPage(driver);
	}
	
	
}
