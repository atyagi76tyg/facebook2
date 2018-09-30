package com.utilities;

import java.awt.AWTException;
import java.util.List;
import java.util.Set;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.sikuli.hotkey.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;




public class load extends Base {
	


	public static void main(String[] args) throws InterruptedException, AWTException, IOException, FindFailed {
	//apply loop for 2 workorder creation
		
		Base.setup();
		driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("txtUName")).sendKeys("mkg");
	    driver.findElement(By.id("txtUserPassword")).sendKeys("1");
	  	driver.findElement(By.id("imgbtnLogin")).click();
	 for (int i=0;i<=2;i++)
		{
	
	  //create new work order
	  	driver.findElement(By.id("Newlinkk")).click();
	  	Thread.sleep(5000);
	    driver.switchTo().frame("MainContent_iframeSrc");
	  	driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/input[1]")).click();
	  	driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/input[1]")).sendKeys("12345687899127");
	  	Thread.sleep(3000);
	    driver.findElement(By.id("txtRequestedBy")).sendKeys("Anjali");
	    driver.findElement(By.id("txtPhoneNo")).click();
	    driver.findElement(By.id("txtPhoneNo")).sendKeys("12345687899");
	    driver.findElement(By.id("txt_Customer_Zip")).click();
	    driver.findElement(By.id("txt_Customer_Zip")).sendKeys("65564");
	    driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[13]/td[2]/select")).click();
	    driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[13]/td[2]/select/option[7]")).click();
	    driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr[17]/td[2]/div/select/option[4]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("chkEmailUser")).click();
		driver.findElement(By.id("chkSavePrint")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[3]")).click();
		//driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[9]/div[1]/div/div/input")).sendKeys("C:\\Users\\tanjali\\Desktop\\flower.jpg");
		Thread.sleep(6000);
		
		Screen sc = new Screen();
		Pattern one = new Pattern("C:\\Users\\Anjali\\Pictures\\Camera Roll\\WIN_20150823_015619.JPG");
		
		Pattern two = new Pattern("C:\\Users\\Anjali\\Pictures\\Camera Roll\\WIN_20150823_015625.JPG");
		
		Pattern open = new Pattern("C:\\Users\\Anjali\\Desktop\\open.jpg");
		

		
		Robot r = new Robot();
		r.keyPress(Keys.C_CTRL);
		
		sc.click(one);
		sc.click(two);
		r.keyRelease(Keys.C_CTRL);
		sc.click(open);
		
		
		
		
		// driver.findElement(By.id("btnSave")).click();
		 
		 
		 
		 
		/*driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/div/span/div/button")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/div/span/div/ul/li[2]/a/label/input")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/fieldset[2]/div/table/tbody/tr[3]/td[2]/input")).click();
	    Thread.sleep(3000);
		//List<WebElement> lilist = driver.findElements(By.xpath("html/body/div[4]/ul/li"));
	    // lilist.get(3).click();
	     Thread.sleep(3000);
	     
	     //driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/fieldset[2]/div/table/tbody/tr[3]/td[3]/input")).click();
	
			//List<WebElement> lilist1 = driver.findElements(By.xpath("html/body/div[5]/ul/li"));
		     //lilist1.get(8).click();
	  
		     Thread.sleep(3000);
	     driver.findElement(By.id("btnSave")).click();
	     */
	     driver.switchTo().alert().accept();
	 	
			
		    File srec	=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("Anjali ('C:\\Users\\Anjali\\Desktop')");
			FileUtils.copyFile(srec, dest);
	     
	}
	     
	     // Checking processed WOrk order by ipad
	     
	     /*
	      * code to search work order
	      */
	     
	     SearchInTable.searchAndClickWorkOrder("08032018012");
	     //need to comment below 2 lines
	     /*driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/div/table/tbody/tr[1]/td/div/div/div[1]/div/table/tbody/tr[1]/th[1]/a")).click();
			Thread.sleep(3000);
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/div/table/tbody/tr[1]/td/div/div/div[1]/div/table/tbody/tr[6]/td[1]/a")).click();
			Thread.sleep(5000);*/
			 driver.switchTo().frame("MainContent_iframeSrc");
			//Click on work order to check assigned technician
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[2]")).click();
			//Technician Arriving time
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/div/fieldset/table/tbody/tr[1]/td/select")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/div/fieldset/table/tbody/tr[1]/td/select/option[2]")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/div/fieldset/table/tbody/tr[1]/td/select/option[3]")).click();
			Thread.sleep(3000);
			//driver.findElement(By.cssSelector("input[id=txtWOAddress']")).click();
			Thread.sleep(3000);
			//driver.findElements(By.cssSelector("input[id=email']"));
			//driver.findElement(By.cssSelector("input[id=txtWOAddress']")).sendKeys("abc");
			Thread.sleep(3000);
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[9]/div[2]/div[1]/div/div/input[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[9]/div[2]/div[1]/div/div/input[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[4]")).click();
			Thread.sleep(5000);
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[4]/div[1]/div/table/tbody/tr/td[1]/input")).sendKeys("C:\\Users\\tanjali\\Desktop\\Change order.pdf");
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[4]/div[2]/table/tbody/tr[2]/td[1]/input[1]")).click();
			Thread.sleep(3000);
			
			String window1= driver.getWindowHandle();
			Set<String> windows= driver.getWindowHandles();
			for (String x: windows)
			{
			if (x.equals(window1)==false){
			driver.switchTo().window(x);		}
			
			break;
			}
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_F11);
			robot.keyRelease(KeyEvent.VK_F11);
			//System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getTitle());
			Thread.sleep(5000);
			driver.switchTo().window(window1);
			
			Thread.sleep(3000);
			driver.switchTo().frame("MainContent_iframeSrc");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[4]/div[2]/table/tbody/tr[2]/td[1]/input[2]")).click();
			Thread.sleep(5000);
			Thread.sleep(5000);
			//driver.switchTo().alert().accept();
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[3]/input")).sendKeys("tanjali.pisoftek@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[4]/input")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		
		//https://commons.apache.org/proper/commons-io/download_io.cgi
}

	private static File dest(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}


