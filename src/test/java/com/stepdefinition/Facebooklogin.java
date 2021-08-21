package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
	WebDriver driver;
	@Given("^i want to nevigate facebook page$")
	public void i_want_to_nevigate_facebook_page() throws Throwable {
		 // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\CucumberExtentReporter-master\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993517&extra_1=s%7Cc%7C318504236063%7Ce%7Cfacebook%27%7C&placement=&creative=318504236063&keyword=facebook%27&partner_id=googlesem&extra_2=campaignid%253D1653993517%2526adgroupid%253D63066387003%2526matchtype%253De%2526network%253Dg%2526source%253Dnotmobile%2526search_or_content%253Ds%2526device%253Dc%2526devicemodel%253D%2526adposition%253D%2526target%253D%2526targetid%253Dkwd-362360550869%2526loc_physical_ms%253D9302925%2526loc_interest_ms%253D%2526feeditemid%253D%2526param1%253D%2526param2%25");
       
	    
	}

	@When("^user enter user name$")
	public void user_enter_user_name() throws Throwable {
		driver.findElement(By.name("firstname")).sendKeys("sri");
		driver.findElement(By.name("lastname")).sendKeys("ram");
	    
	    
	}

	@When("^user enter password$")
	public void user_enter_password() throws Throwable {
	    driver.findElement(By.name("reg_email__")).sendKeys("ram12345@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("31282000");
	    
	}

	@When("^cilck login button$")
	public void cilck_login_button() throws Throwable {
	    WebElement element=driver.findElement(By.name("birthday_day"));
	    Select dropdown=new Select(element);
	    dropdown.selectByValue("31");
	    WebElement element1=driver.findElement(By.name("birthday_month"));
	    Select dropdown1=new Select(element1);
	    dropdown1.selectByValue("03");
	    WebElement element2=driver.findElement(By.name("birthday_year"));
	    Select dropdown2=new Select(element2);
	    dropdown2.selectByValue("1998");
	    driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
	 
	}

	@Then("^I validate facebook page$")
	public void i_validate_facebook_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
