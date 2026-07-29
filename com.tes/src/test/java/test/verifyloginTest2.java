package test;

import org.testng.annotations.Test;

import base.baseClass;
import pages.verifylogin;
import utilities.ReadpropertyFile;

public class verifyloginTest2 extends baseClass {

	@Test(dataProviderClass = ReadpropertyFile.class, dataProvider = "bvtdata")
	public void verifyLoginTest(String username, String password) {
		verifylogin loginPage = new verifylogin(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickSubmit();
	}
}