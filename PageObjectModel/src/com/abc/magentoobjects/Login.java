package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
	
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.id("send2");
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sendEmail(String em)
	{
		driver.findElement(email).sendKeys(em);
	}
	
	public void sendPassword(String pw)
	{
		driver.findElement(password).sendKeys(pw);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
