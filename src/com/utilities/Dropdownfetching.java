package com.utilities;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.sun.jna.platform.unix.X11.Window;

public class Dropdownfetching {
public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		System.out.print("123");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java UI Project\\chromedriver.exe");
		System.out.print("***");
		driver = new ChromeDriver();
		System.out.print("99$$$");
		driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
		System.out.print("00.$$$");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUName")).sendKeys("mkg");
		System.out.print("0.$$$");
		driver.findElement(By.id("txtUserPassword")).sendKeys("1");
		System.out.print("1.$$$");
		driver.findElement(By.id("imgbtnLogin")).click();
		System.out.print("$$$");
		String[] arguments = new String[] {""};
	    //SearchInTable.main(arguments);
		SearchInTable obj = new SearchInTable();
		obj.serachWorkOrder("12312313");
		
		
	/
		
		String homepage= driver.getWindowHandle();
		System.out.println(homepage);
		driver.findElement(By.xpath("//*[@id='schedules']/a")).click();
		Select drpYear = new Select(driver.findElement(By.name("ctl00$MainContent$DdlYear")));
		Thread.sleep(3000);
		drpYear.selectByVisibleText("2017");
		Thread.sleep(3000);
		//taking screenshot
		
		
		
	    File srec	=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    
		File dest = new File("Anjali ('C:\\Users\\Anjali\\Desktop')");

		FileUtils.copyFile(srec,dest );
		
		Select drpMonth =new Select (driver.findElement(By.name("ctl00$MainContent$DdlMonths")));
		Thread.sleep(3000);
		drpMonth.selectByVisibleText("November");
		Thread.sleep(3000);
		
		
		
		 /*driver.findElement(By.id("Newlinkk")).click();
	 	Thread.sleep(3000);
	    driver.switchTo().frame("MainContent_iframeSrc");
	 	Thread.sleep(3000);
	 	driver.findElement(By.xpath("//*[@id='frmCreateWorkOrder']/div[3]/table[2]/tbody/tr/td/ul/li[2]")).click();
	 	driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/fieldset[2]/div/table/tbody/tr[3]/td[2]/input")).click();
	    Thread.sleep(3000);
		List<WebElement> lilist = driver.findElements(By.xpath("html/body/div[4]/ul/li"));
	     lilist.get(3).click();*/
	     
	    /* String popup= driver.getWindowHandle();
	     System.out.println(popup);
	     
	     Set<String> windows1= driver.getWindowHandles();
	     System.out.println(Window.SIZE);
	     Set<String> handles = null;
		Iterator<String> iterator = handles.iterator();
		String currentwindowID;
		
	     while (iterator.hasNext()){
	         Object subWindowHandler = iterator.next();
	         driver.switchTo().window((String) subWindowHandler);

	         System.out.println(subWindowHandler);
	     }


	     String parentWindowHandler;
		driver.switchTo().window(parentWindowHandler); 
	     */
	     
	     

	     //driver.switchTo().defaultContent();
	     
	     /*Code to Select Dropbox
	     Import the package "Select"
	     ; */
	  


}


	private static Object OutputType(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
