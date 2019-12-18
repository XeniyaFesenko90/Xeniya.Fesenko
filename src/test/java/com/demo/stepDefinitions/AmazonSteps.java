package com.demo.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class AmazonSteps {
    WebDriver driver;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://etsy.com");

    }


    @When("I search for {string}")
    public void i_search_for(String string) {
        driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']")).sendKeys("iphone 11" + Keys.ENTER);

    }

    @Then("I should see the results")
    public void i_should_see_the_results() {
        Assert.assertTrue(driver.getCurrentUrl().contains("search"));



    }


}