package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class MyStepdefs {
    @Given("User goes to google page")
    public void userGoesToGooglePage() {
        Driver.getDriver().get("https://www.google.com/");


    }

    @When("User searches for cucumber")
    public void userSearchesForCucumber() {
        GoogleSearchPage sp =new GoogleSearchPage(Driver.getDriver());
        sp.cerez();
        sp.searchFor("cucumber");



    }

    @Then("User verifies that the word cucumber is on the page")
    public void userVerifiesThatTheWordCucumberIsOnThePage() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));
    }



    @When("User searches for selenium")
    public void userSearchesForSelenium() {
        GoogleSearchPage sp =new GoogleSearchPage(Driver.getDriver());
        sp.cerez();
        sp.searchFor("selenium");
    }

    @Then("User verifies that the word selenium is on the page")
    public void userVerifiesThatTheWordSeleniumIsOnThePage() {
        Assert.assertTrue((Driver.getDriver().getTitle().contains("selenium")));

    }
}
