package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vimalselvam.cucumber.runner.Ticket;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ticketbooking {
	WebDriver driver; 
	//Ticket a=new Ticket();
	@Given("^i want nevigate the online flight ticketbooking page$")
	public void i_want_nevigate_the_online_flight_ticketbooking_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Generic|DF_Generic_Exact|Tickets_Exact|RSA|Offer3|529647844798&s_kwcid=AL!1631!3!529647844798!e!!g!!flight%20ticket%20booking%20online&ef_id=CjwKCAjw0qOIBhBhEiwAyvVcf_NHLFl_KpnCvXdIvCrOzErOTx_JKPJj2Gau9oseOyTY4gBYcm9PlxoCHlcQAvD_BwE:G:s&gclid=CjwKCAjw0qOIBhBhEiwAyvVcf_NHLFl_KpnCvXdIvCrOzErOTx_JKPJj2Gau9oseOyTY4gBYcm9PlxoCHlcQAvD_BwE");
        driver.manage().window().maximize();
        
	}

	@When("^user enter the From place to the flight$")
	public void user_enter_the_From_place_to_the_flight() throws Throwable {
	//a.SetExelFile("C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\testdatasample.xlsx", "Sheet1");
		driver.findElement(By.xpath("//div//span[text()='Google']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//div//input[@name='firstName']")).sendKeys("sri");
		driver.findElement(By.xpath("//div//input[@name='lastName']")).sendKeys("ram");
		driver.findElement(By.xpath("//div//input[@type='email']")).sendKeys("sriram12@gmail.com");
		driver.findElement(By.xpath("//div//input[@name='Passwd']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//div//input[@name='ConfirmPasswd']")).sendKeys("0987654321");
		//driver.findElement(By.xpath("//div//span[text()='Next']").cl
		
		
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//div//input[@placeholder='From']")).sendKeys("chennai");
		//(a.getcellData(1,1 ));
		Thread.sleep(3000);
		
		
	
	}

	@When("^user enter the To place in the flight$")
	public void user_enter_the_To_place_in_the_flight() throws Throwable {
		//a.Setcellvalue(1, 3, "booked", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\testdatasample.xlsx");
		driver.findElement(By.xpath("//div//label//span[text()='To']")).sendKeys("goa");
		//(a.getcellData(1, 2));

	}

	@When("^user search the more facilities in flight$")
	public void user_search_the_more_facilities_in_flight() throws Throwable {
		driver.findElement(By.xpath("//div//p//a[text()='Search']")).click();
		
		

	}

	@Then("^i want validate the flightticket booking$")
	public void i_want_validate_the_flightticket_booking() throws Throwable {

	}



}
