package testcase;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pageObject.homepageobject;
import com.pageObject.registerpageobject;
import com.resources.BaseClass;
import com.resources.commonmethods;
import com.resources.constants;

public class resgitertestcase extends BaseClass {

	
	@Test (enabled=false)
	public void registertestcasewithblankdata() {

		homepageobject hpo = new homepageobject(driver);

		hpo.account().click();
		hpo.register().click();

		registerpageobject rpo = new registerpageobject(driver);

		rpo.firstname().sendKeys("");
		rpo.lastname().sendKeys("");
		rpo.email().sendKeys("");
		rpo.telephone().sendKeys("");
		rpo.password().sendKeys("");
		rpo.passwordconfirm().sendKeys("");
		rpo.newsletter().click();
		rpo.privacypolicy().click();
		rpo.submitbutton().click();
		
		
		commonmethods.hanldeassertion(driver.getCurrentUrl(), constants.successurl);


	}

	@Test //(dependsOnMethods="registertestcasewithblankdata")
	public void validregistertestcase() throws IOException {

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		registerpageobject rpo = new registerpageobject(driver);
		
		rpo.firstname().clear();

		rpo.firstname().sendKeys(constants.firstname);
		rpo.lastname().sendKeys(constants.lastname);
		rpo.email().sendKeys("jwh@gmail.com");
		rpo.password().sendKeys("constants.password");
		rpo.passwordconfirm().sendKeys("constants.passwordconfirm");
		rpo.telephone().sendKeys(constants.telephone);
		rpo.newsletter().click();
		rpo.privacypolicy().click();
		rpo.submitbutton().click();
		
		
		commonmethods.hanldeassertion(driver.getCurrentUrl(), constants.successurl);
	}

}
