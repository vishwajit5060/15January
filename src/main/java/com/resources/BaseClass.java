package com.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"/src/main/java/com/resources/data.properties");

		Properties prop = new Properties();
		
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		}

		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		}
	@BeforeClass
	public void launchbrowser() throws IOException {
		initializeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
	}
	
	
	}
