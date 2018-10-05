package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	By myAcct=By.linkText("My Account");
	
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickOnMyAcct()
	{
		driver.findElement(myAcct).click();
	}

}
