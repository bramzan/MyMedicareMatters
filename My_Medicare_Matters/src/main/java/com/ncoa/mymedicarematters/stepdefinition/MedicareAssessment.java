package com.ncoa.mymedicarematters.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MedicareAssessment {
	
	WebDriver driver;
	@Given("^user is on MMM Home page$")
	public void user_is_on_MMM_Home_page()  {
		driver  = new ChromeDriver();
        driver.navigate().to("https://qa.mymedicarematters.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	    
	}
	
	public void highLighterMethod(WebDriver driver, WebElement exresource){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", exresource);
	}

	@Given("^user clicks on Complete Assessment button$")
	public void user_clicks_on_Complete_Assessment_button() throws InterruptedException  {
		WebElement CompleteAssessmentbutton = driver.findElement(By.xpath("//span[text()='Complete Assessment']"));
		//WebElement CompleteAssessment = driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-lg mat-flat-button mat-button-base']"));
		//driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-lg mat-flat-button mat-button-base']")).click();
		//driver.findElement(By.xpath("//span[text()='Complete Assessment']")).click();
		//driver.findElement(By.xpath("//button[@class='mat-focus-indicator button-lg mat-flat-button mat-button-base']")).click();
		highLighterMethod(driver,CompleteAssessmentbutton);
		CompleteAssessmentbutton.click();
		//driver.findElement(By.xpath("//span[text()='Complete Assessment']")).click();
		Thread.sleep(5000);
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollTo(0,1500)");
	}

	@Then("^user select Yes for Are you completing this for yourself$")
	public void user_select_Yes_for_Are_you_completing_this_for_yourself() throws InterruptedException   {
		//WebElement RadiobuttonYes = driver.findElement(By.id("mat-radio-110"));
		//WebElement RadiobuttonYes = driver.findElement(By.xpath("//mat-radio-button[@id='mat-radio-110']"));
		WebElement RadiobuttonYes = driver.findElement(By.xpath("//input[@id='mat-radio-2-input']"));

		//mat-radio-button[@id='mat-radio-110']
		//input[@id='mat-radio-2-input']
		highLighterMethod(driver,RadiobuttonYes);
		RadiobuttonYes.click();
		Thread.sleep(2000);
	}

	@Then("^user enters First name and Last name$")
	public void user_enters_First_name_and_Last_name() throws InterruptedException  {
		WebElement Fname  = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-2-0\"]/form/div[1]/div[4]/div/div/div/fwp-question[1]/fwp-text-input/div/mat-form-field/div/div[1]"));
		WebElement Lname  = driver.findElement(By.xpath("//*[@id=\"cdk-step-content-2-0\"]/form/div[1]/div[4]/div/div/div/fwp-question[2]/fwp-text-input/div/mat-form-field/div"));
		highLighterMethod(driver,Fname);
		highLighterMethod(driver,Lname);
		Fname.sendKeys("Bilal");
		Lname.sendKeys("Ramzan");
		Thread.sleep(5000);
	}

	@Then("^user enters Phone number$")
	public void user_enters_Phone_number()  {
		WebElement Phonenumber = driver.findElement(By.xpath("//span[text()='Complete Assessment']"));
		highLighterMethod(driver,Phonenumber);
		Phonenumber.sendKeys("2404988618");
	}

	@Then("^user verify May we contact you via text question is displayed and user select Yes$")
	public void user_verify_May_we_contact_you_via_text_question_is_displayed_and_user_select_Yes()  {
		WebElement Contact = driver.findElement(By.xpath("//span[text()='Complete Assessment']"));
		highLighterMethod(driver,Contact);
		Contact.click();
	}

	@Then("^user enters email address$")
	public void user_enters_email_address()  {
		WebElement Email = driver.findElement(By.xpath(""));
		highLighterMethod(driver,Email);
		Email.sendKeys("bilalbablii@gmail.com");
	}

	@Then("^user enters Zipcode$")
	public void user_enters_Zipcode() {
		WebElement Zipcode = driver.findElement(By.xpath(""));
		highLighterMethod(driver,Zipcode);
		Zipcode.sendKeys("20906");
	}

	@Then("^user enters Date of Birth$")
	public void user_enters_Date_of_Birth()  {
	    
	
	}

	@Then("^User select Male for what is your gender question$")
	public void user_select_Male_for_what_is_your_gender_question()  {
	    
	   
	}

	@Then("^user select Single from Marital Status dropdown$")
	public void user_select_Single_from_Marital_Status_dropdown()  {
	 
	    
	}

	@Then("^user select Yes for Do you use any tobacco products\\? \\*$")
	public void user_select_Yes_for_Do_you_use_any_tobacco_products()  {
	    
	}

	@Then("^user select Yes for Do you have a disability\\? \\*$")
	public void user_select_Yes_for_Do_you_have_a_disability()  {
	    
	}

	@Then("^user select None of these apply to me for Do any of the following apply to you\\?\\(Check all that apply\\) question$")
	public void user_select_None_of_these_apply_to_me_for_Do_any_of_the_following_apply_to_you_Check_all_that_apply_question()  {
	   
	}

	@Then("^user select Yes for Is your monthly household income \\$(\\d+),(\\d+) or more\\? \\(consider all sources of income\\) question$")
	public void user_select_Yes_for_Is_your_monthly_household_income_$_or_more_consider_all_sources_of_income_question(int arg1, int arg2)  {
	   
	}

	@Then("^user select Yes for Are you currently enrolled in Medicare A and B\\? question$")
	public void user_select_Yes_for_Are_you_currently_enrolled_in_Medicare_A_and_B_question()  {
	    
	}

	@Then("^user select Yes for Are you interested in dental/hearing/vision coverage\\? question'$")
	public void user_select_Yes_for_Are_you_interested_in_dental_hearing_vision_coverage_question() {
	    
	}

	@Then("^user clicks on Next button and verify user is on Health tab$")
	public void user_clicks_on_Next_button_and_verify_user_is_on_Health_tab()  {
	    
	}

	@Then("^user select No for Do you take any prescription drugs\\? \\*$")
	public void user_select_No_for_Do_you_take_any_prescription_drugs()  {
	   
	}

	@Then("^user select None for from Health condition dropdown field$")
	public void user_select_None_for_from_Health_condition_dropdown_field()  {
	   
	}

	@Then("^user selct (\\d+)-(\\d+) times for How many times did you visit your primary care physician in the last (\\d+) months\\? question$")
	public void user_selct_times_for_How_many_times_did_you_visit_your_primary_care_physician_in_the_last_months_question(int arg1, int arg2, int arg3)  {
	   
	}

	@Then("^user select (\\d+)-(\\d+) times How many times did you visit a specialist in the last (\\d+) months\\? question$")
	public void user_select_times_How_many_times_did_you_visit_a_specialist_in_the_last_months_question(int arg1, int arg2, int arg3)  {
	    
	}

	@Then("^user select (\\d+) time for How many times were you admitted to a hospital in the last (\\d+) months\\? question$")
	public void user_select_time_for_How_many_times_were_you_admitted_to_a_hospital_in_the_last_months_question(int arg1, int arg2)  {
	    
	}

	@Then("^User clicks on submit button and verify user on Medicare assessment summary page$")
	public void user_clicks_on_submit_button_and_verify_user_on_Medicare_assessment_summary_page()  {
	   
	}

}
