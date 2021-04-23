package com.et.runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//resources//Features"
        ,glue={"com.et.stepdef"}
//      , tags = "@"
)

public class TestRunner {


}
