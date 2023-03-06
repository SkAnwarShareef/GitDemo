package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Hyrselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Resources/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		String title = driver.getTitle();
		System.out.println("title is :" + title);
		driver.findElement(By.id("firstName")).sendKeys("Shaik");
		driver.findElement(By.id("lastName")).sendKeys("Sadhika");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		WebElement chinesechbx = driver.findElement(By.id("chinesechbx"));
		chinesechbx.click();
		if(chinesechbx.isSelected()) {
			chinesechbx.click();
		}
		else {
			System.out.println("not selected");
		}
		Thread.sleep(3000);
		WebElement registerbtn = driver.findElement(By.id("registerbtn"));
		if(registerbtn.isDisplayed()) {
			registerbtn.click();
			System.out.println("Registred Successfully");
		}
		else {
			System.out.println("Not Registred");
		}
		Thread.sleep(3000);
		
		driver.findElement(By.id("navigateHome")).click();
		

	}

}
