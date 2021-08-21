package com.stepdefinition;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Amazon;
import com.vimalselvam.cucumber.runner.Exelutils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonlogin {
	WebDriver driver;      
	@Given("^i want navigate the amazon page$")
	public void i_want_navigate_the_amazon_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fap%2Fcnep%3Fie%3DUTF8%26orig_return_to%3Dhttps%253A%252F%252Fwww.amazon.in%252Fyour-account%26openid.assoc_handle%3Dinflex%26pageId%3Dinflex&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("^user enter the user name in amazon$")
	public void user_enter_the_user_name_in_amazon() throws Throwable {
		Exelutils x=new Exelutils();
		x.setExcelFile("C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\testdatasample.xlsx", "Sheet1");
		
			         driver.findElement(By.name("email")).sendKeys(x.getCellData(1, 1));
	 	    
	                 
	        }
	  
		
	

	@When("^user enter to user password$")
	public void user_enter_to_user_password() throws Throwable {
		Amazon axi=new Amazon(driver);
		axi.getNext().click();
		//driver.findElement(By.xpath("//input[@id='continue']")).click();
	    
	}

	@When("^user enter the continue process in amazon page$")
	public void user_enter_the_continue_process_in_amazon_page() throws Throwable {
		Exelutils x1=new Exelutils();
	    Amazon axi1=new Amazon(driver);
	    axi1.getPassword().sendKeys(x1.getCellData(1, 2));
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys(x1.getCellData(1, 2));
		x1.setCellValue(1, 3, "pass", "C:\\\\Users\\\\ELCOT\\\\Downloads\\\\CucumberExtentReporter-master\\\\testdata.xlsx");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
	    
	}

	@Then("^validate the amazon page$")
	public void validate_the_amazon_page() throws Throwable {
	    
	}



}
