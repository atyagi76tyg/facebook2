package com.frequent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandler {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();

	String window11= driver.getWindowHandle();
	Set<String> windows1= driver.getWindowHandles();
	for (String x: windows1)
	{
	if (x.equals(window11)==false){
	driver.switchTo().window(x);
	}
	
	break;
	}
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.switchTo().window(window11);

}

}
