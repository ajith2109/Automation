package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazom4 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement ranks = driver.findElement(By.xpath("//div[@id='nav-xshop']//parent::a[@data-csa-c-content-id='nav_cs_mobiles']"));
ranks.click();
WebElement run = driver.findElement(By.xpath("//div[@id='sobe_d_b_2-carousel-viewport-container']/div/div/ol/li[3]/a/div/img"));
run.click();
	}

}
