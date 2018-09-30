package com.utilities;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchInTable extends Base{

	public static int page = 1;

	public static void searchAndClickWorkOrder(String workOrder) throws InterruptedException {
		driver.findElement(By.xpath("//a[text() = 'Start Date Time']")).click();
		boolean condition = true;

		do {

			driver.navigate().refresh();
			Thread.sleep(3000L);
		
			List<WebElement> table = driver.findElements(By.xpath(".//*[@id='MainContent_gvhoarding']/tbody/tr/td[1]"));
			int tableSize = table.size();

			for (int i = 0; i < tableSize; i++) {
				// check in last row
				if (i == tableSize - 1) {
					System.out.println("Printing page number");
					page = page + 1;
					List<WebElement> pagenumber = table.get(i).findElements(By.tagName("a"));
					int pagesize = pagenumber.size();
					for (int j = 0; j < pagesize; j++) {
						String expectedPage = String.valueOf(page);
						String pageClick = pagenumber.get(j).getText();

						if (pageClick.equals("...")) {
							condition = false;
							break;
						}
						System.out.println(pageClick);
						if (expectedPage.equals(pageClick)) {
							pagenumber.get(j).click();
							Thread.sleep(5000L);
							break;

						}
					}

				} else {
					/*String cells = "07132018012";*/
					WebElement element = table.get(i);

					String cellValue = element.findElement(By.tagName("a")).getText();
					System.out.println(cellValue);
					if (cellValue.equals(workOrder)) {
						element.findElement(By.tagName("a")).click();
						condition = false;
						break;
					}
				}
			}
		} while (condition);

	}
	
	
	
	
	

}
