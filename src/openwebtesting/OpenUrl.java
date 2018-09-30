package openwebtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utilities.SearchInTable;


public class OpenUrl {
	Robot frequentlyUsedRobot;
	/*public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java UI Project\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("")).sendKeys("C:\\Users\\Anjali\\Pictures\\Camera Roll");
	
	driver.switchTo().alert().accept();*/
	@Test(priority=1,description="This test will initialize chrome browser in maximized mode")
	public class Steri_clean_Webversion 
	{
		public WebDriver driver;
	     //private By driver;

		public void BI()
	     {
	    	 System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java UI Project\\chromedriver.exe");
	        driver =new ChromeDriver();
	 		driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
	 		driver.manage().window().maximize(); 
	 		
	     }
		
		@Test(priority=2,description="This test will verify login in steri-clean App")
	public void SteriCleanlogin ()
	     {
		
			driver.findElement(By.id("txtUName")).sendKeys("mkg");
		    driver.findElement(By.id("txtUserPassword")).sendKeys("1");
		  	driver.findElement(By.id("imgbtnLogin")).click();
		
	 	  	}
		
		@Test(priority=3,description="This test will process a Call Taker Module")
		
		public void Calltaker () throws InterruptedException
		{
			driver.findElement(By.id("Newlinkk")).click();
		  	Thread.sleep(5000);
		    driver.switchTo().frame("MainContent_iframeSrc");
			Thread.sleep(5000);
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
			driver.findElement(By.id("chkEmailUser")).click();
			driver.findElement(By.id("chkSavePrint")).click();
			
		}
		
		@Test(priority=4,description="This test will process a work order for ipad")
		public void workorderassignment () throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath(".//*[@id='AddTicket']/body/div[4]/ul/li[4]")).click();
			Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/div/span/div/button")).click();
		driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/table/tbody/tr[1]/td/div/span/div/ul/li[2]/a/label/input")).click();
		
		}
	
		  	
		@Test(priority=5,description="This test will upload photo in processed work order")
		
		public void workorderphoto () throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[3]")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[9]/div[1]/div/div/input")).sendKeys("C:\\Users\\tanjali\\Desktop\\flower.jpg");
			Thread.sleep(6000);
			
		}
		
		@Test(priority=6,description="This test will display that we have no estimate fields available for new work order in Web version")
		public void workorderestimate  () throws InterruptedException
		{
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[4]")).click();
		}
		
		@Test(priority=7,description="This test will do payments in processed work order ")
		public void workorderpayments  () throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[7]")).click();
			driver.findElement(By.id("txtDepositAmt")).sendKeys("5000");
			Thread.sleep(3000);
			driver.findElement(By.id("btnAcceptPayment")).click();
			Thread.sleep(3000);
		}
		
		@Test(priority=8,description="This test will display that we have no supplies fields available for new work order in Web version")
		public void workordersupplies  () throws InterruptedException
		{
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[6]")).click();
		}
		
		@Test(priority=9,description="This test will display that we have no processing regarding receipts for new work order in Web version")
		public void workorderreceipts  () throws InterruptedException
		{
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[8]")).click();
			Thread.sleep(3000);
			
		}
		
		@Test(priority=10,description="This test will display that we have no invoice for new work order in Web version")
		public void workorderinvoice  () throws InterruptedException
		{
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[9]")).click();
			Thread.sleep(3000);
		}
		
		@Test(priority=11,description="This test will display that we have no forms for new work order in Web version")
		public void workorderform  () throws InterruptedException
		{
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[10]")).click();
		}
		
		@Test(priority=12,description="This test will display billing process for work order ")
		public void workorderbilling  () throws InterruptedException
		{
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[5]")).click();
			driver.findElement(By.id("IndName")).sendKeys("Anjali");
			driver.findElement(By.id("IndPhone")).sendKeys("12345687899127");
			driver.findElement(By.id("IndEmail")).sendKeys("tanjali1@pisoftek.com");
			driver.findElement(By.id("IndStreet")).sendKeys("Inderpuri");
			driver.findElement(By.id("IndCity")).sendKeys("Delhi");
			driver.findElement(By.id("IndState")).sendKeys("Delhi");
			driver.findElement(By.id("IndCountry")).sendKeys("India");
			driver.findElement(By.id("IndZip")).sendKeys("65564");
			driver.findElement(By.id("IndInvolvement")).sendKeys("transfer");
			driver.findElement(By.id("financhor")).click();
			driver.findElement(By.id("chkFinancially")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[3]/tbody/tr/td/input[1]")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			 WebElement  divElement = driver.findElement(By.xpath(".//*[@id='tabs3']"));
			 
			 JavascriptExecutor js =  (JavascriptExecutor )driver;
			  js.executeScript("arguments[0].scrollTop = arguments[1];", divElement, 250);
			
		}
		
		@Test(priority=13,description="Check Work order processed by ipad")
		public void ipadworkorder   () throws InterruptedException
		{
		
		
		
		
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/div/table/tbody/tr[1]/td/div/div/div[1]/div/table/tbody/tr[1]/th[1]/a")).click();
			Thread.sleep(3000);
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/div[3]/div[2]/div/table/tbody/tr[1]/td/div/div/div[1]/div/table/tbody/tr[6]/td[1]/a")).click();
			Thread.sleep(5000);
			driver.switchTo().frame("MainContent_iframeSrc");
			//Click on work order to check assigned technician
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[2]")).click();
			//Technician Arriving time
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/div/fieldset/table/tbody/tr[1]/td/select")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/div/fieldset/table/tbody/tr[1]/td/select/option[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[2]/div/fieldset/table/tbody/tr[1]/td/select/option[3]")).click();
			
			
		}
		
		@Test(priority=14,description="Check photos in processed work order by ipad")
		public void ipadworkorderphoto   () throws InterruptedException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[3]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[9]/div[2]/div[1]/div/div/input[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[9]/div[2]/div[1]/div/div/input[3]")).click();
			
		}
		
		@Test(priority=15,description="View estimate details genertated by ipad ")
		public void ipadworkorderestimate   () throws InterruptedException, AWTException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[4]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[4]/div[2]/table/tbody/tr[2]/td[1]/input[1]")).click();
			Thread.sleep(3000);
			
			String window1= driver.getWindowHandle();
			Set<String> windows= driver.getWindowHandles();
			for (String x: windows)
			{
			if (x.equals(window1)==false){
			driver.switchTo().window(x);
			}
			
			break;
			}
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			if (frequentlyUsedRobot == null) {
				frequentlyUsedRobot = new Robot();
			}
			frequentlyUsedRobot.keyPress(KeyEvent.VK_F11);
			frequentlyUsedRobot.keyRelease(KeyEvent.VK_F11);
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
		}
		
		@Test(priority=16,description="View Billing details genertated by ipad ")
		public void ipadworkorderbilling   () throws InterruptedException, AWTException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[5]")).click();
			Thread.sleep(6000);	
		}
		
		@Test(priority=17,description="View Supplies details genertated by ipad ")
		public void ipadworkordersupplies   () throws InterruptedException, AWTException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[6]")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[7]/div/table/tbody/tr[2]/td[1]/input[1]")).click();
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
			//System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getTitle());
			if (frequentlyUsedRobot == null) {
				frequentlyUsedRobot = new Robot();
			}
			frequentlyUsedRobot.keyPress(KeyEvent.VK_F11);
			frequentlyUsedRobot.keyRelease(KeyEvent.VK_F11);
			Thread.sleep(3000);
			driver.switchTo().window(window11);
			
			Thread.sleep(3000);
			driver.switchTo().frame("MainContent_iframeSrc");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[7]/div/table/tbody/tr[2]/td[1]/input[2]")).click();
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[3]/input")).sendKeys("tanjali.pisoftek@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[4]/input")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}
		
		@Test(priority=18,description="View Payments details genertated by ipad ")
		public void ipadworkorderpayments   () throws InterruptedException, AWTException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[7]")).click();
		}
		
		@Test(priority=19,description="View receipts details genertated by ipad ")
		public void ipadworkorderreceipts   () throws InterruptedException, AWTException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[8]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[8]/div[2]/table/tbody/tr[2]/td[1]/input[1]")).click();
			Thread.sleep(3000);
			String window111= driver.getWindowHandle();
			Set<String> windows11= driver.getWindowHandles();
			for (String x: windows11)
			{
			if (x.equals(window111)==false){
			driver.switchTo().window(x);
			}
			
			break;
			}
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getTitle());
			driver.switchTo().window(window111);
			
			Thread.sleep(3000);
			driver.switchTo().frame("MainContent_iframeSrc");
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[8]/div[2]/table/tbody/tr[2]/td[1]/input[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[3]/input")).sendKeys("tanjali.pisoftek@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[4]/input")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}
		
		@Test(priority=20,description="View invoice details genertated by ipad ")
		public void ipadworkorderinvoice   () throws InterruptedException, AWTException
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[9]")).click();
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[5]/div[2]/table/tbody/tr[2]/td[1]/input[1]")).click();
			String window1111= driver.getWindowHandle();
			Set<String> windows111= driver.getWindowHandles();
			for (String x: windows111)
			{
			if (x.equals(window1111)==false){
			driver.switchTo().window(x);
			}
			
			break;
			}
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getTitle());
			driver.switchTo().window(window1111);
			
			Thread.sleep(3000);
			driver.switchTo().frame("MainContent_iframeSrc");
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[5]/div[2]/table/tbody/tr[2]/td[1]/input[2]")).click();
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[3]/input")).sendKeys("tanjali.pisoftek@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[4]/input")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
		}
		
		@Test(priority=21,description="View forms details genertated by ipad ")
		public void ipadworkorderform   () throws InterruptedException, AWTException
		{
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[10]")).click();
			Thread.sleep(3000);
		    driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[10]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/input[1]")).click();
			Thread.sleep(3000);
			String window11111= driver.getWindowHandle();
			Set<String> windows1111= driver.getWindowHandles();
			for (String x: windows1111)
			{
			if (x.equals(window11111)==false){
			driver.switchTo().window(x);
			}
			
			break;
			}
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			//System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getTitle());
			driver.switchTo().window(window11111);
			
			Thread.sleep(3000);
			driver.switchTo().frame("MainContent_iframeSrc");
			driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/div[10]/table/tbody/tr[2]/td/div/table/tbody/tr/td[1]/input[2]")).click();
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[3]/input")).sendKeys("tanjali.pisoftek@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("html/body/form/div[5]/div/div[4]/input")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.close();
		}
		
		
	
	}
	

}
