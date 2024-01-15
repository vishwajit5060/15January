package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {

	public WebDriver driver;

	private By email = By.xpath("//input[@name='email']");

	private By password = By.xpath("//input[@name='password']");

	private By login = By.xpath("//input[@type='submit']");
		

	public loginpageobject(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement enteremail() {
		return driver.findElement(email);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement clickonlogin() {
		return driver.findElement(login);
	}

}
