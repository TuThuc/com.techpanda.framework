package pageObjects;

import PageUIs.TechPandaUI;
import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    WebDriver driver;


    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }


    public LoginPageObject clickToMyAccountLink() {
        waitForElementVisible(driver, TechPandaUI.HomePageUI.MY_ACCOUNT_LINK);
        clickToElement(driver, TechPandaUI.HomePageUI.MY_ACCOUNT_LINK);
        return PageGeneratorManager.getLoginPage(driver);

    }


    public void clickToAccountLink() {
        waitForElementVisible(driver, TechPandaUI.HomePageUI.ACCOUNT_LINK);
        clickToElement(driver, TechPandaUI.HomePageUI.ACCOUNT_LINK);

    }
    public RegisterPageObject clickToRegisterLink() {
        waitForElementVisible(driver, TechPandaUI.HomePageUI.REGISTER_LINK);
        clickToElement(driver, TechPandaUI.HomePageUI.REGISTER_LINK);
        return PageGeneratorManager.getRegisterPage(driver);
    }
}
