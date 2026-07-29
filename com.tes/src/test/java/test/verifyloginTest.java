package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.baseClass;
import pages.verifylogin;

public class verifyloginTest extends baseClass {

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		Object[][] data = {
			{ "student", "Password123" },
			{ "incorrectUser", "Password123" },
			{ "student", "incorrectPassword" }
		};
		return data;
	}

	@Test(dataProvider = "loginData")
	public void verifyLoginTest(String username, String password) {
		verifylogin loginPage = new verifylogin(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickSubmit();
	}
}