package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("User is on the techfios login page")
	public void user_is__on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");

	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String data, String field) {
		switch (field) {
		case "username":
			loginPage.enterUserName(data);
			break;
		case "password":
			loginPage.enterPassword(data);

		}

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String data, String field) throws InterruptedException {
		switch (field) {
		case "accountTitle":
			loginPage.entertAccountTitle(data + generateRandomNumber(999));
			break;
		case "description":
			loginPage.enterDescription(data);
			break;
		case "initialBalance":
			loginPage.enterBalance(data);
			break;
		case "accountNumber":
			loginPage.enterAccountNumber(data);
			break;
		case "contactPerson":
			loginPage.enterContactPerson(data);
			break;
		case "Phone":
			loginPage.enterPhoneNum(data);
			break;
		case "internetBankingURL":
			loginPage.enterBankingURL(data);
			break;

		}

	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() throws InterruptedException {
//		String expectedTitle = "Dashboard- iBilling";
//		String actualTitle = loginPage.getPageTitle();
//		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String button) {
		switch (button) {
		case "login":
			loginPage.clickOnSigninButton();
			break;
		case "bankCash":
			loginPage.clickOnBankCash();
			break;
		case "newAccount":
			loginPage.clickNewAccount();
			break;
		case "submit":
			loginPage.ClickOntSubmit();
			break;
		}
	}

	@Then("User should be able to vaidate account created successfully")
	public void user_should_be_able_to_vaidate_account_created_successfully() {
		takeScreenshot(driver);

	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}

//	}
//
//}
//
////	   @Then("User should land on dashboard page")
////		public void user_should_land_on_dashboard_page() {
//		   String expectedTitle ="Dashboard- iBilling";
//		   String actualTitle = loginPage.getPageTitle();
//		   Assert.assertEquals(expectedTitle, actualTitle);
