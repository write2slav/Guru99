package com.ponezha.guru99.login;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ponezha.guru99.hooks.Hooks;
import com.ponezha.guru99.utils.ConfigFileReader;

import pageObjects.LoginPage;

public class LoginTest extends Hooks {
	// User ID : mngr247199
	// Password : zAvyrUn
	private String expectedPageTitle = "Guru99 Bank Manager HomePage";
	private ConfigFileReader configuration = new ConfigFileReader();

	@Test
	public void correctCredentials() {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials(configuration.getUserName(), configuration.getPassword());

		String actualPageTitle = driver.getTitle();

		assertEquals(expectedPageTitle, actualPageTitle);

	}

	@Test
	public void incorrectCredentials() {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials("incorrectUsername", "incorrectPassword");

		String expectedAlertMessage = "User or Password is not valid";
		String actualAlertMessage = driver.switchTo().alert().getText();

		assertEquals(expectedAlertMessage, actualAlertMessage);

	}

	@Test
	public void incorrectUsername() {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials("incorrectUsername", configuration.getPassword());

		String expectedAlertMessage = "User or Password is not valid";
		String actualAlertMessage = driver.switchTo().alert().getText();

		assertEquals(expectedAlertMessage, actualAlertMessage);
	}

	@Test
	public void incorrectPassword() {

		LoginPage loginPage = new LoginPage(super.driver);
		loginPage.loginWithCredentials(configuration.getUserName(), "incorrectPassword");

		String expectedAlertMessage = "User or Password is not valid";
		String actualAlertMessage = driver.switchTo().alert().getText();

		assertEquals(expectedAlertMessage, actualAlertMessage);
	}

}
