package com.techpanda.account;

import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.MyAccountPageObject;
import pageObjects.RegisterPageObject;

public class Account_01_Register extends BaseTest {
    WebDriver driver;
    HomePageObject homePage;
    LoginPageObject loginPage;
    RegisterPageObject registerPage;
    MyAccountPageObject myAccountPage;
    String firstName, lastName, emailAdress, password, invalidEmail, invalidPassword;
    @Parameters("browser")
    @BeforeClass
    public void BeforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
        homePage = PageGeneratorManager.getHomePage(driver);
        firstName = "Steven";
        lastName = "Gerrard";
        emailAdress = "test01" + generateFakeNumber() + "@hotmail.com";
        password = "123456";
        invalidEmail = "dfgdgdfg@gdfm.d";
        invalidPassword = "123";
    }

    @Test()
    public void Register_01_LoginWithInforEmpty() {
        System.out.println("Step_01: Click to Account Link");
        homePage.clickToAccountLink();
        System.out.println("Step_02: Click to Register Link");
        registerPage = homePage.clickToRegisterLink();
        System.out.println("Step_03: Input Empty to textbox");
        registerPage.inputToFirstNameTextbox("");
        registerPage.inputToLastNameTextbox("");
        registerPage.inputToEmailTextbox("");
        registerPage.inputToPasswordTextbox("");
        registerPage.inputToConfirmPasswordTextbox("");
        System.out.println("Step_04: Click to Register button");
        registerPage.clickToRegisterButton();
        System.out.println("Step_05: Verify error message displayed");
        verifyEquals(registerPage.getFirstNameEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getLastNameEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getEmailEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getPasswordEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getConfirmPasswordlEmptyErrorMessage(), "This is a required field.");

    }

    @Test()
    public void Register_02_RegisterWithInforInvalid() {
        System.out.println("Step_01: Click to Account Link");
        homePage.clickToAccountLink();
        System.out.println("Step_02: Click to Register Link");
        registerPage = homePage.clickToRegisterLink();
        System.out.println("Step_03: Input Information invalid to textbox");
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(invalidEmail);
        registerPage.inputToPasswordTextbox(invalidPassword);
        registerPage.inputToConfirmPasswordTextbox(password);
        System.out.println("Step_04: Click to Register button");
        registerPage.clickToRegisterButton();
        System.out.println("Step_05: Verify error message displayed");
        verifyEquals(registerPage.getInvalidEmailErrorMessage(), "Please enter a valid email address. For example johndoe@domain.com.");
        verifyEquals(registerPage.getInvalidPasswordErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
        verifyEquals(registerPage.getInvalidConfirmPasswordErrorMessage(), "Please make sure your passwords match.");
    }

    @Test()
    public void Register_03_RegisterSuccessful() {
        System.out.println("Step_01: Click to Account Link");
        homePage.clickToAccountLink();
        System.out.println("Step_02: Click to Register Link");
        registerPage = homePage.clickToRegisterLink();
        System.out.println("Step_03: Input Information to textbox");
        registerPage.inputToFirstNameTextbox(firstName);
        registerPage.inputToLastNameTextbox(lastName);
        registerPage.inputToEmailTextbox(emailAdress);
        registerPage.inputToPasswordTextbox(password);
        registerPage.inputToConfirmPasswordTextbox(password);
        System.out.println("Step_04: Click to Register button");
        myAccountPage = registerPage.clickToRegisterButton();
        System.out.println("Step_05: Verify error message displayed");
        verifyEquals(myAccountPage.getRegisterSuccessMessage(), "Thank you for registering with Main Website Store.");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
