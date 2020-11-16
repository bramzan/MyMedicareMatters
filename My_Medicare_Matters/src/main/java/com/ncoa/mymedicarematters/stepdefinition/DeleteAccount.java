package com.ncoa.mymedicarematters.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteAccount {
	
WebDriver driver;
@Given("^User is already on AWS Amazon Homepage$")
public void user_is_already_on_AWS_Amazon_Homepage() {
	 driver  = new ChromeDriver();
     driver.navigate().to("https://console.aws.amazon.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}
}
/*
@When("^User clicks on Sign In to the Console button$")
public void user_clicks_on_Sign_In_to_the_Console_button() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'m-nav\']/div[1]/div[2]/div/div/div/div/a")).click(); 
    Thread.sleep(5000);
}

@Then("^User user is navigated to AWS Sign page$")
public void user_user_is_navigated_to_AWS_Sign_page() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
    
}

@Then("^user enters (\\d+) digit Account ID in Account ID field$")
public void user_enters_digit_Account_ID_in_Account_ID_field(int arg1) throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("959478070654");
    Thread.sleep(5000);
    
}

@Then("^User enters username in username field$")
public void user_enters_username_in_username_field() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("mramzan");
	Thread.sleep(5000);
}

@When("^User clicks on Sign In button$")
public void user_clicks_on_Sign_In_button() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("Mramzan1!");
	Thread.sleep(5000);
}

@Then("^User is on AWS Management Console Pgae$")
public void user_is_on_AWS_Management_Console_Pgae() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
  
}

@Then("^User Clicks on Cognito link$")
public void user_Clicks_on_Cognito_link() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
}

@Then("^clicks on Manage User pools$")
public void clicks_on_Manage_User_pools() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
    
}

@Then("^User Clicks on qaCommon-Cognito button$")
public void user_Clicks_on_qaCommon_Cognito_button() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
}

@Then("^User cicks on User and groups and verify users is on User tabs$")
public void user_cicks_on_User_and_groups_and_verify_users_is_on_User_tabs() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
}

@Then("^User clicks on the dropdown and select email$")
public void user_clicks_on_the_dropdown_and_select_email() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
    
}

@Then("^user eneter the email address$")
public void user_eneter_the_email_address() throws InterruptedException  {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).sendKeys("bilalbablii@gmail.com");
    Thread.sleep(5000);
    
}

@Then("^user select the username link$")
public void user_select_the_username_link() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
    
}

@Then("^User clicks on Disable user button$")
public void user_clicks_on_Disable_user_button() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
    
}

@Then("^user clicks on Delete user button$")
public void user_clicks_on_Delete_user_button() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\'top-nav\']/div/div/a[1]")).click(); 
    Thread.sleep(5000);
    
}


}
*/