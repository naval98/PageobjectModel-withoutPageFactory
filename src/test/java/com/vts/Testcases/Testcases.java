package com.vts.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vts.Pages.CartPage;
import com.vts.Pages.Checkoutpage;
import com.vts.Pages.Guestpage;
import com.vts.Pages.Product_AddToCartPage;
import com.vts.Pages.Homepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {

	private WebDriver driver;

	@BeforeClass
	public void setup() {

		//set the chrome driver
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://automationteststore.com/");

	}

	@Test
	public void verifyusercanclickonorderplacedsuccessfully() {


		//specialpage
		Homepage Homepage = new Homepage(driver);
		Homepage.ClickonSpecialPage();

		//Product_AddtoCart
		Product_AddToCartPage Product_addtocartpage = new Product_AddToCartPage(driver);
		Product_addtocartpage.clickonProduct_AddToCartPage();

		//cartpage
		CartPage cartpage = new CartPage(driver);
		cartpage.clickonCartPage();

		//Checkoutpage
		Checkoutpage checkout = new Checkoutpage(driver);
		checkout.clickonCheckoutpage();

		Guestpage guestpage = new Guestpage(driver);
		guestpage.clickonGuestpage();
		guestpage.clickoncontinuebtn();
		guestpage.firstname();
		guestpage.lastname();
		guestpage.email();
		guestpage.Telephone();
		guestpage.Fax();
		guestpage.company();
		guestpage.Address();
		guestpage.city();
		guestpage.checkbox();
		guestpage.zipcode();
		guestpage.clickoncontinuebtn2();


	}


	@AfterClass 
	public void TearDown() {
		driver.quit();

	}





}

