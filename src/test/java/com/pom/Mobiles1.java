package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobiles1 {
	public Mobiles1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div//input[@type='text']") 
	private WebElement text; 
    @FindBy(xpath="//div//button[@type='submit']")
    private WebElement click;
	public WebElement getText() {
		return text;
	}
	public void setText(WebElement text) {
		this.text = text;
	}
	public WebElement getClick() {
		return click;
	}
	public void setClick(WebElement click) {
		this.click = click;
	}
	
    
}
