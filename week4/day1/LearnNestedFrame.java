 package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnNestedFrame {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the frame
		driver.switchTo().frame(2);
		//switch to the nested frame
		WebElement nestedFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(nestedFrame);
		driver.findElement(By.id("Click")).click();
		
	}

}
