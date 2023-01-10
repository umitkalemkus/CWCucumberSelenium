package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepsDefinitions {



    @When("Kullanici {string} arattiginda")
    public void kullaniciArattiginda(String key) {

        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.cerez();
        sp.searchFor(key);
    }

    @Then("Kullanici  title da {string} gormelidir.")
    public void kullaniciTitleDaGormelidir(String key) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(key) );


    }
}
