package com.demo.stepDefinitions;

import com.demo.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {


    @After
    public void tearDown(Scenario scenario){
        System.out.println("After hooks");
        // check if the scenario is failed
        if (scenario.isFailed()){
            // take that screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            // attach the scenario to the report
            scenario.embed(screenshot, "image/png");
        }
        Driver.closeDriver();
    }

}
