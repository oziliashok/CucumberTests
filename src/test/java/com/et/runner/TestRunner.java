package com.et.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//resources//Features"
        ,glue={"com.et.stepdef"}
)

public class TestRunner {
}
