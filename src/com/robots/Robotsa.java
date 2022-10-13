package com.robots;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Robotsa {
public static WebDriver driver;
public static void down_Enter() throws AWTException {
Robot r = new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_ENTER);
}
public static void right_click(WebDriver d, WebElement e) {
	Actions a = new Actions(d);
	a.contextClick(e).build().perform();
}

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	
	WebElement bestseller = driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
	bestseller.click();
	
	WebElement mobiles = driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']"));
	mobiles.click();
	WebElement service = driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=200507590&ref_=nav_cs_help']"));
	service.click();
	WebElement findElement = driver.findElement(By.xpath("//a[@href='/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books']"));
	findElement.click();
	right_click(driver,bestseller);
	down_Enter();
	right_click(driver,mobiles);
	down_Enter();
	right_click(driver,service);
	down_Enter();
	right_click(driver,findElement);

	down_Enter();
	}
	

}
