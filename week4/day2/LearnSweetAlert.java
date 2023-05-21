package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnSweetAlert {
	public static void main(String[] args) throws InterruptedException {
//		a)Launch the browser
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
//	b)Load the url https://www.irctc.co.in/nget/train-search
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	c)Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
//	d)Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input")).sendKeys("Cape");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
//	e)Click search button 
		driver.findElement(By.xpath("//button[text()='Search']")).click();
//	f)Click refresh button
		driver.findElement(By.xpath("//div[contains(text(),'Refresh')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'WL')]")).click();
//	g)Click WL and Click BookNow button
		driver.findElement(By.xpath("//button[contains(text(),'Book Now')]")).click();
//	e)Click No button in the alert
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='No']")).click();
	}

}
