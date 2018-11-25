package com.plus.net.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue="com.plus.net.stepDefs/"		
		)


public class TestRunner extends AbstractTestNGCucumberTests {


}
