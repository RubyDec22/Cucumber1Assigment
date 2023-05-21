package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Web Elements
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;           
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//span[contains(text(), 'Bank & Cash')]")
	WebElement BankCash_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'New Account')]")
	WebElement New_Account_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id = 'account']")
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
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Submit')]")
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

	public void clickSignInButton() {
		SignInButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}


	public void clickOnBankCash() {
		BankCash_ELEMENT.click();
	}

	public void clickNewAccount() {
		New_Account_ELEMENT.click();
	}

	public void entertAccountTitle(String accountTitle) throws InterruptedException {
		Thread.sleep(2000);
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

	public void ClickOntSubmit() {
		Submit_Button_ELEMENT.click();

//	}
//
//	public String getPageTitle() {
//		return driver.getTitle();
	}
}