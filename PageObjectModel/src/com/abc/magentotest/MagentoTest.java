package com.abc.magentotest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Main;

public class MagentoTest {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Home h=new Home(driver);
		h.clickOnMyAcct();
		
		Login l=new Login(driver);
		l.sendEmail("sucheendra.abc@gmail.com");
		l.sendPassword("Welcome123");
		l.clickOnLogin();
		
		Main m=new Main(driver);
		m.clickOnLogout();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
