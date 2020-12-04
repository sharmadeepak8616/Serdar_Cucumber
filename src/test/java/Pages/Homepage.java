package Pages;

import Utils.Helper;
import org.openqa.selenium.By;

public class Homepage extends Basepage {

    By signInFromHeader = By.xpath("//a[starts-with(@class,'signin pureguest')]");
    By username = By.id("dwfrm_login_username");
    By password = By.id("dwfrm_login_password");
    By signInButton = By.id("loginModalBtn");
    By signInError = By.xpath("//div[@id='errorAccountLocked1']//div[contains(text(),'Please try again. You can reset your password or recover your email by clicking')]");


    public void clickSignInOnHeader() {
        clickThis(signInFromHeader);
    }

    public void enterUsername(String user) {
        type(username, user);
    }

    public void enterPassword(String pwd) {
        type(password, pwd);
    }

    public void clickSignInButton() {
        clickThis(signInButton);
    }

    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickSignInButton();
    }

    public boolean isSignErrorDisplayed() {
        return isElementDisplayed(signInError);
    }

}
