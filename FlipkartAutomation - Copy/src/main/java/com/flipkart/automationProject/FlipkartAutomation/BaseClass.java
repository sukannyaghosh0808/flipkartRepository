package com.flipkart.automationProject.FlipkartAutomation;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass {
	
	public void grocery(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Grocery')]")).click();
		
	}
	
	public void closeWindlow(WebDriver driver)
	{
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();;
	}
	
	public void pincode(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//input[@class='_166SQN']"));
		ele.sendKeys("711104");
		ele.sendKeys(Keys.ENTER);
		
	}
	public void sugarSearch(WebDriver driver)
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("sugar");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
	}
	
	public void selectLastItem(WebDriver driver) throws InterruptedException
	{
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='_1v0EHc']"));
		int n=list.size();
		String parent=driver.getWindowHandle();
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				list.get(i).click();				
			}
		}
		
		Set<String> handles=driver.getWindowHandles();
		for(String s:handles)
		{
			if(s!=parent)
			{
				driver.switchTo().window(s);
				JavascriptExecutor js=(JavascriptExecutor)(driver);
				Thread.sleep(4000);
				js.executeScript("window.scrollBy(0,350)", "");
				
			}
		}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww _27Cjkl']")).click();;		
		
		
	}
	
	
	
	
}
