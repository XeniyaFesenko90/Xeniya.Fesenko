package com.demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/com/demo/features",
        glue = "com/demo/stepDefinitions",
        tags = "@Smoke",
        dryRun = false

)
public class Runner {
}
