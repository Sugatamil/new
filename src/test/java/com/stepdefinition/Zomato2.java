package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Zomato1;
import com.vimalselvam.cucumber.runner.Zomato3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Zomato2 {
	WebDriver driver;
	Zomato1 z;
	Zomato3 x;
	@Given("^I want nevigate the zomato delivery page$")
	public void i_want_nevigate_the_zomato_delivery_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.zomato.com/puducherry/delivery");
	    driver.manage().window().maximize(); 
	    //Thread.sleep(3000);

	    
	}

	@When("^user enter the user id in zomato$")
	public void user_enter_the_user_id_in_zomato() throws Throwable {
		z=new Zomato1(driver);
        //z.getOkay().click();
		z.getLater().click();
		Thread.sleep(1000);
		z.getSignup().click();
        //z.getLocation().click();
        Thread.sleep(2000);
		
	   
	   
	}

	@When("^user enter the user phone number in zomato$")
	public void user_enter_the_user_phone_number_in_zomato() throws Throwable {
		x=new Zomato3();
		x.setExcelFile("C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\data.xlsx", "Sheet1");
		z.getName().sendKeys(x.getCellData(2, 1));
	    
	   
	}

	@When("^user search which foods in available in zomato$")
	public void user_search_which_foods_in_available_in_zomato() throws Throwable {
		x.setCellValue(2, 3, "pass", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\data.xlsx");
		z.getemail().sendKeys(x.getCellData(2, 2));
	    
	    
	}

	@Then("^I want validate the zomato webpage$")
	public void i_want_validate_the_zomato_webpage() throws Throwable {
	    
	    
	}



}
