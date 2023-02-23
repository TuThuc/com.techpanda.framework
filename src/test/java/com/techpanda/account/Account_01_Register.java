package com.techpanda.account;

import com.aventstack.extentreports.Status;
import commons.BaseTest;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.MyAccountPageObject;
import pageObjects.RegisterPageObject;
import reportConfig.ExtentManager;
import ullities.DataHelper;

import java.lang.reflect.Method;

public class Account_01_Register extends BaseTest {

    @Parameters({ "envName", "serverName", "browserName", "ipAddress", "port", "osName", "osVersion" })
    @BeforeClass
    public void beforeClass(@Optional("local") String envName, @Optional("dev") String serverName, @Optional("chrome") String browserName, @Optional("Windows") String osName, @Optional("10") String osVersion,
                            @Optional("localhost") String ipAddress, @Optional("4444") String portNumber) {
        driver = getBrowserDriver(envName, browserName, serverName, ipAddress, portNumber, osName, osVersion);
        dataFaker = DataHelper.getDataHelper();
        homePage = PageGeneratorManager.getHomePage(driver);
        firstName = dataFaker.getFirstName();
        lastName = dataFaker.getLastName();
        emailAdress = dataFaker.getEmailAddress();
        password = "123456";
        invalidEmail = "dfgdgdfg@gdfm.d";
        invalidPassword = "123";
    }

    @Test()
    public void Account_01_Register_With_Infor_Empty(Method method) {
        ExtentManager.startTest(method.getName(), "Account_01_Register_With_Infor_Empty");
        ExtentManager.getTest().log(Status.INFO, "Register - Step 01: Click to Account Link");
        homePage.clickToAccountLink();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_02: Click to Register Link");
        registerPage = homePage.clickToRegisterLink();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_03: Input Empty to textbox");
        registerPage.inputToFirstNameTextbox("");
        registerPage.inputToLastNameTextbox("");
        registerPage.inputToEmailTextbox("");
        registerPage.inputToPasswordTextbox("");
        registerPage.inputToConfirmPasswordTextbox("");

        ExtentManager.getTest().log(Status.INFO, "Register - Step_04: Click to Register button");
        registerPage.clickToRegisterButton();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_05: Verify error message displayed");
        verifyEquals(registerPage.getFirstNameEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getLastNameEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getEmailEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getPasswordEmptyErrorMessage(), "This is a required field.");
        verifyEquals(registerPage.getConfirmPasswordlEmptyErrorMessage(), "This is a required field.");

    }

    @Test()
    public void Account_01_Register_With_Infor_Invalid(Method method) {
        ExtentManager.startTest(method.getName(), "Account_01_Register_With_Infor_Invalid");
        ExtentManager.getTest().log(Status.INFO, "Register - Step 01: Click to Account Link");
        homePage.clickToAccountLink();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_02: Click to Register Link");
        registerPage = homePage.clickToRegisterLink();


        ExtentManager.getTest().log(Status.INFO, "Register - Step_03: Input to firstName textbox with value is:" + firstName + "'");
        registerPage.inputToFirstNameTextbox(firstName);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_04: Input to lastName textbox with value is:" + lastName + "'");
        registerPage.inputToLastNameTextbox(lastName);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_05: Input to email textbox with value is:" + invalidEmail + "'");
        registerPage.inputToEmailTextbox(invalidEmail);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_06: Input to password textbox with value is:" + invalidPassword + "'");
        registerPage.inputToPasswordTextbox(invalidPassword);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_07: Input to confirm password textbox with value is:" + password + "'");
        registerPage.inputToConfirmPasswordTextbox(password);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_08: Click to Register button");
        registerPage.clickToRegisterButton();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_09: Verify error message displayed");
        verifyEquals(registerPage.getInvalidEmailErrorMessage(), "Please enter a valid email address. For example johndoe@domain.com.");
        verifyEquals(registerPage.getInvalidPasswordErrorMessage(), "Please enter 6 or more characters without leading or trailing spaces.");
        verifyEquals(registerPage.getInvalidConfirmPasswordErrorMessage(), "Please make sure your passwords match.");
    }

    @Test()
    public void Account_01_Register_Successful(Method method) {
        ExtentManager.startTest(method.getName(), "Account_01_Register_Successful");
        ExtentManager.getTest().log(Status.INFO, "Register - Step 01: Click to Account Link");
        homePage.clickToAccountLink();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_02: Click to Register Link");
        registerPage = homePage.clickToRegisterLink();


        ExtentManager.getTest().log(Status.INFO, "Register - Step_03: Input to firstName textbox with value is:" + firstName + "'");
        registerPage.inputToFirstNameTextbox(firstName);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_04: Input to lastName textbox with value is:" + lastName + "'");
        registerPage.inputToLastNameTextbox(lastName);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_05: Input to email textbox with value is:" + emailAdress + "'");
        registerPage.inputToEmailTextbox(emailAdress);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_06: Input to password textbox with value is:" + password + "'");
        registerPage.inputToPasswordTextbox(password);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_07: Input to confirm password textbox with value is:" + password + "'");
        registerPage.inputToConfirmPasswordTextbox(password);

        ExtentManager.getTest().log(Status.INFO, "Register - Step_08: Click to Register button");
        myAccountPage = registerPage.clickToRegisterButton();

        ExtentManager.getTest().log(Status.INFO, "Register - Step_09: Verify register success message displayed");
        verifyEquals(myAccountPage.getRegisterSuccessMessage(), "Thank you for registering with Main Website Store.");
    }

    @Parameters("envName")
    @AfterClass(alwaysRun = true)
    public void afterClass(String envName) {
        closeBrowserAndDriver(envName);
    }
    private WebDriver driver;
    private DataHelper dataFaker;
    private HomePageObject homePage;
    private LoginPageObject loginPage;
    private RegisterPageObject registerPage;
    private MyAccountPageObject myAccountPage;
    private String firstName, lastName, emailAdress, password, invalidEmail, invalidPassword;
}
