package pageObjects;

import PageUIs.TechPandaUI;
import commons.BasePage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
    public class MyAccountPageObject extends BasePage {

        WebDriver driver;

        public MyAccountPageObject(WebDriver driver) {
            this.driver = driver;
        }

        public void clickToMyAccountLink() {
            waitForElementVisible(driver, TechPandaUI.MyAccountPageUI.ACCOUNT_LINK);
            clickToElement(driver,TechPandaUI.MyAccountPageUI.ACCOUNT_LINK);

        }

        public HomePageObject clickToLogoutLink() {
            waitForElementVisible(driver, TechPandaUI.MyAccountPageUI.LOGOUT_LINK);
            clickToElement(driver, TechPandaUI.MyAccountPageUI.LOGOUT_LINK);
            return PageGeneratorManager.getHomePage(driver);
        }

        public String getRegisterSuccessMessage() {
            waitForElementVisible(driver, TechPandaUI.MyAccountPageUI.REGISTER_SUCCESS_MESSAGE);
            return getElementText(driver, TechPandaUI.MyAccountPageUI.REGISTER_SUCCESS_MESSAGE);


        }

        public boolean isContactInforDisplayed(String contacInfor) {
            waitForElementVisible(driver, TechPandaUI.MyAccountPageUI.CONTACT_INFOR_TEXT);
            String actualContactInforText = getElementText(driver, TechPandaUI.MyAccountPageUI.CONTACT_INFOR_TEXT);
            return actualContactInforText.contains(contacInfor);
        }

    }

