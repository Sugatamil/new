package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.pom.Mobiles1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mobiles {
	private static final WebElement WebElement = null;
	WebDriver driver;
	
	@Given("^i want nevigate the flipcartpage$")
	public void i_want_nevigate_the_flipcartpage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div//button[text()='✕']")).click();
	    Thread.sleep(3000);
	}

	@When("^i want search the mobile acceries$")
	public void i_want_search_the_mobile_acceries() throws Throwable {
		//Actions a=new Actions(driver);WebElement a1=
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		//a.moveToElement(a1).perform();
		
	    
	}

	@When("^i want search particular mobile brand$")
	public void i_want_search_particular_mobile_brand() throws Throwable {
		Mobiles1 ab=new Mobiles1(driver);
		ab.getText().sendKeys("1 plus mobiles");
		ab.getClick().click();
		//driver.findElement(By.xpath("//div//input[@type='text']")).sendKeys("1 plus mobiles");
		//driver.findElement(By.xpath("//div//button[@type='submit']")).click();
		Thread.sleep(4000);
		//Actions a=new Actions(driver);WebElement a1=
		driver.findElement(By.xpath("//div//select//option[@value='30000']")).click();
		//Thread.sleep(2000);
		//a.moveToElement(a1).perform();WebElement a2=
		driver.findElement(By.xpath("//div//select//option[@value='Max']")).click();
		//Thread.sleep(3000);
		//a.moveToElement(a2).perform();
	    
	}

	@When("^i want select the mobile in flipcartpage$")
	public void i_want_select_the_mobile_in_flipcartpage() throws Throwable {
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 8 Plus (Space Grey, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[@class='_24_Dny']")).click();
	    
	}

	@Then("^i want validate the flipcartpage$")
	public void i_want_validate_the_flipcartpage() throws Throwable {
	   
	}



}
