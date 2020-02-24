package com.ponezha.guru99.basepage;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	public WebDriverWait wait;

	// Constructor
	public BasePage(WebDriver driver) {

		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(1));

		PageFactory.initElements(driver, this);
	}
}
