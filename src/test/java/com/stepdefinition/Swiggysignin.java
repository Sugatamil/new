package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Swiggy;
import com.vimalselvam.cucumber.runner.Swiggy1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Swiggysignin {
	WebDriver driver;
	Swiggy1 s;
	
	Swiggy ab;
	
	@Given("^I want nevigate swiggy online delivery page$")
	public void i_want_nevigate_swiggy_online_delivery_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		driver.manage().window().maximize();
	}

	@When("^user enter the user phone number in swiggypage$")
	public void user_enter_the_user_phone_number_in_swiggypage() throws Throwable {
		ab=new Swiggy(driver);
		s=new Swiggy1();
		driver.findElement(By.xpath("//div//a[text()='Sign up']")).click();
		//Thread.sleep(2000);
		s.setExcelFile("C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\data.xlsx", "Sheet1");
		ab.getPhonenumber().sendKeys("9344449323");
		
		
	}

	@When("^user enter the user name and email in the swiggypage$")
	public void user_enter_the_user_name_and_email_in_the_swiggypage() throws Throwable {
		ab.getName().sendKeys(s.getcellData(1, 2));
		Thread.sleep(2000);
		ab.getEmail().sendKeys(s.getcellData(1, 3));
		Thread.sleep(3000);
		
		
		
		
	}

	@When("^user enter the  user passwordin swiggypage$")
	public void user_enter_the_user_passwordin_swiggypage() throws Throwable {
		ab.getPassword().sendKeys(s.getcellData(1, 4));
		ab.getNext().click();
		s.setCellValue(1, 5, "ok", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\data.xlsx");
	}

	@Then("^I want validate the details in swiggypage$")
	public void i_want_validate_the_details_in_swiggypage() throws Throwable {
	
	}



}
