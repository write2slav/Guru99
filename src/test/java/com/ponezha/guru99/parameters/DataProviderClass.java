package com.ponezha.guru99.parameters;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "LoginDataProvider")
	public static Object[][] getDataFromDataprovider(Method method) {
		if (method.getName().equalsIgnoreCase("correctCredentials")) {
			return new Object[][] { { "mngr247199", "zAvyrUn" } };

		} else if (method.getName().equalsIgnoreCase("incorrectCredentials")) {
			return new Object[][] { { "incorrectUsername", "incorrectPassword" } };

		} else if (method.getName().equalsIgnoreCase("incorrectUsername")) {
			return new Object[][] { { "incorrectUsername", "zAvyrUn" } };

		} else if (method.getName().equalsIgnoreCase("incorrectPassword")) {
			return new Object[][] { { "mngr247199", "incorrectPassword" } };

		} else {
			System.out.print("Test method is not diefined in DataProviderClass");
			return null;
		}

	}

}