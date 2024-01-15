package com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerpageobject {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@name='firstname']");

	private By lastname = By.xpath("//input[@name='lastname']");

	private By email = By.xpath("//input[@name='email']");

	private By telephone = By.xpath("//input[@name='telephone']");

	private By password = By.xpath("//input[@name='password']");

	private By passwordconfirm = By.xpath("//input[@name='confirm']");
	
	private By newsletter=By.xpath("//input[@name='newsletter']");
	
	private By privacypolicy= By.xpath("//input[@type='checkbox']");
	
	private By submitbutton= By.xpath("//input[@type='submit']");
	
	
	
	private By firstnameerrormsg= By.xpath("//div[@class='text-danger'][1]");
	
	private By lastnameerrormsg=By.xpath("//div[@class='text-danger'][2]");
	
	

	public registerpageobject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}

	public WebElement lastname() {
		return driver.findElement(lastname);
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement telephone() {
		return driver.findElement(telephone);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement passwordconfirm() {
		return driver.findElement(passwordconfirm);
		
	}
		
		public WebElement newsletter() {
			return driver.findElement(newsletter);
		}
		
		
		public WebElement privacypolicy() {
			return driver.findElement(privacypolicy);
		}
		
		
		public WebElement submitbutton() {
			return driver.findElement(lastnameerrormsg);
		}
		
	
	public WebElement firstnameerrormsg() {
		return driver.findElement(firstnameerrormsg);
	}
	
	public WebElement lastnameerrormsg() {
		return driver.findElement(lastnameerrormsg);
	}
	
}