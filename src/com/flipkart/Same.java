package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Same {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("6380909091");
driver.findElement(By.xpath("(//a[@class='_2QKxJ- _2_DUc_'])")).click();

Thread.sleep(15000); 
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("6380909091");
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();	
	
	}

}
