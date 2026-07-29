package test;

import org.testng.annotations.Test;

import base.baseClass;

public class baseClassTest extends baseClass {

	@Test
	public void verifyFlipkartHomePage() {
		launchBrowser();
		closeBrowser();
	}
}