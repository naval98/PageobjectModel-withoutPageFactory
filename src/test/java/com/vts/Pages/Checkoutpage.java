package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {

	WebDriver driver;

	public Checkoutpage(WebDriver driver) {
		this.driver = driver;
	}

	private By Checkoutpage = By.xpath("//*[@id=\"cart_checkout1\"]");


	//reusable Method
	public void clickonCheckoutpage() {
		driver.findElement(Checkoutpage).click();

	}

}
