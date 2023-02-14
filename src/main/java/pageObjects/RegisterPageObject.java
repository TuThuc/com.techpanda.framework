package pageObjects;

import PageUIs.TechPandaUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject extends BasePage {
    WebDriver driver;


    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToFirstNameTextbox(String firstName) {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.RegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
    }

    public void inputToLastNameTextbox(String lastName) {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.LAST_NAME_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.RegisterPageUI.LAST_NAME_TEXTBOX, lastName);

    }

    public void inputToPasswordTextbox(String passWord) {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.RegisterPageUI.PASSWORD_TEXTBOX, passWord);
    }
    public void inputToEmailTextbox(String existingEmailAdress) {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.RegisterPageUI.EMAIL_TEXTBOX, existingEmailAdress);
    }
    public void inputToConfirmPasswordTextbox(String password) {

        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, TechPandaUI.RegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    public MyAccountPageObject clickToRegisterButton() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, TechPandaUI.RegisterPageUI.REGISTER_BUTTON);
        return  new MyAccountPageObject(driver);
    }

    public String getFirstNameEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.FIRST_NAME_EMPTY_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.FIRST_NAME_EMPTY_ERROR_MESSAGE);
    }

    public String getEmailEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.EMAIL_EMPTY_ERROR_MESSAGE);
        return getElementText(driver,TechPandaUI.RegisterPageUI.EMAIL_EMPTY_ERROR_MESSAGE);
    }

    public String getConfirmPasswordlEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.CONFIRM_PASSWORD_EMPTY_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.CONFIRM_PASSWORD_EMPTY_ERROR_MESSAGE);
    }

    public String getLastNameEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.LAST_NAME_EMPTY_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.LAST_NAME_EMPTY_ERROR_MESSAGE);
    }

    public String getPasswordEmptyErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.PASSWORD_EMPTY_ERROR_MESSAGE);
    }

    public String getInvalidEmailErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.EMAIL_INVALID_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.EMAIL_INVALID_ERROR_MESSAGE);
    }

    public String getInvalidPasswordErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.PASSWORD_INVALID_ERROR_MESSAGE);
    }

    public String getInvalidConfirmPasswordErrorMessage() {
        waitForElementVisible(driver, TechPandaUI.RegisterPageUI.CONFIRM_PASSWORD_INVALID_ERROR_MESSAGE);
        return getElementText(driver, TechPandaUI.RegisterPageUI.CONFIRM_PASSWORD_INVALID_ERROR_MESSAGE);
    }

}
