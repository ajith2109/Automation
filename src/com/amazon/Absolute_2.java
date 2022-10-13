package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_2 {
public static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
WebElement gun = driver.findElement(By.xpath("//a[@href='/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books']"));
	
	gun.click();
	
	WebElement fire = driver.findElement(By.xpath("//div[@id='sobe_d_b_1-carousel-viewport-container']/div[2]/div/ol/li[5]/a/div/img"));
	fire.click();
	
	
	
	
	}

}
