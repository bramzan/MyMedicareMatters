package com.ncoa.mymedicarematters.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class VerifyEmail {
	WebDriver driver;
	/*@Given("^User is already on Gmail$")
	public void user_is_already_on_Gmail() {
		driver  = new ChromeDriver();
	     driver.navigate().to("https://aws.amazon.com");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
*/
	@When("^User clicks on Sign In Link$")
	public void user_clicks_on_Sign_In_Link() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'m-nav\']/div[1]/div[2]/div/div/div/div/a")).click(); 
	    Thread.sleep(5000);
	    
	}

	@Then("^User enter Email address in Email field and click on Next button$")
	public void user_enter_Email_address_in_Email_field_and_click_on_Next_button() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("mmmncoa@gmail.com");
	    Thread.sleep(5000);
	}

	@Then("^User enter Password in Password field and click on Next button$")
	public void user_enter_Password_in_Password_field_and_click_on_Next_button() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("Mramzan1!");
	    Thread.sleep(5000);
	   
	}

	@Then("^User Search For My Medicare Matter verification Email and clicks on Email$")
	public void user_Search_For_My_Medicare_Matter_verification_Email_and_clicks_on_Email() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'m-nav\']/div[1]/div[2]/div/div/div/div/a")).click(); 
	    Thread.sleep(5000);
	   
	}

	@Then("^User clicks on the Email and clicks on Click here link to verify the Email$")
	public void user_clicks_on_the_Email_and_clicks_on_Click_here_link_to_verify_the_Email() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'m-nav\']/div[1]/div[2]/div/div/div/div/a")).click(); 
	    Thread.sleep(5000);
	    
	}

	@When("^User clicks on Click here link in the verification email$")
	public void user_clicks_on_Click_here_link_in_the_verification_email() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'m-nav\']/div[1]/div[2]/div/div/div/div/a")).click(); 
	    Thread.sleep(5000);
	    
	}

	@Then("^user is navigated to MMM on different tab$")
	public void user_is_navigated_to_MMM_on_different_tab() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click();
		Thread.sleep(2000);
		String Login = driver.findElement(By.className("text-menu-left-m")).getText();
		String ActualURL = driver.getCurrentUrl();
		
		System.out.println("Actual URL:" + ActualURL);
		System.out.println("LogOut Text:" + Login);
		String ExpectedURL = "https://qa.mymedicarematters.org/Login";	
		
		
		
		Assert.assertEquals(ExpectedURL, ActualURL);
	}

	@Then("^User enters username and password$")
	public void user_enters_username_and_password() throws InterruptedException  {
		driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("mmmncoa@gmail.com");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("Mramzan1!");
	    Thread.sleep(5000);
	   
	}

	@Then("^user clicks on Login In button$")
	public void user_clicks_on_Login_In_button() throws InterruptedException  {
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-log-in/div/form/div[3]/button/span")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
	    
	}

	@Then("^User verify user is succfully logged in$")
	public void user_verify_user_is_succfully_logged_in() throws InterruptedException  {
		driver.findElement(By.xpath("/html/body/app-root/div/div/app-log-in/div/form/div[3]/button/span")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		String LogOut = driver.findElement(By.className("text-menu-left-m")).getText();
		
		//driver.find_element_by_xpath('//a[@href="'+https://qa.mymedicarematters.org/profile+'"]')
		//String myProfile= driver.findElement(By.xpath('//a[contains(@href,"/profile)"]');
			//Finding Current URL
		driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click();
		Thread.sleep(2000);
		String ActualURL = driver.getCurrentUrl();
		
		System.out.println("Actual URL:" + ActualURL);
		System.out.println("LogOut Text:" + LogOut);
		String ExpectedURL = "https://qa.mymedicarematters.org/profile";	
	   
		
		Assert.assertEquals(ExpectedURL, ActualURL);
	}


}
