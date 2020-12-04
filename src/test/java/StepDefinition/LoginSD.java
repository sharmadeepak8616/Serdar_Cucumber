package StepDefinition;

import Pages.Homepage;
import Pages.Welcomepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginSD {
    Homepage hpage = new Homepage();
    Welcomepage wpage = new Welcomepage();

    @When("^I enter (.+) in email$")
    public void enterEmail(String email) {
        hpage.clickSignInOnHeader();
        hpage.enterUsername(email);
    }

    @When("^I enter (.+) in password$")
    public void enterPassword(String pwd) {
        hpage.enterPassword(pwd);
    }

    @When("^I click on Sign in button$")
    public void clickSignIn() {
        hpage.clickSignInButton();
    }

    @Then("^I verify I am on Welcome page$")
    public void isHomePageDisplayed() {
        Assert.assertTrue(wpage.isHiDisplayed(), "Hi not displayed after sign in");
    }

    @Then("^I verify I get error message$")
    public void isSignInErrorDisplayed() {
        Assert.assertTrue(hpage.isSignErrorDisplayed(), "Sign In error is NOT displayed");
    }



}
