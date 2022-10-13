package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon1 {
	public static WebDriver driver;
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement mobiles = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
mobiles.click();
	WebElement fun = driver.findElement(By.xpath("//div[@id='sobe_d_b_2-carousel-viewport-container']/div/div/ol/li[2]/a/div/img"));
	
	fun.click();
//WebElement ranks = driver.findElement(By.xpath("//div[@id='nav-xshop']//parent::a[@data-csa-c-content-id='nav_cs_mobiles']"));
	
	//ranks.click();
	}

}
