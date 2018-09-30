package Dropdown;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownNotSelectTag {
	
	public static void mainSelect(Set<String> set) {
		
		WebDriver driver = new ChromeDriver();
		WebElement element = driver.findElement(By.xpath(".//*[@id='UpdatePanel2']/span/div/button"));
		 List<WebElement> list = element.findElements(By.tagName("a"));
		 
		 for(int i = 0;i<=list.size();i++)
		 {
			 set.contains(list.get(i).getText());
			 list.get(i).click();
			 
		 }
/*		 
		String mainPageWindow =  driver.getWindowHandle();
		
		Set<String> allWindow =	driver.getWindowHandles();
		 
		driver.switchTo().window(arg0);*/
		 
		 WebElement  divElement = driver.findElement(By.xpath(".//*[@id='tabs3']"));
		 
		 JavascriptExecutor js =  (JavascriptExecutor )driver;
		  js.executeScript("arguments[0].scrollTop = arguments[1];", divElement, 250);
	}
	
	
	
	
	
}
