package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loops {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("userName"));
		Thread.sleep(3000);
		username.sendKeys("testuser");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		Thread.sleep(3000);
		password.sendKeys("Password@123");
		WebElement login = driver.findElement(By.id("login"));
		Thread.sleep(3000);
		login.click();
		WebElement logout = driver.findElement(By.id("submit"));

		if(logout.isDisplayed()) {
			if(logout.isEnabled()) {
				logout.click();
				System.out.println("loged out successfully");
			}
			else {
				System.out.println("logout is not dispalyed");
			}
		}

	}
} 
