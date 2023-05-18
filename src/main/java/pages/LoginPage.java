package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {

	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	

	// Web Elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name = 'login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankCash_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement New_Account_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement Account_Title_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'description']")
	WebElement Description_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'balance']")
	WebElement Balance_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'account_number']")
	WebElement AccountNumber_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'contact_person']")
	WebElement ContactPerson_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'contact_phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id= 'ib_url']")
	WebElement BankingURL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement Submit_Button_ELEMENT;

	// Methods to interact with the elements
	public void enterUserName(String userName) {
		UserName.sendKeys(userName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSigninButton() {
		SignInButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}

	public void DashboardPage() {
		String expectedHeader = DASHBOARD_HEADER_ELEMENT.getText();
		String actualHeader = " Dashboard ";
	}

	public void clickOnBankCash() {
		BankCash_ELEMENT.click();
	}


	public void NewAccount() {
		New_Account_ELEMENT.click();
	}

	public void entertAccountTitle(String accountTitle) {
		Account_Title_ELEMENT.sendKeys(accountTitle);
	}

	public void enterDescription(String description) {
		Description_ELEMENT.sendKeys(description);
	}

	public void enterBalance(String initialBalance) {
		Balance_ELEMENT.sendKeys(initialBalance);
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber_ELEMENT.sendKeys(accountNumber);

	}

	public void enterContactPerson(String contactPerson) {
		ContactPerson_ELEMENT.sendKeys(contactPerson);

	}

	public void enterPhoneNum(String Phone) {
		PHONE_ELEMENT.sendKeys(Phone);
	}

	public void enterBankingURL(String internetBankingURL) {
		BankingURL_ELEMENT.sendKeys(internetBankingURL);
	}

	public void SubmitButton() {
		Submit_Button_ELEMENT.click();

	}
}

//public String getPageTitle() {
//return driver.getTitle();
//}
