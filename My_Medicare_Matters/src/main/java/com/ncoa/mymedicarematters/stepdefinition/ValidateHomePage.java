package com.ncoa.mymedicarematters.stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class ValidateHomePage {
	//Homepage
	WebDriver driver;
	
    @Given("^User is already on Ncoa Home page$")
	public void User_is_already_on_Ncoa_Home_page() {
			driver  = new ChromeDriver();
		     driver.navigate().to("https://qa.mymedicarematters.org/");
		     driver.manage().window().maximize();
		     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		     JavascriptExecutor jse = (JavascriptExecutor) driver;
			 jse.executeScript("window.scrollTo(0,1700)");
	}
   
	
	
	@Then("^User validate Explore Coverage Resources$")
	public void user_validate_Explore_Coverage_Resources() throws InterruptedException  {
		WebElement exresource = driver.findElement(By.xpath("//a[text()='EXPLORE COVERAGE']"));
		//0 //a[@class='ng-star-inserted active-link']
		//1 //a[text()='EXPLORE COVERAGE']
		// 
		highLighterMethod(driver,exresource);
		exresource.click();
	    Thread.sleep(2000);
	  
	}
	public void highLighterMethod(WebDriver driver, WebElement exresource){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", exresource);
	}

	@And("^User validate Makes Sense of Costs Resources$")
	public void user_validate_Makes_Sense_of_Costs_Resources() throws InterruptedException {
		WebElement MSOFresorce = driver.findElement(By.xpath("//a[text()='MAKE SENSE OF COSTS']"));
		highLighterMethod(driver,MSOFresorce);
		MSOFresorce.click();
	    Thread.sleep(2000);
	}

	@And("^User validate Understand Enrollment Resources$")
	public void user_validate_Understand_Enrollment_Resources() throws InterruptedException  {
		WebElement UEresource = driver.findElement(By.xpath("//a[text()='UNDERSTAND ENROLLMENT']"));
		highLighterMethod(driver,UEresource);
		UEresource.click();
	    Thread.sleep(2000);

	}

	@And("^User validate Continue Learning Resources$")
	public void user_validate_Continue_Learning_Resources() throws InterruptedException  {
		WebElement CLresource = driver.findElement(By.xpath("//a[text()='CONTINUE LEARNING']"));
		highLighterMethod(driver,CLresource);
		CLresource.click();
	    Thread.sleep(2000);
	    
	}

	@And("^User Validate NCOA My Medicare Matters Logo$")
	public void user_Validate_NCOA_My_Medicare_Matters_Logo() throws InterruptedException {
		WebElement HomePageLogo = driver.findElement(By.xpath("//img[@aria-label]"));
		highLighterMethod(driver,HomePageLogo);
		HomePageLogo.click();
	    Thread.sleep(2000);
	    
	}

	@And("^User Validate Research my options link$")
	public void user_Validate_Research_my_options_link() throws Throwable {
		WebElement ResearchOptions = driver.findElement(By.xpath("//a[text()='RESEARCH YOUR OPTIONS']"));
		highLighterMethod(driver,ResearchOptions);
		ResearchOptions.click();
	    Thread.sleep(5000);
	}

	@And("^user Validate Complete Assessment Button$")
	public void user_Validate_Complete_Assessment_Button() throws InterruptedException  {
		WebElement CompleteAssessment = driver.findElement(By.xpath("//span[text()='Complete Assessment']"));
		highLighterMethod(driver,CompleteAssessment);
		CompleteAssessment.click();
		
	    Thread.sleep(2000);
	}

	@And("^user Validate the Homepage Image$")
	public void user_Validate_the_Homepage_Image() throws InterruptedException {
		WebElement HomePageImage = driver.findElement(By.xpath("//img[@alt-text = 'Illustration of woman walking outside']"));
		highLighterMethod(driver,HomePageImage);
		Thread.sleep(1000);
	}
	
	@Then("^user close the browser$")
	public void Teardown() {
		
      driver.close();
	}
	
	//HomePage footer More Information
	
	@And("^User validate Facebook Link in the Footer$")
	public void user_validate_Facebook_Link_in_the_Footer() throws InterruptedException  {
		WebElement Facebook = driver.findElement(By.xpath("//img[@src='https://a.storyblok.com/f/74539/57x49/cc0a65d2b7/facebook-small.PNG']"));
		highLighterMethod(driver,Facebook);
		Facebook.click();
	    Thread.sleep(2000);
	    String mainWindow = driver.getWindowHandle();

        for(String Fbook:driver.getWindowHandles())

        {
        	driver.switchTo().window(Fbook);
        }
        Thread.sleep(2000);

        driver.close();

        driver.switchTo().window(mainWindow);
	}

	@And("^User validate Twitter Link in the Footer$")
	public void user_validate_Twitter_Link_in_the_Footer() throws InterruptedException {
		WebElement Twitter = driver.findElement(By.xpath("//img[@src='https://a.storyblok.com/f/74539/55x43/a237e4d987/twitter-small.PNG']"));
		highLighterMethod(driver,Twitter);
		Thread.sleep(2000);
	    Twitter.click();
	    String mainWindow = driver.getWindowHandle();

        for(String twit:driver.getWindowHandles())

        {
        	driver.switchTo().window(twit);
        }
        Thread.sleep(2000);

        driver.close();

        driver.switchTo().window(mainWindow);
	    
	}

	@And("^User validate youtube Link in the Footer$")
	public void user_validate_youtube_Link_in_the_Footer() throws InterruptedException  {
		WebElement Youtube = driver.findElement(By.xpath("//img[@src='https://a.storyblok.com/f/74539/62x42/fac7f68683/youtube-small.PNG']"));
		highLighterMethod(driver,Youtube);
		Thread.sleep(2000);
		Youtube.click();
	    String mainWindow = driver.getWindowHandle();

        for(String Ytube:driver.getWindowHandles())

        {
        	driver.switchTo().window(Ytube);
        }
        Thread.sleep(2000);

        driver.close();

        driver.switchTo().window(mainWindow);
	    
	    
	}

	@And("^User validate Mail Link in the Footer$")
	public void user_validate_Mail_Link_in_the_Footer() throws InterruptedException, Throwable  {
		WebElement Mail = driver.findElement(By.xpath("//img[@src='https://a.storyblok.com/f/74539/60x45/1cd71cf134/email-small.PNG']"));
		highLighterMethod(driver,Mail);
		Thread.sleep(2000);
		Mail.click();
	    
		
		Runtime.getRuntime().exec("C:\\Users\\Muhammad.Ramzan\\Desktop\\MMM AS\\CloseMailWindow.exe");
	    
	}
	
	//Footer More Information
	
	@Given("^User validate About Us Link in the Footer$")
	public void user_validate_About_Us_Link_in_the_Footer() throws InterruptedException  {
		WebElement AboutUs = driver.findElement(By.xpath("//a[text()='About']"));
		highLighterMethod(driver,AboutUs);
		Thread.sleep(5000);
		AboutUs.click();
		WebDriverWait wait = new WebDriverWait(driver,40);

//	    String mainWindow = driver.getWindowHandle();
//
//        for(String Ytube:driver.getWindowHandles())
//
//        {
//        	driver.switchTo().window(Ytube);
//        }
//        Thread.sleep(2000);
//
//        driver.close();
//
//        driver.switchTo().window(mainWindow);
	    
	    
	}
		
		
	    

	@Given("^User validate Conatct Us Link in the Footer$")
	public void user_validate_Conatct_Us_Link_in_the_Footer() throws InterruptedException {
		WebElement ContactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
	JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,1700)");
		highLighterMethod(driver,ContactUs);
		Thread.sleep(7000);
		ContactUs.click();
		WebDriverWait wait = new WebDriverWait(driver,40);

//	    String mainWindow = driver.getWindowHandle();
//
//        for(String Ytube:driver.getWindowHandles())
//
//        {
//        	driver.switchTo().window(Ytube);
//        }
//        Thread.sleep(2000);
//
//        driver.close();
//
//        driver.switchTo().window(mainWindow);
//	    
//	    
	}    
	

	@Given("^User validate Standard of Excellence Link in the Footer$")
	public void user_validate_Standard_of_Excellence_Link_in_the_Footer() throws InterruptedException  {
		WebElement Standardexe = driver.findElement(By.xpath("/html/body/app-root/div/app-footer/footer/div/div[2]/p[3]/a"));
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0,1700)");
		highLighterMethod(driver,Standardexe);
		///html/body/app-root/div/app-footer/footer/div/div[2]/p[3]/a
		///html/body/app-root/div/div/app-home/app-rows-container/div[4]/div/app-content-container/div/div/div/div/p[3]/a
		Thread.sleep(7000);
		Standardexe.click();
		WebDriverWait wait = new WebDriverWait(driver,40);

//	    String mainWindow = driver.getWindowHandle();
//
//        for(String Ytube:driver.getWindowHandles())
//
//        {
//        	driver.switchTo().window(Ytube);
//        }
//        Thread.sleep(2000);
//
//        driver.close();
//
//        driver.switchTo().window(mainWindow);
	    
	    
	}    
	

	@Given("^User validate Privacy Policy Link in the Footer$")
	public void user_validate_Privacy_Policy_Link_in_the_Footer() throws InterruptedException  {
		WebElement PrivacyPolicy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		highLighterMethod(driver,PrivacyPolicy);
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0,1700)");
		Thread.sleep(5000);
		PrivacyPolicy.click(); 
//	    String mainWindow = driver.getWindowHandle();

//        for(String Ytube:driver.getWindowHandles())
//        {
//        	driver.switchTo().window(Ytube);
//        }
//        Thread.sleep(2000);
//
//     driver.close();
//
//        driver.switchTo().window(mainWindow);
	    
	    
	}    
	

//Homepage Explore Coverage Resource Content Library
	
	@Then("^User clicks on Explore Coverage Resources$")
	public void user_clicks_on_Explore_Coverage_Resources() throws InterruptedException  {
		WebElement ExCoverage = driver.findElement(By.xpath("//a[text()='EXPLORE COVERAGE']"));
		highLighterMethod(driver,ExCoverage);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,600)");
		Thread.sleep(5000);
		ExCoverage.click(); 
	}

	@Then("^User clicks on When Does Medicare coverage Starts button$")
	public void user_clicks_on_When_Does_Medicare_coverage_Starts_button() throws InterruptedException  {
		WebElement WDMCSbutton = driver.findElement(By.xpath("//span[text()='When Does Medicare Coverage Start?']"));
		highLighterMethod(driver,WDMCSbutton);
		Thread.sleep(5000);
		WDMCSbutton.click(); 
	}

	@Then("^User clicks on Back to Explore Coverage link and validate user is on Explore Coverage Page$")
	public void user_clicks_on_Back_to_Explore_Coverage_link_and_validate_user_is_on_Explore_Coverage_Page() throws InterruptedException  {
		WebElement BTECL = driver.findElement(By.xpath("//p[text()='Back to EXPLORE COVERAGE']"));
		highLighterMethod(driver,BTECL);
		Thread.sleep(5000);
		BTECL.click(); 
	}
	
	
//Homepage Make Sense of Costs Resource Content Library
	
	@Then("^User clicks on Makes Sense of Costs Resources$")
	public void user_clicks_on_Makes_Sense_of_Costs_Resources() throws InterruptedException  {
		WebElement MSOCCoverage = driver.findElement(By.xpath("//a[text()='MAKE SENSE OF COSTS']"));
		highLighterMethod(driver,MSOCCoverage);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,600)");
		Thread.sleep(5000);
		MSOCCoverage.click(); 
	}

	@Then("^User clicks on How Much Does Meicare Cost button$")
	public void user_clicks_on_How_Much_Does_Meicare_Cost_button() throws InterruptedException {
		WebElement HMDMCbutton = driver.findElement(By.xpath("//span[text()='How Much Does Medicare Cost?']"));
		highLighterMethod(driver,HMDMCbutton);
		Thread.sleep(5000);
		HMDMCbutton.click(); 
	}

	@Then("^User clicks on Back to Makes Sense of Costs link and validate user is on Makes Sense of Costs Page$")
	public void user_clicks_on_Back_to_Makes_Sense_of_Costs_link_and_validate_user_is_on_Makes_Sense_of_Costs_Page() throws InterruptedException  {
		WebElement BTMSOClink = driver.findElement(By.xpath("//p[text()='Back to MAKE SENSE OF COSTS']"));
		highLighterMethod(driver,BTMSOClink);
		Thread.sleep(5000);
		BTMSOClink.click(); 
	}
	
//Homepage Understand Enrollment Resource Content Library
	@Then("^User clicks on Understand Enrollment Resources$")
	public void user_clicks_on_Understand_Enrollment_Resources() throws InterruptedException {
		WebElement UECoverage = driver.findElement(By.xpath("//a[text()='UNDERSTAND ENROLLMENT']"));
		highLighterMethod(driver,UECoverage);
		Thread.sleep(5000);
		UECoverage.click(); 
	}

	@Then("^User clicks on Enrollment Guide button$")
	public void user_clicks_on_Enrollment_Guide_button() throws InterruptedException  {
		WebElement EGbutton = driver.findElement(By.xpath("//span[text()='Enrollment Guide']"));
		highLighterMethod(driver,EGbutton);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,200)");
		Thread.sleep(5000);
		EGbutton.click(); 
	    
	}

	@Then("^User clicks on Back to Understand Enrollment link and validate user is on Understand Enrollment Page$")
	public void user_clicks_on_Back_to_Understand_Enrollment_link_and_validate_user_is_on_Understand_Enrollment_Page() throws InterruptedException  {
		WebElement BTUElink = driver.findElement(By.xpath("//p[text()='Back to UNDERSTAND ENROLLMENT']"));
		highLighterMethod(driver,BTUElink);
		Thread.sleep(5000);
		BTUElink.click(); 
	}

}
