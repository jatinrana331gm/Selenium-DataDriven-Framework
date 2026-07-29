package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifylogin {
	WebDriver driver;

	By username = By.id("username");
	By password = By.id("password");
	By submit = By.id("submit");

	public verifylogin(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}

	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickSubmit() {
		driver.findElement(submit).click();
	}
}