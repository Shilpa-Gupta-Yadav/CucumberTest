package com.plus.net.stepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import javax.swing.plaf.synth.SynthStyle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionA {
	public static Logger Log=LogManager.getLogger(StepDefinitionA.class.getName());

    @Given("^I want to write a step with precondition$")
    public void i_want_to_write_a_step_with_precondition() throws Throwable {
    	System.out.println("TestCase1: StepDefinitionA.i_want_to_write_a_step_with_precondition()");
    	System.setProperty("webdriver.chrome.driver", "C:\\Automation Setup\\NewSetup\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("http://www.google.com");

    	// Maximize browser

    	driver.manage().window().maximize();



    	Log.info("Test Completed");
    }

    @When("^I complete action \"([^\"]*)\"$")
    public void i_complete_action_something(String strArg1) throws Throwable {
    	System.out.println("TestCase2:  StepDefinitionA.i_complete_action()");
        
    }

    @When("^I check for the (.+) in step$")
    public void i_check_for_the_in_step(String value) throws Throwable {
    	System.out.println("TestCase3: StepDefinitionA.i_check_for_the_in_step()");
    }

    @Then("^I validate the outcomes$")
    public void i_validate_the_outcomes() throws Throwable {
    	System.out.println("TestCase4: StepDefinitionA.i_validate_the_outcomes()");
    }

    @Then("^I verify the (.+) in step$")
    public void i_verify_the_in_step(String status) throws Throwable {
    	System.out.println("TestCase5: StepDefinitionA.i_verify_the_in_step()");
    }

    @And("^some other precondition$")
    public void some_other_precondition() throws Throwable {
    	System.out.println("TestCase6: StepDefinitionA.some_other_precondition()");
    }

    @And("^some other action$")
    public void some_other_action() throws Throwable {
        
    }

    @And("^yet another action$")
    public void yet_another_action() throws Throwable {
    }

    @And("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {

    }

}
