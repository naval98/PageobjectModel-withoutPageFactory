package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepage {

	WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;

	}

	// declare Method
	private By Hompage = By.xpath("//a[normalize-space()='Home']");
	private By SpecialPage = By.xpath("//ul[@id='main_menu']//span[contains(@class,'menu_text')][normalize-space()='Specials']");

	//resuable Method
	public void ClickonSpecialPage() {
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(Hompage)).perform();
		driver.findElement(SpecialPage).click();

	}



}
