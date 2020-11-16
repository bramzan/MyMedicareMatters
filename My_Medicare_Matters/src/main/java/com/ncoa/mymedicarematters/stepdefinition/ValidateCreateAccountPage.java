package com.ncoa.mymedicarematters.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ValidateCreateAccountPage {
	
WebDriver driver;
/*@Given("^User is already on Ncoa Home page$")
public void User_is_already_on_Ncoa_Home_page() {
	
	 driver  = new ChromeDriver();
     driver.navigate().to("https://qa.mymedicarematters.org/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     
}*/
	@When("^User clicks on Create Account link$")
	public void user_clicks_on_Create_Account_link()  throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); ////*[@id=\"top-nav\"]/div/div/a[2]
	    Thread.sleep(5000);
	}
	
	////*[@id="top-nav"]/div/div/a[1]
	@Then("^User enter Email address$")
	public void user_enter_Email_address() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("bilalbablii@gmail.com");
	    Thread.sleep(5000);
	    
	   // Username: //*[@id=\'mat-input-0\']
	    ///html/body/app-root/div/div/app-sign-up/div/div/form/div[1]/mat-form-field/div/div[1]/div
	    
	  //*[@id="mat-input-14"]
	    
	  //*[@id="mat-input-14"]
	}

	@Then("^User enter Password in Password field$")
	public void user_enter_Password_in_Password_field() throws InterruptedException {
	   //driver.findElement(By.xpath("//*[@id=\'mat-input-10\']")).sendKeys("bil@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'mat-input-1\']")).sendKeys("Mramzan1!");
		Thread.sleep(5000);
	}

	@Then("^User enter Password in Confirm Password field$")
	public void user_enter_Password_in_Confirm_Password_field() throws InterruptedException  {
	  driver.findElement(By.xpath("//*[@id=\'mat-input-2\']")).sendKeys("Mramzan1!");
	  Thread.sleep(5000);
	}

	@Then("^User clicks on Sign Up button$")
	public void user_clicks_on_Sign_Up_button() throws Throwable {
	    driver.findElement(By.xpath("/html/body/app-root/div/div/app-sign-up/div/div/form/div[4]/button/span")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String AccountExit = driver.findElement(By.xpath("//*[@id='cdk-overlay-5']/snack-bar-container/simple-snack-bar")).getText();
		
		String ActualText = "An Account with the given email already exists";
		//driver.find_element_by_xpath('//a[@href="'+https://qa.mymedicarematters.org/profile+'"]')
		//String myProfile= driver.findElement(By.xpath('//a[contains(@href,"/profile)"]');
			//Finding Current URL
		
		
		/*driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click();
		Thread.sleep(2000);
		String ActualURL = driver.getCurrentUrl();
		
		System.out.println("Actual URL:" + ActualURL);*/
		System.out.println("Account Already Exist text: " + AccountExit);
		//String ExpectedURL = "https://qa.mymedicarematters.org/profile";	
		
		
		Assert.assertEquals(AccountExit, ActualText);
	}
	
	@Then("^close the browser$")
	public void Teardown() {
		
      driver.close();
	}
}

