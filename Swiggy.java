package com.Swiggy.Order;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Swiggy {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\Order\\Driver\\chromedriver2.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.swiggy.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id='location']"));
		findElement.sendKeys("Pammal chennai");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Search']"));
		findElement2.click();
		Thread.sleep(2000);
		WebElement findElement3 = driver.findElement(By.xpath("//input[@type='text']"));
		findElement3.sendKeys("Briyani");
		Thread.sleep(4000);
		
		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);

		WebElement findElement4 = driver.findElement(By.xpath("//div[contains(text(),'Ambur')]"));
		findElement4.click();
		Thread.sleep(2000);
		WebElement findElement5 = driver.findElement(By.xpath("//div[contains(text(),'Ambur Star Briyani')]"));
		findElement5.click();
		Thread.sleep(2000);
		WebElement findElement6 = driver.findElement(By.xpath("//div[contains (text(),'ADD')]"));
		findElement6.click();
		
		Thread.sleep(2000);
		
		WebElement findElement8 = driver.findElement(By.xpath("//span[contains(text(),'Add Item')]"));
		findElement8.click();
		Thread.sleep(2000);
		WebElement findElement7 = driver.findElement(By.xpath("//span[text()='View Cart']"));
		findElement7.click();
		Thread.sleep(2000);
		
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("D:\\Nithya\\Eclipse workspace\\Order\\screenshot\\image.png");
		FileUtils.copyFile(from,to);
		
		
	}
	

}
