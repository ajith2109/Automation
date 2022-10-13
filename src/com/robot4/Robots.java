package com.robot4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robots {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ajith\\\\eclipse-workspace\\\\Selenium\\\\driver\\\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
	driver.get("chrome://newtab/");
	WebElement rrr = driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));

	Actions s = new Actions(driver);
	s.contextClick(rrr).build().perform();
	Robot k = new Robot();
	k.keyPress(KeyEvent.VK_DOWN);
	k.keyRelease(KeyEvent.VK_DOWN);
	k.keyPress(KeyEvent.VK_ENTER);
	k.keyRelease(KeyEvent.VK_ENTER);
	
	



	
	
	
	
	}

}
