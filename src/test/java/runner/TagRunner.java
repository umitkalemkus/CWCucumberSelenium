package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// Sadece @ smoke tag ine sahip olan seneryolari calistiran runner.
@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features/features",
        glue ="stepdefinition",
        tags ="@smoke or @ regression",
        dryRun = false

)

public class TagRunner {




}
