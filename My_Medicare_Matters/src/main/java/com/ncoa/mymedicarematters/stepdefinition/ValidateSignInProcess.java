package com.ncoa.mymedicarematters.stepdefinition;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ncoa.mymedicarematters.pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

//@SupperWarnings 'deprecation';

public class ValidateSignInProcess {

	WebDriver driver;
	

	
//	//Pre-req
//	@Before(order=0)
//    public void Setup() {
//		
//		 driver  = new ChromeDriver();
//         //driver.navigate().to("https://qa.mymedicarematters.org/");
//
// 		driver.manage().window().maximize();
// 		
// 		String ExpectedTitle = "Sign Up for | ";
// 		
// 		String ActualTitle = driver.getTitle();
// 		
// 		System.out.println(ActualTitle);
// 		
// 		Assert.assertEquals(ExpectedTitle, ActualTitle);
//		
//	}
//	
//	@After()
//	public void CloseBrowsers() {
//		
//		driver.close();
//	}

	
	
	
	/*	@Given("^User is already on Ncoa Home page$")
	public void User_is_already_on_Ncoa_Home_page() {
		
		 driver  = new ChromeDriver();
         driver.navigate().to("https://qa.mymedicarematters.org/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         
// 		String ExpectedTitle = "My Medicare Matters";
// 		
// 		String ActualTitle = driver.getTitle();
// 		
// 		System.out.println(ActualTitle);
// 		
// 		Assert.assertEquals(ExpectedTitle, ActualTitle);
         

	}*/
	
	@And("^User clicks on login link$")
	public void user_clicks_on_login_link() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"top-nav\"]/div/div/a[2]")).click();
	    Thread.sleep(2000);
	}
	//*[@id="mat-input-0"]

//	@Then("^User enter Username and Password$")
//	public void User_enter_Username_and_Password{
//	   driver.findElement(By.xpath("//Input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c91-0 cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid']")).sendKeys(Username);
//	  // driver.findElement(By.className("//*[@class=\"mat-form-field-label-wrapper ng-tns-c91-21\"]")).sendKeys(Password);
//	}
	@Then("^User enter Username and Password$")
	public void user_enter_Username_and_Password() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\'mat-input-0\']")).sendKeys("bilalbablii@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'mat-input-1\']")).sendKeys("Mramzan1!");
		Thread.sleep(2000);
	}

	@Then("^User clicks on login button and validate user is logged in successfully$")
	public void user_clicks_on_login_button_and_validate_user_is_logged_in_successfully() throws InterruptedException {
		
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
	
	
	
	/*@Then("^close the browser$")
	public void Teardown() {
		
      driver.close();
	
	}*/
	

	
	
	
	
	
	
	
	


	
	

	
	
	


	
	
}
