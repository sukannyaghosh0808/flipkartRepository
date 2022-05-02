package com.flipkart.automationProject.FlipkartAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup 
{
	public static WebDriver driver;
	
    public static WebDriver openBrowser(String url)
    {
    	String driverPath = "C:\\Users\\848870\\workspace\\FlipkartAutomation\\Driver\\chromedriver.exe"; 
        System.setProperty("webdriver.chrome.driver", driverPath);
        
        driver = new ChromeDriver();
        
        driver.get(url);
        
        driver.manage().window().maximize();
        
        return driver;
    }
    
}
