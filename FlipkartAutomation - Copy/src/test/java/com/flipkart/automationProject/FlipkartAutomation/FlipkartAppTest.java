package com.flipkart.automationProject.FlipkartAutomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FlipkartAppTest 
{
	public static WebDriver driver;
	BaseClass bs;
	String url="https://www.flipkart.com/";
	
	@Test(priority=1)
	public void openURL()
	{
		DriverSetup drv = new DriverSetup();
		driver=DriverSetup.openBrowser(url);		
	}
	
	@Test(priority=2)
	public void close()
	{
		bs=new BaseClass();
		bs.closeWindlow(driver);
	}
	@Test(priority=3)
	public void grocery() throws InterruptedException
	{
		bs=new BaseClass();
		bs.grocery(driver);
	}
	@Test(priority=4)
	public void pincode() throws InterruptedException
	{
		bs=new BaseClass();
		bs.pincode(driver);
	}
	@Test(priority=5)
	public void searchForSugar() throws InterruptedException
	{
		bs=new BaseClass();
		bs.sugarSearch(driver);
	}
	@Test(priority=6)
	public void selectLastItem() throws InterruptedException
	{
		bs=new BaseClass();
		bs.selectLastItem(driver);
	}
	@Test(priority=7)
	public void takeScreenshot() throws InterruptedException, IOException
	{
		ScreenshotClass sc=new ScreenshotClass();
		sc.takeScreenshot(driver);
	}
	
}
