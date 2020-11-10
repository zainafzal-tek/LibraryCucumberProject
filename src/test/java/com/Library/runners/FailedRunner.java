package com.Library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/Library/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedRunner {
}
