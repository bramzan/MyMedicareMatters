package com.ncoa.mymedicarematters.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 


		features = "C:\\Users\\evan.zimmerman\\git\\MyMedicareMatters\\My_Medicare_Matters\\src\\main\\resources\\TestFeatures",
		//features = "C:\\Users\\Muhammad.Ramzan\\GitRepository\\MyMedicareMatters\\My_Medicare_Matters\\src\\main\\resources\\TestFeatures",

		glue = {"com.ncoa.mymedicarematters.stepdefinition"},
		//format = {"pretty","html:test-outout"},
		plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber.json"},//output and reporting
		monochrome = true,

		tags = {"@UnderstandEnrollment"}

		//dryRun = false  // 
		

)


public class TestRunner {

}

//features = "C:\\Users\\Muhammad.Ramzan\\git\\src\\main\\resources\\TestFeatures",



