package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobject {

	public WebDriver driver;

	private By account = By.xpath("//i[@class='fa fa-user']");

	private By register = By.xpath("//a[contains (text(),'Register')]");

	private By login = By.xpath("//a[contains(text(),'Login')]");

	public homepageobject(WebDriver driver) {
		this.driver = driver;
	}

	public homepageobject() {
		this.driver=driver;
	}

	public WebElement account() {
		return driver.findElement(account);
	}

	public WebElement register() {
		return driver.findElement(register);
	}

	public WebElement login() {
		return driver.findElement(login);
	}

}
