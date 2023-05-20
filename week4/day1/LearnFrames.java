 package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrames {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the frame
		driver.switchTo().frame("dummy-chat-button-iframe");
		//click the chat widget
		driver.findElement(By.id("dummy-chat-button")).click();
		//switch to another frame
		driver.switchTo().frame("ShopifyChat");
		driver.findElement(By.xpath("//div[@class='composer-bar__box']/textarea")).sendKeys("Hai");
		driver.findElement(By.xpath("//button[contains(@class,'chat-app')]")).click();
		//to come out of all the frames
		driver.switchTo().defaultContent();
		driver.findElement(By.className("product-title")).click();
		
		
		
	}

}
