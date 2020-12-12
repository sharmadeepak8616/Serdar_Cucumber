package StepDefinition.Hotels;

import Driver.Web;
import Pages.Hotels.LandingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LandingSD {
    LandingPage lpage = new LandingPage();

    @Given("^I am on hotels landing page$")
    public void openHotels() {
        Web web = new Web();
        web.initDriver();
    }

    @When("^I select (.+) in children$")
    public void selectChildren(String noChildren) {
        lpage.selectNumberOfChildren(noChildren);
    }

    @Then("^I see (.+) age dropdown$")
    public void verifyChildrenAgeDropdownCount(String expAgesDropdown) {
        String actualAgesDropdown = String.valueOf(lpage.getNumberOfChildrenAges());
        Assert.assertEquals(actualAgesDropdown, expAgesDropdown, "Incorrect ages dropdown appears");
    }

}
