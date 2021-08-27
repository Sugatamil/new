package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zomato1 {
	public Zomato1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div//button//span[text()='LATER']")
	private WebElement later;
	@FindBy(xpath="//div//header//nav//ul//li//a[text()='Sign up']")
	private WebElement signup;
	@FindBy(xpath="//section[@label='Full Name']//section//input")
	private WebElement name;
	@FindBy(xpath="//section[@label='Email']//section//input")
	private WebElement email;
	public WebElement getemail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getLater() {
		return later;
	}
	public void setLater(WebElement later) {
		this.later = later;
	}
	public WebElement getSignup() {
		return signup;
	}
	public void setSignup(WebElement signup) {
		this.signup = signup;
	}
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	}
	
