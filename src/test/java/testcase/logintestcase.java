package testcase;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.pageObject.homepageobject;
import com.pageObject.loginpageobject;
import com.resources.BaseClass;

public class logintestcase extends BaseClass {

	@Test
	public void validlogintestcase() throws IOException, InterruptedException {
		
		homepageobject hpo=new homepageobject (driver);
			
			hpo.account().click();
			hpo.login().click();
			
			Thread.sleep(2000);
		
		loginpageobject lpo = new loginpageobject(driver);

		lpo.enteremail().sendKeys("test@gmail.com");
		lpo.enterpassword().sendKeys("test123");
		lpo.clickonlogin().click();
		
		
		}
}




