package com.autopratice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Autopratice {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, Throwable {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
driver = new ChromeDriver();

	driver .get("http://automationpractice.com/index.php?controller=my-account");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
	sign.click();
	WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	email.sendKeys("karthickmechanical9214@gmail.com");
	WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])"));
	pass.sendKeys("Ajith@123");
	WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	submit .click();
	WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])[1]"));
	Actions s = new Actions(driver);
	WebElement casualdrs = driver.findElement(By.xpath("(//a[@title='Women'])[1]"));

	s.moveToElement(casualdrs);
	s.click(casualdrs).build().perform();
	driver.findElement(By.xpath("//a[@title='List']")).click();
	driver.findElement(By.xpath("(//a[@title='View'])[1]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("2");
    WebElement gine = driver.findElement(By.xpath("//select[@id='group_1']"));
    Select s2 = new Select(gine);
    s2.selectByValue("2");
    driver.findElement(By.xpath("//a[@name='Blue']")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
driver.findElement(By.xpath("//span[normalize-space(text () )='Proceed to checkout']")).click();
driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
driver.findElement(By.xpath("//input[@type='checkbox']")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
driver.findElement(By.xpath("//a[@class='bankwire']")).click();
driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();	
	driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();
TakesScreenshot r = (TakesScreenshot) driver;
File source = r.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\screenshot//Ajith.png");
FileUtils.copyFile(source, dest);
driver.findElement(By.xpath("(//a[@class='btn btn-default button button-small'])[7]")).click();	
WebElement winter = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));	
s.moveToElement(winter);
s.click(winter).build().perform();
	driver.findElement(By.xpath("(//a[@class='subcategory-name'])[2]")).click();
	driver.findElement(By.xpath("//li[@id='list']")).click();
	driver.findElement(By.xpath("(//a[@itemprop='url'])[3]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9");
	WebElement runs = driver.findElement(By.xpath("//select[@name='group_1']"));
	Select f = new Select(runs);
	f.selectByValue("1");
driver.findElement(By.xpath("//a[@id='color_24']")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
	driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.xpath("(//input[@type='checkbox'])")).click();
	driver.findElement(By.xpath("(//button[@name='processCarrier'])")).click();
	driver.findElement(By.xpath("(//a[@class='cheque'])")).click();
driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();




driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']")).click();
	driver.findElement(By.xpath("")).click();
	
	TakesScreenshot b = (TakesScreenshot) driver;
	File source2 = b.getScreenshotAs(OutputType.FILE);
	File dest2 = new File("C:\\Users\\Ajith\\eclipse-workspace\\Selenium\\screenshot//ajith1.png");
	FileUtils.copyFile(source2,dest2);
	
	
	
	
	
	
	
	
	
	
	}

}
