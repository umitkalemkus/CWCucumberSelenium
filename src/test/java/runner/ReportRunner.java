package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/07_Hooks.feature"},
        glue = {"stepdefinitions","hooks"},
        plugin = {"html:target/cucumber-reports.html",
        }



)
public class ReportRunner {




}