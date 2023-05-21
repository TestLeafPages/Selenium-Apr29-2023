package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
	public static void main(String[] args) throws IOException, InterruptedException {
		//to mousehover -> moveToElement()
		//In Actions class it is mandatory to call perform()
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement men = driver.findElement(By.linkText("MEN"));
		//instantiate Actions class
		Actions builder = new Actions(driver);
		//Use actions object and access the required method
		builder.moveToElement(men).perform();
		
		
	}

}
