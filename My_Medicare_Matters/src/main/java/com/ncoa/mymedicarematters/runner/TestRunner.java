package com.ncoa.mymedicarematters.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 

		features = "C:\\Users\\evan.zimmerman\\git\\MyMedicareMatters\\My_Medicare_Matters\\src\\main\\resources\\TestFeatures",
		glue = {"com.ncoa.mymedicarematters.stepdefinition"},
		//format = {"pretty","html:test-outout"},
		plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"},//output and reporting
		monochrome = true,
		tags = {"@Homepage_Footer_Connect_With_Us"}
		//dryRun = false  // 


)


public class TestRunner {

}





