package com.demo.stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
       System.out.println("Going to login page");
    }

    @When("I login as a driver")
    public void i_login_as_a_driver() {
        System.out.println("logging in a as driver");
    }

    @Then("I should be able to see the dashboard page")
    public void i_should_be_able_to_see_the_dashboard_page() {
        System.out.println("verifying dashboard page");
    }




}
