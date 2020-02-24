package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ponezha.guru99.basepage.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//input[@name='uid']")
	WebElement usernameTextField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordTextField;

	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginBtn;

	@FindBy(xpath = "//input[@name='btnReset']")
	WebElement resetBtn;



	// Login using username and password
	public void loginWithCredentials(String username, String password){

		// Waiting for element to be visible
		wait.until(ExpectedConditions.visibilityOf(usernameTextField));
		wait.until(ExpectedConditions.visibilityOf(passwordTextField));
		wait.until(ExpectedConditions.visibilityOf(loginBtn));
		
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginBtn.click();

	}
}
