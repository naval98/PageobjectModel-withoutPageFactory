package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_AddToCartPage {

	WebDriver driver;

	public Product_AddToCartPage(WebDriver driver) {
		this.driver = driver;
	}

	private By Product_AddToCartPage = By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[2]/div[1]/div[2]/div[3]/a/i");


	//resulable Method

	public void clickonProduct_AddToCartPage() {
		driver.findElement(Product_AddToCartPage).click();
	}
}
