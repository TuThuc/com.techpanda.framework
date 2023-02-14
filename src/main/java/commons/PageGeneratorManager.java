package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.MyAccountPageObject;
import pageObjects.RegisterPageObject;

public class PageGeneratorManager {
    public static HomePageObject getHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }
    public static LoginPageObject getLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }
    public static RegisterPageObject getRegisterPage(WebDriver driver) {
        return new RegisterPageObject(driver);
    }
    public static MyAccountPageObject getMyAccountPage(WebDriver driver) {
        return new MyAccountPageObject(driver);
    }
    public static AddressBookPageObject getAddressBookPage(WebDriver driver) {
        return new AddressBookPageObject(driver);
    }
    public static MyOrdersPageObject getMyOrdersPage(WebDriver driver) {
        return new MyOrdersPageObject(driver);
    }
    public static MyProductReviewsPageObject getMyProductReviewsPage(WebDriver driver) {
        return new MyProductReviewsPageObject(driver);
    }
    public static MyWishListPageObject getMyWishlistPage(WebDriver driver) {
        return new MyWishListPageObject(driver);
    }
}

