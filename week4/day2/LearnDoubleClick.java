package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//switch to the frame
		driver.switchTo().frame("iframeResult");
		WebElement doudbleClickEle = driver.findElement(By.xpath("//p[contains(text(),'Double')]"));
		//To double click on a webelment -> doubleClick() from Actions class
		Actions builder = new Actions(driver);
		builder.doubleClick(doudbleClickEle).perform();
		
		
		
	}

}
