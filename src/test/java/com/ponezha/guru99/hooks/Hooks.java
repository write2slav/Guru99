package com.ponezha.guru99.hooks;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ponezha.guru99.utils.ConfigFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public WebDriver driver;

	@Before
	public void setUp() {

		System.out.println("Before STARTS");

		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();

		// Delete cookies
		driver.manage().deleteAllCookies();

		// Go to URL
		ConfigFileReader configuration = new ConfigFileReader();
		driver.get(configuration.getBaseUrl());

		// Clear local storage
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("sessionStorage.clear();");

	}

	@After
	public void tearDown() throws InterruptedException {

		driver.quit();

	}

}