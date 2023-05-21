package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class LearnErail {
	public static void main(String[] args) {
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--disable-notifications");
		EdgeDriver driver = new EdgeDriver(opt);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("Cape",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//Method 1:
		//find table
		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'DataTable TrainList')]"));
		//find the number of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		//find row size
		System.out.println(rows.size());
		//get data from the 1st row
		WebElement firstRow = rows.get(1);
		List<WebElement> allDataofFirstRow = firstRow.findElements(By.tagName("td"));
		//iterate through the data and print all the datas in the firstrow
		for (WebElement eachData : allDataofFirstRow) {
			String text = eachData.getText();
			//System.out.println(text);
		}
		
		//Method2:
		//to get 2nd column data
		List<WebElement> secondColumnData = driver.findElements(By.xpath("//table[contains(@class,'DataTable TrainList')]//td[2]"));
		for (WebElement trainNames : secondColumnData) {
			String text = trainNames.getText();
			//System.out.println(text);
		}
		
		//Method 3:
		for (int i = 1; i < rows.size(); i++) {
			WebElement allRows = rows.get(i);
			List<WebElement> rowdata = allRows.findElements(By.tagName("td"));
			String text = rowdata.get(1).getText();
			//System.out.println(text);
		}
		
		
		//Method 4:
		//to get all datas from the table
		for (int i = 0; i < rows.size(); i++) {
			WebElement allRows = rows.get(i);
			List<WebElement> allData = allRows.findElements(By.tagName("td"));
			for (int j = 0; j < allData.size(); j++) {
				String text = allData.get(j).getText();
				System.out.println(text);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
