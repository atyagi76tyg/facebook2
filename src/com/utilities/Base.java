package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public  static void setup()
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium Java UI Project\\\\chromedriver.exe");
	     driver =new ChromeDriver();
	}
	
	

}
