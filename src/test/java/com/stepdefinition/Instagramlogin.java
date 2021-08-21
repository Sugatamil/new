package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vimalselvam.cucumber.runner.Exelutils;
import com.vimalselvam.cucumber.runner.Exelutils2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Instagramlogin {
	WebDriver driver;
	@Given("^i want nevigate the instagram page$")
	public void i_want_nevigate_the_instagram_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();

	}

	@When("^user enter the user name in instagram$")
	public void user_enter_the_user_name_in_instagram() throws Throwable {
		Exelutils2 a=new Exelutils2();
		a.setExcelFile("C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\testdata.xlsx", "Sheet1");
		driver.findElement(By.xpath("//div//input[@name='username']")).sendKeys(a.getcellData(2, 1));

	}

	@When("^user enter the user password in instagram$")
	public void user_enter_the_user_password_in_instagram() throws Throwable {
		Exelutils2 a1=new Exelutils2();
		a1.setCellValue(2, 3, "pass", "C:\\\\Users\\\\ELCOT\\\\Downloads\\\\CucumberExtentReporter-master\\\\testdata.xlsx");
		driver.findElement(By.name("password")).sendKeys(a1.getcellData(2, 2));


	}

	@When("^user enter login the  instagram page$")
	public void after_user_enter_login_the_insta_page() throws Throwable {
		driver.findElement(By.xpath("//div//button[@type='submit']")).click();

	}

	@Then("^validate the instagram page$")
	public void validate_the_instagram_page() throws Throwable {

	}



}
