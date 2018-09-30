package openwebtesting;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sCROLL {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java UI Project\\chromedriver.exe");
        driver =new ChromeDriver();
 		driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
 		driver.manage().window().maximize(); 
 		driver.findElement(By.id("txtUName")).sendKeys("mkg");
	    driver.findElement(By.id("txtUserPassword")).sendKeys("1");
	  	driver.findElement(By.id("imgbtnLogin")).click();
	
	  	driver.findElement(By.id("Newlinkk")).click();
	  	Thread.sleep(3000);
	  	driver.switchTo().frame("MainContent_iframeSrc");
	  	driver.findElement(By.xpath("html/body/form/div[3]/table[2]/tbody/tr/td/ul/li[5]")).click();
		driver.findElement(By.id("IndName")).sendKeys("Anjali");
		driver.findElement(By.id("IndPhone")).sendKeys("12345687899127");
	  	
	  	Thread.sleep(5000);
		 WebElement  divElement = driver.findElement(By.xpath(".//*[@id='tabs3']"));
		 
		 JavascriptExecutor js =  (JavascriptExecutor )driver;
		 js.executeScript("arguments[0].scrollTop = arguments[1];", divElement, 250);
	}
	
//a[text() = 'ESTIMATE']	
}
