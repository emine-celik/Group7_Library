package com.Cybertek.Library.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/Cybertek/Library/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@user"
)

public class CucumberRunner {
}
