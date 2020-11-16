package com.ncoa.mymedicarematters.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighElement {

	public static void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		
	try {
		Thread.sleep(5000);
	}
	catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
	js.executeScript("arguments[0].setAttribute('style', 'border: solid 2px white');", element);
	}


}
