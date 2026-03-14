package com.vts.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guestpage {

	WebDriver driver;

	public Guestpage(WebDriver driver) {
		this.driver = driver;
	}


	private By Guestpage = By.xpath("//input[@id='accountFrm_accountguest']");

	private By firstname = By.xpath("//input[@id='guestFrm_firstname']");

	private By lastname = By.xpath("//input[@id='guestFrm_lastname']");

	private By email = By.xpath("//input[@id='guestFrm_email']");

	private By Telephone = By.xpath("//input[@id='guestFrm_telephone']");

	private By Fax = By.xpath("//input[@id='guestFrm_fax']");

	private By company = By.xpath("//input[@id='guestFrm_company']");

	private By Address = By.xpath("//input[@id='guestFrm_address_1']");

	private By city = By.xpath("//input[@id='guestFrm_city']");

	private By zipcode = By.xpath("//input[@id='guestFrm_postcode']");

	private By continuebtn = By.xpath("//button[normalize-space()='Continue']");

	private By checkbox = By.xpath("//input[@id='guestFrm_shipping_indicator']");

	private By continuebtn2 = By.xpath("//button[normalize-space()='Continue']");

	//reusable code
	public void clickonGuestpage() {
		driver.findElement(Guestpage).click();
	}


	public void firstname() {
		driver.findElement(firstname).sendKeys("Naval");
	}

	public void lastname() {
		driver.findElement(lastname).sendKeys("Saxena");
	}

	public void email() {
		driver.findElement(email).sendKeys("navalsaxena9@gmail.com");
	}

	public void Telephone() {
		driver.findElement(Telephone).sendKeys("8888888888");
	}

	public void Fax() {
		driver.findElement(Fax).sendKeys("6666F66");
	}

	public void company() {
		driver.findElement(company).sendKeys("Noida");
	}

	public void Address() {
		driver.findElement(Address).sendKeys("123F56");
	}

	public void city() {
		driver.findElement(city).sendKeys("Delhi");
	}

	public void zipcode() {
		driver.findElement(zipcode).sendKeys("11333");
	}


	public void clickoncontinuebtn() {
		driver.findElement(continuebtn).click();
	}

	public void clickoncontinuebtn2() {
		driver.findElement(continuebtn2).click();
	}

	public void checkbox() {
		driver.findElement(checkbox).click();
	}

}
