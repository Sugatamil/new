package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vimalselvam.cucumber.runner.Snap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipcartlogin {
	WebDriver driver;
	Snap x=new Snap();
	
	@Given("^i want to nevigate flipcart page$")
	public void i_want_to_nevigate_flipcart_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://affiliate.flipkart.com/login");
	}

	@When("^user enter user name in flipcart$")
	public void user_enter_user_name_in_flipcart() throws Throwable {
		x.setExcelFile("C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\testdata.xlsx", "Sheet1");
	   driver.findElement(By.name("inputEmail")).sendKeys(x.getCellData(1, 1));
	    
	}

	@When("^user enter password in flipcart$")
	public void user_enter_password_in_flipcart() throws Throwable {
		
		x.setcellvalue(1,3,"pass","C:\\\\Users\\\\ELCOT\\\\Downloads\\\\CucumberExtentReporter-master\\\\testdata.xlsx");
	    driver.findElement(By.id("inputPassword")).sendKeys(x.getCellData(1, 2));
	    
	}

	@When("^user enter login button$")
	public void user_enter_login_button() throws Throwable {
	    driver.findElement(By.xpath("//div//input[@value='SIGN IN']")).click();
	    		
	    
	}

	@Then("^validate flipcart page$")
	public void validate_flipcart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
