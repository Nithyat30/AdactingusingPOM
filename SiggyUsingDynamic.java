package com.Swiggy.Order;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SiggyUsingDynamic {

public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\Order\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		
		WebElement findElement = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/div/input[@type='text']"));
		findElement.sendKeys("chrompet chennai");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement findElement2 = driver.findElement(By.xpath("/html/body/div/div/header/div/div/ul/li/div/a/span[text()='Search']"));
		findElement2.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div/input"));
		findElement3.sendKeys("Shawarma");
		Thread.sleep(2000);
		WebElement findElement4 = driver.findElement(By.xpath("(//b[contains(text(),'Shawarma')])[1]//preceding::div[2]"));
		findElement4.click();
		Thread.sleep(2000);
		//findElement4.sendKeys("Shawarma roll");
		
		WebElement findElement5 = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div/input"));
		findElement5.sendKeys("shawarma");
		Thread.sleep(2000);
		
		WebElement findElement6 = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/button/div/div/b[contains(text(),'Shawarma')])[4]"));
		findElement6.click();
		
		WebElement findElement7 = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
		findElement7.click();
		
		WebElement findElement8 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div[2]/span[2]"));
		findElement8.click();
		
		WebElement findElement9 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div/ul/li[1]/div/div/div/a/span[1]"));
		findElement9.click();
		
}
}