package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinition {
    @Given("Smoke test icin hazirliklar yapildi")
    public void smokeTestIcinHazirliklarYapildi() {

    }






    @When("Smoke test calistiginda")
    public void smokeTestCalistiginda() {
        System.out.println("Smoke test calisti");
    }

    @Then("Smoke test basarili olmali")
    public void smokeTestBasariliOlmali() {
    }

    @Given("Regression test icin hazirliklar yapildi")
    public void regressionTestIcinHazirliklarYapildi() {
    }

    @When("Regression test calistiginda")
    public void regressionTestCalistiginda() {
        System.out.println("Smoke test calisti");
    }

    @Then("Regression test basarili olmali")
    public void regressionTestBasariliOlmali() {
    }

    @And("abc")
    public void abc() {
    }
}
