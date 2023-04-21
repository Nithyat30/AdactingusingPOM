package com.Swiggy.Order;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartusingDynamicxpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nithya\\Eclipse workspace\\Order\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--start-maximized");		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		WebElement findElement = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		findElement.click();
		
		WebElement findElement2 = driver.findElement(By.xpath("(html/body/div[1]/div/div[2]/div/div/div/a[1]/div[2])[1]"));
		findElement2.click();
		
		WebElement findElement3 = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[3]/a/img"));
		findElement3.click();
		Thread.sleep(3000);
		WebElement findElement4 = driver.findElement(By.xpath("//div[contains(text(),'Grocery')]/following::div[11]/child::a/child::div[2]/child::div/child::div[text()='Electronics']"));
		findElement4.click();
		Thread.sleep(3000);
		
//		WebElement findElement3 = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]/preceding::div[13]"));
//		findElement3.click();
		
//		div[contains(text(),'Grocery')]/following::div[11]/child::a/child::div[2]/descendant::div[1]/descendant::div
		
	}

}
