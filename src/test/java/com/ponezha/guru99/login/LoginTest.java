package com.ponezha.guru99.login;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import com.ponezha.guru99.hooks.Hooks;
import com.ponezha.guru99.parameters.DataProviderClass;

import pageObjects.LoginPage;

public class LoginTest extends Hooks {
	// User ID : mngr247199
	// Password : zAvyrUn
	private String expectedPageTitle = "Guru99 Bank Manager HomePage";

	@Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderClass.class)
	public void correctCredentials(String userName, String password) {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials(userName, password);

		String actualPageTitle = driver.getTitle();

		assertEquals(expectedPageTitle, actualPageTitle);

	}

	@Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderClass.class)
	public void incorrectCredentials(String userName, String password) {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials(userName, password);

		String expectedAlertMessage = "User or Password is not valid";
		String actualAlertMessage = driver.switchTo().alert().getText();

		assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderClass.class)
	public void incorrectUsername(String userName, String password) {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials(userName, password);

		String expectedAlertMessage = "User or Password is not valid";
		String actualAlertMessage = driver.switchTo().alert().getText();

		assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@Test(dataProvider = "LoginDataProvider", dataProviderClass = DataProviderClass.class)
	public void incorrectPassword(String userName, String password) {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials(userName, password);

		String expectedAlertMessage = "User or Password is not valid";
		String actualAlertMessage = driver.switchTo().alert().getText();

		assertEquals(expectedAlertMessage, actualAlertMessage);
	}

}
