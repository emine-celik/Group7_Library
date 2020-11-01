package com.Cybertek.Library.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/Cybertek/Library/StepDefinitions",
        dryRun = true
)




public class CucumberRunner {
}
