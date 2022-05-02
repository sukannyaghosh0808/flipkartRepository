package com.flipkart.automationProject.FlipkartAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotClass {

	public void takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tk=(TakesScreenshot)driver;
		File file = tk.getScreenshotAs(OutputType.FILE);
		
		File destFile=new File("C:\\Users\\848870\\workspace\\FlipkartAutomation\\screenshot\\scr.png");
		
		FileUtils.copyFile(file, destFile);
	}
}
