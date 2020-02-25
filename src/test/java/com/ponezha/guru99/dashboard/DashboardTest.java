package com.ponezha.guru99.dashboard;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

import com.ponezha.guru99.hooks.Hooks;
import com.ponezha.guru99.utils.ConfigFileReader;

import pageObjects.LoginPage;

public class DashboardTest extends Hooks {
	private ConfigFileReader configuration = new ConfigFileReader();

	@Test
	public void managerIdIsDispaledAndCorrect() {

		String expectedId = "Manger Id : mngr247199";
		String actualId = new LoginPage(super.driver)
				.loginWithCredentials(configuration.getUserName(), configuration.getPassword()).getManagerId();

		assertEquals(expectedId, actualId);

	}
}
