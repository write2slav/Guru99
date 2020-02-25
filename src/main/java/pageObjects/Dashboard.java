package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ponezha.guru99.basepage.BasePage;

public class Dashboard extends BasePage {

	public Dashboard(WebDriver driver) {

		super(driver);
	}

	@FindBy(xpath = "//td[contains(text(),'Manger Id : mngr247199')]")
	WebElement managerId;

	public String getManagerId() {

		// Waiting for element to be visible
		wait.until(ExpectedConditions.visibilityOf(managerId));

		return managerId.getText();
	}
}
