package stepdefinition;

import io.cucumber.java.en.*;

public class FirstStepDefinition {





    @Given("Ilk feature icin cucumber indirdim.")
    public void ilk_feature_icin_cucumber_indirdim() {
        System.out.println("Given step i calisti");


    }
    @When("Seneryomu calistirdigimda")
    public void seneryomu_calistirdigimda() {
        System.out.println("When step i calisti");


    }
    @Then("Senaryomun calistigini konsolda gormeliyim.")
    public void senaryomun_calistigini_konsolda_gormeliyim() {
        System.out.println("Then step i calisti");

    }


    }

