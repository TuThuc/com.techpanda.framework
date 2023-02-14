package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
    public class MyAccountPageObject extends BasePage {

        WebDriver driver;

        public MyAccountPageObject(WebDriver driver) {
            this.driver = driver;
        }

        public void clickToMyAccountLink() {
            waitForElementVisible(driver, MyAccountPageUI.ACCOUNT_LINK);
            clickToElement(driver, MyAccountPageUI.ACCOUNT_LINK);

        }

        public HomePageObject clickToLogoutLink() {
            waitForElementVisible(driver, MyAccountPageUI.LOGOUT_LINK);
            clickToElement(driver, MyAccountPageUI.LOGOUT_LINK);
            return PageGeneratorManager.getHomePage(driver);
        }

        public String getRegisterSuccessMessage() {
            waitForElementVisible(driver, MyAccountPageUI.REGISTER_SUCCESS_MESSAGE);
            return getElementText(driver, MyAccountPageUI.REGISTER_SUCCESS_MESSAGE);


        }

        public boolean isContactInforDisplayed(String contacInfor) {
            waitForElementVisible(driver, MyAccountPageUI.CONTACT_INFOR_TEXT);
            String actualContactInforText = getElementText(driver, MyAccountPageUI.CONTACT_INFOR_TEXT);
            return actualContactInforText.contains(contacInfor);
        }

    }
}
