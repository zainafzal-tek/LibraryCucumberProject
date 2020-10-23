package com.Library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com/Library/step_definitions",
        dryRun = false,
        tags = "@parametrized_test"
)

public class CucumberRunner{
}
