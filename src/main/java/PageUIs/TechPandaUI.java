package PageUIs;

public class TechPandaUI {
    public static class RegisterPageUI{
        public static final String FIRST_NAME_TEXTBOX = "xpath=//input[@id='firstname']";
        public static final String LAST_NAME_TEXTBOX = "xpath=//input[@id='lastname']";
        public static final String EMAIL_TEXTBOX = "xpath=//input[@id='email_address']";
        public static final String PASSWORD_TEXTBOX = "xpath=//input[@id='password']";
        public static final String CONFIRM_PASSWORD_TEXTBOX = "xpath=//input[@id='confirmation']";
        public static final String REGISTER_BUTTON = "xpath=//button[@title='Register']";
        public static final String FIRST_NAME_EMPTY_ERROR_MESSAGE="xpath=//div[@id='advice-required-entry-firstname']";
        public static final String LAST_NAME_EMPTY_ERROR_MESSAGE="xpath=//div[@id='advice-required-entry-lastname']";
        public static final String EMAIL_EMPTY_ERROR_MESSAGE="xpath=//div[@id='advice-required-entry-email_address']";
        public static final String PASSWORD_EMPTY_ERROR_MESSAGE="xpath=//div[@id='advice-required-entry-password']";
        public static final String CONFIRM_PASSWORD_EMPTY_ERROR_MESSAGE="xpath=//div[@id='advice-required-entry-confirmation']";
        public static final String EMAIL_INVALID_ERROR_MESSAGE="xpath=//div[@id='advice-validate-email-email_address']";
        public static final String PASSWORD_INVALID_ERROR_MESSAGE="xpath=//div[@id='advice-validate-password-password']";
        public static final String CONFIRM_PASSWORD_INVALID_ERROR_MESSAGE="xpath=//div[@id='advice-validate-cpassword-confirmation']";

    }
    public static class LoginPageUI{
        public static final String EMAIL_ADDRESS_TEXTBOX = "xpath=//input[@id='email']";
        public static final String PASSWORD_TEXTBOX = "id='pass']";
        public static final String LOGIN_BUTTON = "xpath=//button[@id='send2']";
        public static final String EMAIL_ADDRESS_EMPTY_ERROR_MESSAGE = "xpath=//div[@id='advice-required-entry-email']";
        public static final String EMAIL_ADDRESS_INVALID_ERROR_MESSAGE = "xpath=//div[@id='advice-validate-email-email']";
        public static final String PASSWORD_EMPTY_ERROR_MESSAGE = "xpath=//div[@id='advice-required-entry-pass']";
        public static final String PASSWORD_INVALID_ERROR_MESSAGE = "xpath=//div[@id='advice-validate-password-pass']";
        public static final String EMAIL_ADRESS_PASSWORD_INCORRECT_ERROR_MESSAGE = "xpath=//li[@class='error-msg']//span";
    }
    public static class HomePageUI{
        public static final String MY_ACCOUNT_LINK = "xpath=//div[@class='footer']//a[text()='My Account']";
        public static final String ACCOUNT_LINK = "xpath=//div[@class='account-cart-wrapper']//span[text()='Account']";
        public static final String REGISTER_LINK = "xpath=//a[text()= 'Register']";
    }
    public static class MyAccountPageUI{
        public static final String CONTACT_INFOR_TEXT = "xpath=//h3[text()='Contact Information']/parent::div/following-sibling::div[@class='box-content']";
        public static final String REGISTER_SUCCESS_MESSAGE = "xpath=//li[@class='success-msg']//span";
        public static final String ACCOUNT_LINK= "xpath=//div[@class= 'account-cart-wrapper']//span[text()='Account']";
        public static final String LOGOUT_LINK= "xpath=//a[text()='Log Out']";
    }
    public static class MyApplicationPageUI{

    }
    public static class MyOrderPageUI{

    }
    public static class MyProducReviewPageUI{

    }

}
