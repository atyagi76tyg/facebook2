package com.utilities;
import java.awt.AWTException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class schedule {
	
	public Actions action;
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java UI Project\\chromedriver.exe");

		driver =new ChromeDriver();
		driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUName")).sendKeys("Admin");
		driver.findElement(By.id("txtUserPassword")).sendKeys("password");
	  	driver.findElement(By.id("imgbtnLogin")).click();
	  	driver.findElement(By.xpath("//*[@id='schedules']/a")).click();
		Select drpYear = new Select(driver.findElement(By.name("ctl00$MainContent$DdlYear")));
		Thread.sleep(3000);
		drpYear.selectByVisibleText("2018");
		Thread.sleep(3000);
		Select drpMonth =new Select (driver.findElement(By.name("ctl00$MainContent$DdlMonths")));
		Thread.sleep(3000);
		drpMonth.selectByVisibleText("June");
		Thread.sleep(3000);
		//August
		//driver.findElement(By.cssSelector("#btnGo")).click();
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector(".multiselect.dropdown-toggle.btn.btn-default")).click();
		//List<WebElement> lilist1 = driver.findElements(By.xpath(".multiselect.dropdown-toggle.btn.btn-default"));
		//lilist1.get(3).click();
		
		
		Set<String> set = new HashSet<String>();
		set.add("BIOHAZARD");
		set.add("MEETING");
		
		mainSelect(set);
		
		driver.findElement(By.id("MainContent_tfbutton")).click();
		
		/*
		//Mouse hover in selenium webdriver
		
		   //hover.accept(By.linkText("Dropdown"));
	        //hover.accept(By.linkText("Dropdown Link 5"));
	        
	        //Create event= right click
		
		Actions actions = new Actions(driver);
		
		actions.contextClick(driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/div/div/table/tbody/tr/td/div"))).perform();
		
		//sometimes its hover WO  and sometimes open new event and some shows delete 
		
		// need to close window and need to hover on created events -- Also I need to create WO
		
		
		//It did right click other query what is sizzle
		Thread.sleep(3000); 	
		driver.findElement(By.cssSelector("#ticket")).click();
	        		
		Thread.sleep(3000); 	
		
		//Refresh and lookup
		//driver.findElement(By.cssSelector(".tftextinput")).click();  //how can we call from text  and name
		driver.findElement(By.cssSelector(".tftextinput")).sendKeys("s");
		driver.findElement(By.cssSelector(".tfbutton")).click();
		//driver.findElement(By.cssSelector(".#CustomerName")).click(); Why its not Picking by css selector
		Thread.sleep(3000);
		//driver.findElement(By.linkText("#CustomerName")).click(); need to remove comment to check
		Thread.sleep(3000); 
		//driver.findElement(By.cssSelector("#btnCancel")).click();
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#system")).click();
		//driver.findElement(By.cssSelector("#MainContent_btnAdd")).click();
		Thread.sleep(3000); 
		driver.findElement(By.cssSelector("#ddlFranchise")).click();
		Thread.sleep(3000); 
		
		List<WebElement> lilist = driver.findElements(By.cssSelector("#ddlFranchise>option"));
		 lilist.get(7).click();
			Thread.sleep(3000); 
			
		driver.switchTo().frame("MainContent_iframeSrc.iframe");
		
		//MainContent_iframeSrc
		Thread.sleep(3000); 
		//driver.findElement(By.cssSelector("###txtUsername")).sendKeys("atyagi");
		Thread.sleep(3000); 
		
		 driver.findElement(By.cssSelector("input[id=txtWOAddress']")).click();
		 Thread.sleep(3000);
		 //driver.findElements(By.cssSelector("input[id=email']"));
*/		 

}
public static void mainSelect(Set<String> set) throws InterruptedException {
		
		driver.findElement(By.xpath(".//*[@id='UpdatePanel2']/span/div/button")).click();
		Thread.sleep(2000L);
		WebElement element = driver.findElement(By.xpath(".//*[@id='UpdatePanel2']/span/div/ul"));
		 List<WebElement> list = element.findElements(By.tagName("a"));
		 
		 for(int i = 0;i<list.size();i++)
		 {
			if( set.contains(list.get(i).getText()))
			{
			 list.get(i).click();
				Thread.sleep(2000L);
			}
			 
		 }
		 driver.findElement(By.xpath(".//*[@id='MainContent_txtSearch']")).click();
	}
	
	


}
