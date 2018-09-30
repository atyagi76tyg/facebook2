package openwebtesting;

import static org.testng.Assert.fail;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchInInTable {
	public static WebDriver driver;
	public static int page = 1;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Java UI Project\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://cleannet.stericleaninc.com/hoardersQA/index.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUName")).sendKeys("mkg");
		driver.findElement(By.id("txtUserPassword")).sendKeys("1");
		driver.findElement(By.id("imgbtnLogin")).click();

		boolean condition = true;

		do {
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
					String cells = "07132018012";
					WebElement element = table.get(i);

					String cellValue = element.findElement(By.tagName("a")).getText();
					System.out.println(cellValue);
					if (cellValue.equals(cells)) {
						element.findElement(By.tagName("a")).click();
						condition = false;
						break;
					}
				}
			}
		} while (condition);

	}
	
/*	public void serachWorkOrder(String workOrder)
	{
		//code
		
		SearchInTable obj = new SearchInTable();
		obj.serachWorkOrder("123456789");
	}*/
	
	
	

}
