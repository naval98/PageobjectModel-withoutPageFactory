package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	private By CartPage = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/div[1]/a/i");


	//resuable Method
	public void clickonCartPage() {
		driver.findElement(CartPage).click();
	}

}
