package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class continuepage {

	WebDriver driver;

	public continuepage(WebDriver driver) {
		this.driver = driver;
	}


	private By continuepage = By.xpath("//button[normalize-space()='Continue']");


	//reusable Method
	public void clickoncontinuepage() {
		driver.findElement(continuepage).click();
	}

}
