package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swiggy {
	public Swiggy(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div//input[@name='mobile']")
	private WebElement phonenumber;
	@FindBy(xpath="//div//input[@name='name']")
	private WebElement name;
	@FindBy(xpath="//div//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//div//input[@name='password']")
	private WebElement password;
	@FindBy(xpath="//div//a[text()='CONTINUE']")
	private WebElement next;
	public WebElement getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(WebElement phonenumber) {
		this.phonenumber = phonenumber;
	}
	public WebElement getName() {
		return name;
	}
	public void setName(WebElement name) {
		this.name = name;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getNext() {
		return next;
	}
	public void setNext(WebElement next) {
		this.next = next;
	}
	}
	
	