package pageObjects;

import PageUIs.TechPandaUI;
import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class LoginPageObject extends BasePage {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToEmailTextbox(String emailAdress) {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.EMAIL_ADDRESS_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.LoginPageUI.EMAIL_ADDRESS_TEXTBOX , emailAdress);
    }

    public void inputToPasswordTextbox(String password) {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.LoginPageUI.PASSWORD_TEXTBOX , password);

    }

    public MyAccountPageObject clickToLoginButton() {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver,TechPandaUI.LoginPageUI.LOGIN_BUTTON );
        return PageGeneratorManager.getMyAccountPage(driver);
    }


    public String getEmailEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.EMAIL_ADDRESS_EMPTY_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.LoginPageUI.EMAIL_ADDRESS_EMPTY_ERROR_MESSAGE);
    }

    public String getPasswordEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.LoginPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
    }

    public String getInvalidEmailErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.EMAIL_ADDRESS_INVALID_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.LoginPageUI.EMAIL_ADDRESS_INVALID_ERROR_MESSAGE);
    }
    public String getEmailOrPasswordIncorrectErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.EMAIL_ADRESS_PASSWORD_INCORRECT_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.LoginPageUI.EMAIL_ADRESS_PASSWORD_INCORRECT_ERROR_MESSAGE);
    }

    public String getPasswordInvalidErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.LoginPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.LoginPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
    }

}

