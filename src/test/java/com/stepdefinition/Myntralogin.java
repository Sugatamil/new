package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Myntralogin {
	WebDriver driver;
	@Given("^i want to nevigate to myntra page$")
	public void i_want_to_nevigate_to_myntra_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.myntra.com/login/password");
	}

	@When("^user enter the user email on myntra$")
	public void user_enter_the_user_email_on_myntra() throws Throwable {
		driver.findElement(By.xpath("//input[@id='mobileNumberPass']")).sendKeys("shruthi12@gmail.com");
	   
	}

	@When("^user enter password in myntra$")
	public void user_enter_password_in_myntra() throws Throwable {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("89076543");
	   
	}

	@When("^user enter the login button$")
	public void user_enter_the_login_button() throws Throwable {
		driver.findElement(By.xpath("//div//button[text()='LOGIN']")).click();
		}

	@Then("^validates the myntra$")
	public void validates_the_myntra() throws Throwable {
	   
	}



}
